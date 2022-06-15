package com.example.virus_confirmation_management_application;

import static com.example.virus_confirmation_management_application.user_Frag2.a;
import static com.example.virus_confirmation_management_application.user_bottomnavi.pagedata;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class user_map_board extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private user_map_board_comment_CustomAdapter mboardcommentCustomAdapter;
    private ArrayList<user_map_board_comment_item> user_map_board_comment_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_map_board);

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


        //String Boardlocation = getIntent().getStringExtra("Boardlocation");
        String Board_tittle = getIntent().getStringExtra("Board_tittle");
        String Board_date = getIntent().getStringExtra("Board_date");
        String User_id = getIntent().getStringExtra("User_id");
        String User_content = getIntent().getStringExtra("User_content");


        TextView title_tv = (TextView) findViewById(R.id.title_tv);
        TextView date_tv = (TextView) findViewById(R.id.date_tv);
        TextView userid_tv = (TextView) findViewById(R.id.userid_tv);
        TextView content_tv = (TextView) findViewById(R.id.content_tv);

        title_tv.setText(Board_tittle);
        date_tv.setText(Board_date);
        userid_tv.setText(User_id.substring(0,2)+"**");
        content_tv.setText(User_content);

        ImageView imageview = (ImageView)findViewById(R.id.imageView6);
        imageview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "좋아요을 눌르셧습니다..", Toast.LENGTH_SHORT).show();
            }
        });

        mRecyclerView = (RecyclerView) findViewById(R.id.comment_recyclerView);

        /* initiate adapter */
        mboardcommentCustomAdapter= new user_map_board_comment_CustomAdapter();
        /* initiate recyclerview */
        mRecyclerView.setAdapter(mboardcommentCustomAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        /* adapt data */
        user_map_board_comment_item = new ArrayList<>();
        for(int i=1;i<=3;i++){
            user_map_board_comment_item.add(new user_map_board_comment_item(i,i+"번째 내용",i+"번째아이디",i+"번째 날짜"));

        }
        mboardcommentCustomAdapter.setMboardcommentIteArrayList(user_map_board_comment_item);



    }



}
