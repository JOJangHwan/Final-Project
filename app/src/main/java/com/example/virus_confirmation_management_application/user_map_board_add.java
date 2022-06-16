package com.example.virus_confirmation_management_application;

import static com.example.virus_confirmation_management_application.user_Frag2.a;
import static com.example.virus_confirmation_management_application.user_bottomnavi.pagedata;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
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
import java.util.Date;
/*
    gramer : 윤승준  DB까지 개시판 구현 완료
 */
public class user_map_board_add extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private user_map_boardlist_CustomAdapter mboardlistCustomAdapter;
    private ArrayList<user_map_boardlist_item> user_map_boardlist_item;
    private DatabaseReference mDatabase;
    private FirebaseAuth mAuth;
    private DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_map_board_add);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        databaseReference = FirebaseDatabase.getInstance().getReference();

        String data = getIntent().getStringExtra("data");

        mAuth = FirebaseAuth.getInstance();

        final FirebaseUser user = mAuth.getCurrentUser();

        Button add_reg_button = (Button)findViewById(R.id.add_reg_button);
        add_reg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText add_title_et = (EditText)findViewById(R.id.add_title_et);
                EditText add_content_et = (EditText)findViewById(R.id.add_content_et);

                if ( add_title_et.getText().toString().length() == 0 || add_content_et.getText().toString().length() == 0)
                {
                    //빈칸일때

                }
                else {
                    int index;
                    //실행
                    databaseReference.child("board").child(data+"index").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            int value = (int)snapshot.getValue(Integer.class);//저장된 값을 숫자로 받아오고
                            final int  asd =value;
                            value +=1;//숫자를 1 증가시켜서
                            String index = String.valueOf (asd);
                            databaseReference.child("board").child(data+"index").setValue(value);//저장


                            String tittle=add_title_et.getText().toString();
                            String content=add_content_et.getText().toString();
                            mDatabase.child("board").child(data).child(index).child("tittle").setValue(tittle);
                            mDatabase.child("board").child(data).child(index).child("content").setValue(content);
                            mDatabase.child("board").child(data).child(index).child("index").setValue(index);
                            mDatabase.child("board").child(data).child(index).child("chattingnum").setValue("0");

                            mDatabase.child("board").child(data).child(index).child("i").child("index").setValue(1);

                            long now = System.currentTimeMillis();
                            Date date = new Date(now);
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
                            String getTime = dateFormat.format(date);
                            mDatabase.child("board").child(data).child(index).child("Time").setValue(getTime);
                            mDatabase.child("board").child(data).child(index).child("name").setValue(user.getEmail());



                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {
                            //Log.e("MainActivity", String.valueOf(databaseError.toException()));
                        }



                    });




                    Intent intent = new Intent(getApplicationContext(),user_map_boardlist.class);
                    intent.putExtra("tittle", data);

                    startActivity(intent);
                    finish();

                }

            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_map:
                        pagedata = 0;
                        Intent intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.action_main:
                        pagedata = 1;
                        a = 0;
                        intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.action_person:
                        pagedata = 2;
                        intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                }
                return true;
            }
        });






    }
}
