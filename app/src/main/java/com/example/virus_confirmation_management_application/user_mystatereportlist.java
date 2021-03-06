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
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
/*
    gramer : 윤승준  UI및 내부기능
 */
public class user_mystatereportlist extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private user_stateCustomAdapter mstateCustomAdapter;
    private ArrayList<user_stateItem> user_stateItem;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_mystatereportlist_activity);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);


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



        mRecyclerView = (RecyclerView) findViewById(R.id.state_recyclerView);

        /* initiate adapter */
         mstateCustomAdapter= new user_stateCustomAdapter();
        /* initiate recyclerview */
        mRecyclerView.setAdapter(mstateCustomAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        /* adapt data */
        user_stateItem = new ArrayList<>();
        for(int i=1;i<=10;i++){
                user_stateItem.add(new user_stateItem(i+"",i+"번째상태보고 제목",i+"번째 날짜","미답변"));

        }
        mstateCustomAdapter.setMstateIteArrayList(user_stateItem);




        mRecyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), mRecyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                com.example.virus_confirmation_management_application.user_stateItem dict = user_stateItem.get(position);
                Toast.makeText(getApplicationContext(), dict.getNum()+' '+dict.getTittle()+' '+dict.getAnswercheck(), Toast.LENGTH_LONG).show();
                //아이템화면전환
                Intent intent = new Intent(getBaseContext(), user_mystatereport1.class);

                intent.putExtra("td_num", dict.getNum());
                intent.putExtra( "td_tittle", dict.getTittle());

                startActivity(intent);


            }

            @Override
            public void onLongClick(View view, int position) {
            }
        }));





        //버튼 이동부분
        ImageButton addreportButton = (ImageButton) findViewById(R.id.addreportButton);
        addreportButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_mystatereport.class);
                startActivity(intent);
            }
        });
        //






    }


    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private user_mystatereportlist.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final user_mystatereportlist.ClickListener clickListener) {
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

}




