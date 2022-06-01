package com.example.virus_confirmation_management_application;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class user_hosinformation extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_hosinformation_activity);


        Bundle extras = getIntent().getExtras();

        int image = extras.getInt("image");
        String name = extras.getString("name");
        String general = extras.getString("general");
        String number = extras.getString("number");
        String time = extras.getString("time");
        String address = extras.getString("address");
        String hos_med = extras.getString("hos_med");


        ImageView ig_image = (ImageView) findViewById(R.id.imageView4);
        TextView tV_name = (TextView) findViewById(R.id.hosinformation_name);
        TextView tv_general = (TextView) findViewById(R.id.hosinformation_hospart);
        TextView tv_number = (TextView) findViewById(R.id.hosinformation_number);
        TextView tv_time = (TextView) findViewById(R.id.hosinformation_hour);
        TextView tv_address = (TextView) findViewById(R.id.hosinformation_adress);

        ig_image.setImageResource(image);
        tV_name.setText(name);
        tv_general.setText(hos_med+general);
        tv_number.setText("전화번호 : "+number);
        tv_time.setText("영업시간 : "+time);
        tv_address.setText("주소 : "+address);


    }
}
