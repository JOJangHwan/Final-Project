package com.example.virus_confirmation_management_application;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class user_virusinformation  extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_virusinformation_activity);

        String gettitleData = getIntent().getStringExtra("gettitle");
        TextView  virustitle= (TextView)findViewById(R.id.virustitle);
        virustitle.setText(gettitleData);

    }
}