package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class manager_activity_userlist_detail extends AppCompatActivity {

    TextView detail_name_text, detail_age_text,detail_sex_text;

    String name, age, sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_activity_userlist_detail);

        detail_name_text = findViewById(R.id.textview_detailname_userlist);
        detail_age_text = findViewById(R.id.textview_detailage_userlist);
        detail_sex_text = findViewById(R.id.textview_detailsex_userlist);

       Intent intent = getIntent();

        name = intent.getExtras().getString("name");
        age = intent.getExtras().getString("age");
        sex = intent.getExtras().getString("sex");

        detail_name_text.setText(name);
        detail_age_text.setText(age);
        detail_sex_text.setText(sex);


    }
}