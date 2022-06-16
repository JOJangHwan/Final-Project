/*
2017243053 조장환

 */
package com.example.virus_confirmation_management_application;

import static com.example.virus_confirmation_management_application.user_Frag2.a;
import static com.example.virus_confirmation_management_application.user_bottomnavi.pagedata;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class manager_activity_gogu_mainimg extends AppCompatActivity {
    private Button button_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_activity_gogu_mainimg);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.menu_home:
                        pagedata=0;
                        Intent intent = new Intent(getApplicationContext(), manager_activity_home_bottom_navi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.menu_confirmed_case:
                        pagedata=1;
                        a=0;
                        intent = new Intent(getApplicationContext(), manager_activity_home_bottom_navi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.menu_people_in:
                        pagedata=2;
                        intent = new Intent(getApplicationContext(), manager_activity_home_bottom_navi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                }
                return true;
            }
        });

        button_move = findViewById(R.id.manager_button_goguhome); // 국내 정부지침
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(manager_activity_gogu_mainimg.this, manager_activity_gogu.class); //현재 위치와 이동할 위치의 인자
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = findViewById(R.id.manager_button_goguforeign); // 해외 정부지침
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(manager_activity_gogu_mainimg.this, manager_overseas.class); //현재 위치와 이동할 위치의 인자
                startActivity(intent); // 액티비티 이동 구문
            }
        });
    }
}