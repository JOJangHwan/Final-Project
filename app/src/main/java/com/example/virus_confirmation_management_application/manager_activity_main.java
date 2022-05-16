package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class manager_activity_main extends AppCompatActivity {

    private Button button_move;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_activity_main);



        button_move = findViewById(R.id.button_se); // 서울
        button_move.setOnClickListener(new View.OnClickListener() {
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