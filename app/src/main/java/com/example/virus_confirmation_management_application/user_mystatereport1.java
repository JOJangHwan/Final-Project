package com.example.virus_confirmation_management_application;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class user_mystatereport1 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_mystatereport1_activity);


        Bundle extras = getIntent().getExtras();

        String td_num = extras.getString("td_num");
        String td_tittle = extras.getString("td_tittle");



        TextView textView1 = (TextView) findViewById(R.id.stateanswernum);
        TextView textView2 = (TextView) findViewById(R.id.state_title);

        textView1.setText(td_num);
        textView2.setText(td_tittle);

    }
}