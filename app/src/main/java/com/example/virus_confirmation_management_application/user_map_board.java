package com.example.virus_confirmation_management_application;

import static com.example.virus_confirmation_management_application.user_Frag2.a;
import static com.example.virus_confirmation_management_application.user_bottomnavi.pagedata;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/*
    gramer : 윤승준  DB까지 개시판 구현 완료
 */
public class user_map_board extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<user_map_board_comment_item> user_map_board_comment_item;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;
    private DatabaseReference databaseReference_add;

    private DatabaseReference mDatabase;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_map_board);



        //String Boardlocation = getIntent().getStringExtra("Boardlocation");
        String Board_tittle = getIntent().getStringExtra("Board_tittle");
        String Board_date = getIntent().getStringExtra("Board_date");
        String User_id = getIntent().getStringExtra("User_id");
        String User_content = getIntent().getStringExtra("User_content");
        final String index = getIntent().getStringExtra("index");
        String region = getIntent().getStringExtra("region");

        TextView title_tv = (TextView) findViewById(R.id.title_tv);
        TextView date_tv = (TextView) findViewById(R.id.date_tv);
        TextView userid_tv = (TextView) findViewById(R.id.userid_tv);
        TextView content_tv = (TextView) findViewById(R.id.content_tv);

        title_tv.setText(Board_tittle);
        date_tv.setText(Board_date);
        userid_tv.setText(User_id.substring(0,2)+"**");
        content_tv.setText(User_content);




        mRecyclerView = (RecyclerView) findViewById(R.id.comment_recyclerView);
        mRecyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        user_map_board_comment_item =new ArrayList<>();

        database =FirebaseDatabase.getInstance();

        databaseReference =database.getReference("board").child(region).child(index);
            databaseReference.child("cm").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    user_map_board_comment_item.clear();
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        user_map_board_comment_item board = snapshot.getValue(user_map_board_comment_item.class);//불러오기 오류
                        user_map_board_comment_item.add(board);

                    }
                    adapter.notifyDataSetChanged();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    Log.e("MainActivity", String.valueOf(error.toException())); // 에러문 출력

                }
            });





        mDatabase = FirebaseDatabase.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();
        final FirebaseUser user = mAuth.getCurrentUser();
        databaseReference_add = FirebaseDatabase.getInstance().getReference();

        Button add_reg_button = (Button)findViewById(R.id.reg_button);
        add_reg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText comment_et = (EditText)findViewById(R.id.comment_et);

                if ( comment_et.getText().toString().length() == 0 )
                {
                    //빈칸일때

                }
                else {
                    //실행
                    databaseReference_add.child("board").child(region).child(index).child("i").child("index").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            int value = (int)snapshot.getValue(Integer.class);
                            final int  asd =value;
                            value +=1;//숫자를 1 증가시켜서
                            String in_index = String.valueOf (asd);
                            databaseReference_add.child("board").child(region).child(index).child("chattingnum").setValue(String.valueOf (asd));//저장
                            databaseReference_add.child("board").child(region).child(index).child("i").child("index").setValue(value);//저장


                            String content=comment_et.getText().toString();
                            mDatabase.child("board").child(region).child(index).child("cm").child(in_index).child("content").setValue(content);

                            SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm");
                            Calendar calendar = Calendar.getInstance();
                            Date date = calendar.getTime();
                            sdf.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
                            String dateResult = sdf.format(date);

                            //String getTime = dateFormat.format(date);
                            mDatabase.child("board").child(region).child(index).child("cm").child(in_index).child("Time").setValue(dateResult);
                            mDatabase.child("board").child(region).child(index).child("cm").child(in_index).child("name").setValue(user.getEmail());

                            comment_et.setText("");

                            Window window = getWindow();
                            new WindowInsetsControllerCompat(window, window.getDecorView()).hide(WindowInsetsCompat.Type.ime());
                            databaseReference =database.getReference("board").child(region).child(index);
                            databaseReference.child("cm").addListenerForSingleValueEvent(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                    user_map_board_comment_item.clear();
                                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                                        user_map_board_comment_item board = snapshot.getValue(user_map_board_comment_item.class);//불러오기 오류
                                        user_map_board_comment_item.add(board);

                                    }
                                    adapter.notifyDataSetChanged();
                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {
                                    Log.e("MainActivity", String.valueOf(error.toException())); // 에러문 출력

                                }
                            });

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {
                            //Log.e("MainActivity", String.valueOf(databaseError.toException()));
                        }



                    });



                }

            }
        });
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_map:
                        pagedata=0;
                        Intent intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.action_main:
                        pagedata=1;
                        a=0;
                        intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.action_person:
                        pagedata=2;
                        intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                }
                return true;
            }
        });


        adapter =new user_map_board_comment_CustomAdapter(user_map_board_comment_item,this);
        mRecyclerView.setAdapter(adapter);

    }



}
