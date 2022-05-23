package com.example.virus_confirmation_management_application;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


public class manager_activity_main extends AppCompatActivity {

    private Button button_move;
    private Button button_move_se;
    private Button button_jeju;
    private ImageView image_jeju;
    private ImageView image_seoul;

    ImageView imageView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_activity_main);

        View v = ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.manager_activity_main, null, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);


        button_jeju = findViewById(R.id.button_jeju);
        button_jeju.setBackgroundColor(Color.parseColor("#00ff0000"));
        image_jeju = findViewById(R.id.image_jeju);
        image_jeju.setColorFilter(Color.parseColor("#55ff0000"));

        button_move_se = findViewById(R.id.button_se); // 서울
        button_move_se.setBackgroundColor(Color.parseColor("#00ff0000"));
        image_seoul = findViewById(R.id.image_seoul);
        image_seoul.setColorFilter(Color.parseColor("#55ff0000"));
        button_move_se.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(manager_activity_main.this, manager_activity_gogu_1.class); //현재 위치와 이동할 위치의 인자
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = findViewById(R.id.button_gy); // 경기도
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(manager_activity_main.this, manager_activity_gogu_2.class); //현재 위치와 이동할 위치의 인자
                startActivity(intent); // 액티비티 이동 구문
            }
        });


        button_move = findViewById(R.id.button_ch1); // 경기도
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(manager_activity_main.this, manager_activity_gogu_3.class); //현재 위치와 이동할 위치의 인자
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = findViewById(R.id.button_in); // 경기도
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(manager_activity_main.this, manager_activity_gogu_4.class); //현재 위치와 이동할 위치의 인자
                startActivity(intent); // 액티비티 이동 구문
            }
        });
    }


}