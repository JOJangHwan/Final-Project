package com.example.virus_confirmation_management_application;

import static com.example.virus_confirmation_management_application.user_Frag2.a;
import static com.example.virus_confirmation_management_application.user_bottomnavi.pagedata;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class manager_activity_qanda extends AppCompatActivity {
    private Button button_move;

    private ArrayList<Manager_QnA_Data> Main_dataList;   /// 데이터를 담기위한 어레이 리스트
    private Manager_QnA_Adapter Main_adapter; //어댑터
    private RecyclerView recyclerview;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_activity_qanda);

        recyclerview = (RecyclerView) findViewById(R.id.rc_qaview);  /// 리사이클러뷰 초기화
        recyclerview.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL)); ///구분선 넣어주는 옵션
        linearLayoutManager = new LinearLayoutManager(this); // 레이아웃 매니져
        recyclerview.setLayoutManager(linearLayoutManager); // 리사이클러뷰에 set 해준다 .
        Main_dataList = new ArrayList<>(); // 어댑터 선언
        Main_adapter = new Manager_QnA_Adapter(Main_dataList); // 어댑터에 어레이리스트 넣어준다.
        recyclerview.setAdapter((RecyclerView.Adapter) Main_adapter);// 리사이클러뷰에 어댑터 set 해준다.

        load();


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



        recyclerview.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerview, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                com.example.virus_confirmation_management_application.item_qna_list dict = item_qna_list.get(position);
                //아이템화면전환
                Toast.makeText(getApplicationContext(), dict.getQnAmessage(), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getBaseContext(), item_qna_list.class);


                intent.putExtra("qnamessage", dict.getQnAmessage());


                startActivity(intent);


            }

            @Override
            public void onLongClick(View view, int position) {
            }
        }));





        public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

            private GestureDetector gestureDetector;
            private ClickListener clickListener;

            public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final ClickListener clickListener) {
                this.clickListener = clickListener;
                gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                    @Override
                    public boolean onSingleTapUp(MotionEvent e) {
                        return true;
                    }

                    @Override
                    public void onLongPress(MotionEvent e) {
                        View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                        if (child != null && clickListener != null) {
                            clickListener.onLongClick(child, recyclerView.getChildAdapterPosition(child));
                        }
                    }
                });
            }

            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                View child = rv.findChildViewUnder(e.getX(), e.getY());
                if (child != null && clickListener != null && gestureDetector.onTouchEvent(e)) {
                    clickListener.onClick(child, rv.getChildAdapterPosition(child));
                }
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {
            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
            }
        }


        
        
        
        
        
        

        button_move = findViewById(R.id.qandA_revise_but); // 2
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(manager_activity_qanda.this, manager_activity_qanda_update.class); //현재 위치와 이동할 위치의 인자
                startActivity(intent); // 액티비티 이동 구문
            }
        });
    }

    private RecyclerView.OnItemTouchListener RecyclerTouchListener(Context applicationContext, RecyclerView recyclerview, user_wishlista.ClickListener clickListener) {

    }

    private void load() {
        for (int i =0; i<10; i++) {
            Manager_QnA_Data data = new Manager_QnA_Data(R.mipmap.ic_launcher_round, i + "번째 QnA");
            Main_dataList.add(0, data);
            Main_adapter.notifyDataSetChanged();
        }
    }


    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }
}