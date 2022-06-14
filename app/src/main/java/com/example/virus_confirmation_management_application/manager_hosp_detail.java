package com.example.virus_confirmation_management_application;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class manager_hosp_detail extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_hosp_detail);


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

        int hospimage = extras.getInt("hospimage");
        ImageView ig_hospimage = (ImageView) findViewById(R.id.manager_imageView4);
        //ig_userimage.setImageResource(userimage);

        String hospname = extras.getString("hospname");
        TextView tv_hospname = (TextView) findViewById(R.id.manager_hosinformation_name);
        //tv_userage.setText(userage);

        String hospaddress = extras.getString("hospaddress");
        TextView tv_hospaddress = (TextView) findViewById(R.id.manager_hosinformation_adress);
        // tv_username.setText(username);

        String hosphour = extras.getString("hosping");
        TextView tv_hosphour = (TextView) findViewById(R.id.manager_hosinformation_hour);
        // tv_username.setText(username);

        String hosphospart = extras.getString("hosptarget");
        TextView tv_hosphospart = (TextView) findViewById(R.id.manager_hosinformation_hospart);
        // tv_username.setText(username);

        String hospnumber = extras.getString("hospnumber");
        TextView tv_hospnumber = (TextView) findViewById(R.id.manager_hosinformation_number);
        // tv_username.setText(username);




        ig_hospimage.setImageResource(hospimage);
        tv_hospname.setText(hospname);
        tv_hospaddress.setText("주소 : "+hospaddress);
        tv_hospnumber.setText("병원 전화번호 : "+hospnumber);
        tv_hosphour.setText("영업 시간 : "+hosphour);
        tv_hosphospart.setText("병원 진료과 : "+hosphospart);



        //tv_usergeneral.setText(hos_med+general);
        //tv_usernumber.setText("전화번호 : "+number);
        //tv_usertime.setText("영업시간 : "+time);
        //tv_useraddress.setText("주소 : "+address);






    }
}
