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
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class manager_activity_map_bulletin_board_ganwon_do extends AppCompatActivity {
    private Button button_move;

    private ArrayList<Manager_Map_Data> Main_dataList;   /// 데이터를 담기위한 어레이 리스트
    private Manager_Map_Adapter Main_adapter; //어댑터
    private RecyclerView recyclerview;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_activity_map_bulletin_board_ganwon_do);

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

        recyclerview = (RecyclerView) findViewById(R.id.rc_map_View);  /// 리사이클러뷰 초기화
        recyclerview.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL)); ///구분선 넣어주는 옵션
        linearLayoutManager = new LinearLayoutManager(this); // 레이아웃 매니져
        recyclerview.setLayoutManager(linearLayoutManager); // 리사이클러뷰에 set 해준다 .
        Main_dataList = new ArrayList<>(); // 어댑터 선언
        Main_adapter = new Manager_Map_Adapter(Main_dataList); // 어댑터에 어레이리스트 넣어준다.
        recyclerview.setAdapter((RecyclerView.Adapter) Main_adapter);// 리사이클러뷰에 어댑터 set 해준다.

        load();

        button_move = findViewById(R.id.button_bulletin_board_ganwon_do); //
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(manager_activity_map_bulletin_board_ganwon_do.this, manager_activity_map_ganwon_do.class); //현재 위치와 이동할 위치의 인자
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = findViewById(R.id.button_map_write_ganwon); // 글쓰기
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(manager_activity_map_bulletin_board_ganwon_do.this, manager_map_write.class); //현재 위치와 이동할 위치의 인자
                startActivity(intent); // 액티비티 이동 구문
            }
        });
    }

    private void load() {
        for (int i =0; i<10; i++) {
            Manager_Map_Data data = new Manager_Map_Data(R.mipmap.ic_launcher_round, i + "번째 게시글");
            Main_dataList.add(0, data);
            Main_adapter.notifyDataSetChanged();
        }
    }
}