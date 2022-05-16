package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class user_select_country extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_select_country);


        ImageView imageview = (ImageView)findViewById(R.id.koreaflag);
        imageview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_govguide.class);
                startActivity(intent);

            }
        });

        ImageView imageview2 = (ImageView)findViewById(R.id.anothercontury);
        imageview2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent intent = new Intent(getApplicationContext(),.class);
                //startActivity(intent);

            }
        });

    }

}