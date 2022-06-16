package com.example.virus_confirmation_management_application;

import static com.example.virus_confirmation_management_application.user_Frag2.a;
import static com.example.virus_confirmation_management_application.user_bottomnavi.pagedata;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
/*
    gramer : 윤승준 내부 기능 및 UI 담당
 */
public class user_hosinformation extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_hosinformation_activity);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_map:
                        pagedata=0;
                        Intent intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.action_main:
                        pagedata=1;
                        a=0;
                        intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.action_person:
                        pagedata=2;
                        intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                }
                return true;
            }
        });



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
