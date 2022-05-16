package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class manager_activity_virus_mana extends AppCompatActivity {

    private Button button_move;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_activity_virus_mana);

        button_move = findViewById(R.id.button_vi_power); // 전파력
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(manager_activity_virus_mana.this,manager_activity_viral_transmissin_power.class); //현재 위치와 이동할 위치의 인자
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = findViewById(R.id.button_vi_iso); // 전파력
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(manager_activity_virus_mana.this, manager_activity_virus_isolation_period.class); //현재 위치와 이동할 위치의 인자
                startActivity(intent); // 액티비티 이동 구문
            }
        });
    }








}