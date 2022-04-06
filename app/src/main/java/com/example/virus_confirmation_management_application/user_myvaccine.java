package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class user_myvaccine extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_myvaccine_activity);

        Button myvaccine_registerButton = (Button) findViewById(R.id.myvaccine_registerButton);
        myvaccine_registerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_vaccineenroll.class);
                startActivity(intent);
            }
        });

    }
}