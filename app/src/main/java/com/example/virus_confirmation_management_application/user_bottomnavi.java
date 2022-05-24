package com.example.virus_confirmation_management_application;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import static com.example.virus_confirmation_management_application.user_Frag2.a;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class user_bottomnavi extends AppCompatActivity {



    private Button button_move; // intend
    private BottomNavigationView bottomNavigationView; // 바텀 네비게이션 뷰
    private FragmentManager fm;
    private FragmentTransaction ft;

    private final FragmentManager fragmentManager = getSupportFragmentManager();



    private user_Frag1 frag1 =new user_Frag1();
    private user_Frag2 frag2 =new user_Frag2();
    private user_Frag3 frag3 =new user_Frag3();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_bottomnavi);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_frame, frag1).commitAllowingStateLoss();




        bottomNavigationView=findViewById(R.id.bottomNavi);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_map:
                        setFrag(0);
                        break;
                    case R.id.action_main:
                        a=0; //슬라이드 오류 해결
                        setFrag(1);
                        break;
                    case R.id.action_person:
                        setFrag(2);
                        break;
                }
                return true;
            }
        });
        frag1= new user_Frag1();
        frag2= new user_Frag2();
        frag3= new user_Frag3();
        setFrag(1);//첫화면

    }


    private  void setFrag(int n){
        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        switch (n){
            case 0:
                ft.replace(R.id.main_frame,frag1);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame,frag2);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame,frag3);
                ft.commit();
                break;
        }
    }
}