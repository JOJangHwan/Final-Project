package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class user_mystatereportlist extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_mystatereportlist_activity);

        ImageButton addreportButton = (ImageButton) findViewById(R.id.addreportButton);
        addreportButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_mystatereport.class);
                startActivity(intent);
            }
        });

    }


}
