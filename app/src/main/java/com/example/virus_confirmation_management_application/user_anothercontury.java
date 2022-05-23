package com.example.virus_confirmation_management_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class user_anothercontury extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_anothercontury);

        ImageButton America_button = (ImageButton)findViewById(R.id.America_button);
        America_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_anotherconturywebview.class);
                intent.putExtra("user_AC_Url","http://www.0404.go.kr/m/dev/country_view.mofa?idx=69");
                startActivity(intent);
            }
        });

        ImageButton china_button = (ImageButton)findViewById(R.id.china_button);
        china_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_anotherconturywebview.class);
                intent.putExtra("user_AC_Url","https://www.0404.go.kr/m/dev/country_view.mofa?idx=189&hash=&chkvalue=no1&stext=%EC%A4%91%EA%B5%AD&group_idx=&alert_level=0");
                startActivity(intent);
            }
        });

        ImageButton ph_button = (ImageButton)findViewById(R.id.ph_button);
        ph_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_anotherconturywebview.class);
                //https://www.0404.go.kr/dev/country_view.mofa?idx=252
                intent.putExtra("user_AC_Url","https://www.0404.go.kr/m/dev/country_view.mofa?idx=252");
                startActivity(intent);
            }
        });

        ImageButton Myanmar_button = (ImageButton)findViewById(R.id.Myanmar_button);
        Myanmar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_anotherconturywebview.class);
                intent.putExtra("user_AC_Url","https://www.0404.go.kr/dev/country_view.mofa?idx=75");
                startActivity(intent);
            }
        });

        ImageButton Indonesia_button = (ImageButton)findViewById(R.id.Indonesia_button);
        Indonesia_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_anotherconturywebview.class);
                intent.putExtra("user_AC_Url","https://www.0404.go.kr/dev/country_view.mofa?idx=181");
                startActivity(intent);
            }
        });


        ImageButton Vietnam_button = (ImageButton)findViewById(R.id.Vietnam_button);
        Vietnam_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_anotherconturywebview.class);
                intent.putExtra("user_AC_Url","https://www.0404.go.kr/dev/country_view.mofa?idx=86");
                startActivity(intent);
            }
        });


        ImageButton Canada_button = (ImageButton)findViewById(R.id.Canada_button);
        Canada_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_anotherconturywebview.class);
                intent.putExtra("user_AC_Url","https://www.0404.go.kr/dev/country_view.mofa?idx=204");
                startActivity(intent);
            }
        });


        ImageButton India_button = (ImageButton)findViewById(R.id.India_button);
        India_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_anotherconturywebview.class);
                intent.putExtra("user_AC_Url","https://www.0404.go.kr/dev/country_view.mofa?idx=285&hash=&chkvalue=no1&stext=%EC%9D%B8%EB%8F%84&group_idx=&alert_level=0");
                startActivity(intent);
            }
        });

    }
}
