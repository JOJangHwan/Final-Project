package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class user_checkwirhlist extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_checkwirhlist_activity);

        ImageButton addcheckwithButton = (ImageButton) findViewById(R.id.addcheckwithButton);
        addcheckwithButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_checkwith.class);
                startActivity(intent);
            }
        });

    }




}