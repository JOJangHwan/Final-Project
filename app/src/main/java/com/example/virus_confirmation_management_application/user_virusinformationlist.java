package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class user_virusinformationlist  extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_virusinformationlist_activity);


        Button H1N1_button = (Button)findViewById(R.id.H1N1_button);
        H1N1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_virusinformation.class);
                intent.putExtra("gettitle","신종플루");
                startActivity(intent);
            }
        });

        Button mers_button1 = (Button)findViewById(R.id.mers_button);
        mers_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_virusinformation.class);
                intent.putExtra("gettitle","메르스");
                startActivity(intent);
            }
        });

        Button covid19_button = (Button)findViewById(R.id.covid19_button);
        covid19_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_virusinformation.class);
                intent.putExtra("gettitle","코로나");
                startActivity(intent);
            }
        });

    }
}
