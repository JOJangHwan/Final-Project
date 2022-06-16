/*
2017243053 조장환

 */
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
        ImageView ig_userimage = (ImageView) findViewById(R.id.userimage_imageview_detail);
        //tv_userimage.setImageResource(userimage);

        String username = extras.getString("username");
        TextView tv_username = (TextView) findViewById(R.id.username_textview_detail);
        //tv_userage.setText(userage);

        String userage = extras.getString("userage");
        TextView tv_userage = (TextView) findViewById(R.id.userage_textview_detail);
        //tv_username.setText(username);

        String userph_number = extras.getString("userph_number");
        TextView tv_userph_number = (TextView) findViewById(R.id.userphnumber_textview_detail);
        //tv_userarea.setText(userarea);

        String usersex = extras.getString("usersex");
        TextView tv_usersex = (TextView) findViewById(R.id.usersex_textview_detail);
        //tv_userarea.setText(userarea);

        String useraddress = extras.getString("useraddress");
        TextView tv_useraddress = (TextView) findViewById(R.id.useraddress_textview_detail);
        //tv_userphnumber.setText(userphnumber);


        ig_userimage.setImageResource(userimage);
        tv_username.setText("이름 : "+username);
        tv_userage.setText("나이 : "+userage);
        tv_userph_number.setText("전화번호 : "+userph_number);
        tv_usersex.setText("성별 : "+usersex);
        tv_useraddress.setText("주소 : "+useraddress);

        //tv_usergeneral.setText(hos_med+general);
        //tv_usernumber.setText("전화번호 : "+number);
        //tv_usertime.setText("영업시간 : "+time);
        //tv_useraddress.setText("주소 : "+address);






    }
}
