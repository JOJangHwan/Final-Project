package com.example.virus_confirmation_management_application;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class manager_activity_home_bottom_navi extends AppCompatActivity {

    private Button button_move; // intend
    private BottomNavigationView bottomNavigationView; // 바텀 네비게이션 뷰
    private FragmentManager fm;
    private FragmentTransaction ft;

    private final FragmentManager fragmentManager = getSupportFragmentManager();
    private final manager_frag_home ad_frag_home = new manager_frag_home();
    private final manager_frag_con_case frag_con_case=new manager_frag_con_case();
    private final manager_activity_virus_mana manager_activity_virus_mana=new manager_activity_virus_mana();

    private final manager_frag_user_information frag_user_information=new manager_frag_user_information();

    private Button fp_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_home_bottom_navi);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_home, ad_frag_home).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());







    }
    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch(menuItem.getItemId())
            {
                case R.id.menu_home:
                    transaction.replace(R.id.frame_home, ad_frag_home).commitAllowingStateLoss();
                    break;
                case R.id.menu_confirmed_case:
                    transaction.replace(R.id.frame_home, frag_con_case).commitAllowingStateLoss();
                    break;
                case R.id.menu_people_in:
                    transaction.replace(R.id.frame_home, frag_user_information).commitAllowingStateLoss();
                    break;




            }
            return true;
        }
    }

}



