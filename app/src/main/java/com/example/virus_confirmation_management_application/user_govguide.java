package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class user_govguide extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_govguide_activity);

        Button button_gogu1 = (Button) findViewById(R.id.button_gogu1);
        button_gogu1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), user_govguide_distanving.class);
                startActivity(intent);
            }
        });

        Button button_gogu2 = (Button) findViewById(R.id.button_gogu2);
        button_gogu2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), user_govguide_gogu2.class);
                startActivity(intent);
            }
        });

        Button button_gogu3 = (Button) findViewById(R.id.button_gogu3);
        button_gogu3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), user_govguide_gogu3.class);
                startActivity(intent);
            }
        });

        Button button_gogu4 = (Button) findViewById(R.id.button_gogu4);
        button_gogu4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), user_govguide_gogu4.class);
                startActivity(intent);
            }
        });

        Button button_gogu5 = (Button) findViewById(R.id.button_gogu5);
        button_gogu5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), user_govguide_gogu5.class);
                startActivity(intent);
            }
        });

        Button button_gogu6 = (Button) findViewById(R.id.button_gogu6);
        button_gogu6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), user_select_country.class);
                startActivity(intent);
            }
        });








    }
}

