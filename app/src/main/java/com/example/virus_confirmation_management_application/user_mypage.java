package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class user_mypage  extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_mypage_activity);



        Button checkwirth_button = (Button) findViewById(R.id.checkwirth_button);
        checkwirth_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_checkwirhlist.class);
                startActivity(intent);
            }
        });

        Button announce_button = (Button) findViewById(R.id.announce_button);
        announce_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_announce.class);
                startActivity(intent);
            }
        });


        Button  mystatereport_button= (Button) findViewById(R.id.mystatereport_button);
        mystatereport_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_mystatereportlist.class);
                startActivity(intent);
            }
        });


        Button  addfamily_button= (Button) findViewById(R.id.addfamily_button);
        addfamily_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),user_addfamily.class);
                startActivity(intent);
            }
        });
    }
}