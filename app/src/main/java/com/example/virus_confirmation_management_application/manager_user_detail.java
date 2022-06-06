package com.example.virus_confirmation_management_application;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class manager_user_detail extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_user_detail);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

/*
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


*/

        Bundle extras = getIntent().getExtras();

        int userimage = extras.getInt("userimage");
        ImageView tv_userimage = (ImageView) findViewById(R.id.userimage_imageview_detail);
        tv_userimage.setImageResource(userimage);

        String userage = extras.getString("userage");
        TextView tv_userage = (TextView) findViewById(R.id.userage_textview_detail);
        tv_userage.setText(userage);

        String username = extras.getString("username");
        TextView tv_username = (TextView) findViewById(R.id.username_textview_detail);
        tv_username.setText(username);

        String userarea = extras.getString("userarea");
        TextView tv_userarea = (TextView) findViewById(R.id.userarea_textview_detail);
        tv_userarea.setText(userarea);

        String userphnumber = extras.getString("userphnumber");
        TextView tv_userphnumber = (TextView) findViewById(R.id.userphnumber_textview_detail);
        tv_userphnumber.setText(userphnumber);






    }
}
