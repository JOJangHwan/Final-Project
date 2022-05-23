package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class user_virusinformationlist  extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_virusinformationlist_activity);


        Button H1N1_button = (Button)findViewById(R.id.H1N1_button);
        H1N1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), user_virusinformation_influ.class);
                intent.putExtra("gettitle","신종플루");
                startActivity(intent);
            }
        });

        Button mers_button1 = (Button)findViewById(R.id.mers_button);
        mers_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), user_virusinformation_mers.class);
                intent.putExtra("gettitle","메르스");
                startActivity(intent);
            }
        });

        Button covid19_button = (Button)findViewById(R.id.covid19_button);
        covid19_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), user_virusinformation_covid.class);
                intent.putExtra("gettitle","코로나");
                startActivity(intent);
            }
        });

        Button add_button = (Button)findViewById(R.id.button4);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), user_virusinformation_add.class);
                intent.putExtra("gettitle","추가예정");
                startActivity(intent);
            }
        });


    }
}
