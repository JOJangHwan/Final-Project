package com.example.virus_confirmation_management_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class user_MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_activity_main);

        Button virusinformation_button = (Button) findViewById(R.id.virusinformation_button);
        virusinformation_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_virusinformationlist.class);
                startActivity(intent);
            }
        });

        Button selftest_button = (Button) findViewById(R.id.selftest_button);
        selftest_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_selftest.class);
                startActivity(intent);
            }
        });

        Button govguid_button = (Button) findViewById(R.id.govguid_button);
        govguid_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_govguide.class);
                startActivity(intent);
            }
        });


        Button QandA_button = (Button) findViewById(R.id.QandA_button);
        QandA_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_QandA.class);
                startActivity(intent);
            }
        });

        Button nearhosfind_button = (Button) findViewById(R.id.nearhosfind_button);
        nearhosfind_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_nearhosfind.class);
                startActivity(intent);
            }
        });


        Button  myvaccine_button = (Button) findViewById(R.id.myvaccine_button);
        myvaccine_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_myvaccine.class);
                startActivity(intent);
            }
        });
    }
}