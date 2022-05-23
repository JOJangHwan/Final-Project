package com.example.virus_confirmation_management_application;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class joint_login extends AppCompatActivity {

    private Button button_move; // intend
    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;

    private  final FragmentManager fragmentManager = getSupportFragmentManager();
    private  final joint_fragment_login_user joint_fragment_login_user = new joint_fragment_login_user();
    private  final joint_fragment_login_manager joint_fragment_login_manager = new joint_fragment_login_manager();

    private Button fp_info;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.joint_login);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_login_home,joint_fragment_login_user).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.joint_login_menu_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());

    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch(menuItem.getItemId())
            {
                case R.id.menu_login_user:
                    transaction.replace(R.id.frame_login_home, joint_fragment_login_user).commitAllowingStateLoss();
                    break;
                case R.id.menu_login_manager:
                    transaction.replace(R.id.frame_login_home, joint_fragment_login_manager).commitAllowingStateLoss();
                    break;
            }
            return true;
        }
    }
}



