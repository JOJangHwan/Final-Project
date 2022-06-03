package com.example.virus_confirmation_management_application;

import static com.example.virus_confirmation_management_application.user_Frag2.a;
import static com.example.virus_confirmation_management_application.user_bottomnavi.pagedata;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class user_wishlista extends AppCompatActivity {
    private RecyclerView mRecyclerView;//병원
    private RecyclerView mRecyclerView1;//약국
    private user_hos_med_CustomAdapter mhosmedCustomAdapter;
    private user_hos_med_CustomAdapter1 mhosmedCustomAdapter1;

    private ArrayList<user_hos_med_Item> user_hos_med_Item;//병원
    private ArrayList<user_hos_med_Item1> user_hos_med_Item1;//약국


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_wishlista_activity);

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

        mRecyclerView = (RecyclerView) findViewById(R.id.hos_recyclerview);
        mRecyclerView1 = (RecyclerView) findViewById(R.id.med_recyclerview);

        /* initiate adapter */
        mhosmedCustomAdapter= new user_hos_med_CustomAdapter();
        mhosmedCustomAdapter1= new user_hos_med_CustomAdapter1();

        /* initiate recyclerview */
        mRecyclerView.setAdapter(mhosmedCustomAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRecyclerView1.setAdapter(mhosmedCustomAdapter1);
        mRecyclerView1.setLayoutManager(new LinearLayoutManager(this));

        /* adapt data */
        user_hos_med_Item = new ArrayList<>();
        for(int i=1;i<=10;i++){
            user_hos_med_Item.add(new user_hos_med_Item(R.drawable.gogu3,i+"번째병원이름",i+"번째 진료과",i+"번호"
                    ,i+"번째 시간",i+"번째 주소"));

        }
        mhosmedCustomAdapter.setMhosmedIteArrayList(user_hos_med_Item);


        user_hos_med_Item1 = new ArrayList<>();
        for(int i=1;i<=10;i++){
            user_hos_med_Item1.add(new user_hos_med_Item1(R.drawable.free_icon_medicine_2785749,i+"번째약국이름",i+"번째 약국",i+"번호"
                    ,i+"번째 시간",i+"번째 주소"));

        }
        mhosmedCustomAdapter1.setMhosmedIteArrayList(user_hos_med_Item1);






        mRecyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), mRecyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                com.example.virus_confirmation_management_application.user_hos_med_Item dict = user_hos_med_Item.get(position);
                //아이템화면전환
                Toast.makeText(getApplicationContext(), dict.getImage()+' '+dict.getName(), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getBaseContext(), user_hosinformation.class);


                intent.putExtra("image", dict.getImage());
                intent.putExtra("name", dict.getName());
                intent.putExtra("general", dict.getGeneral());
                intent.putExtra("number", dict.getNumber());
                intent.putExtra("time", dict.getTime());
                intent.putExtra( "address", dict.getAddress());
                intent.putExtra( "hos_med", "진료과 : ");

                startActivity(intent);


            }

            @Override
            public void onLongClick(View view, int position) {
            }
        }));



        mRecyclerView1.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), mRecyclerView1, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                com.example.virus_confirmation_management_application.user_hos_med_Item1 dict = user_hos_med_Item1.get(position);
                //아이템화면전환
                Toast.makeText(getApplicationContext(), dict.getImage()+' '+dict.getName(), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getBaseContext(), user_hosinformation.class);

                intent.putExtra("image", dict.getImage());
                intent.putExtra("name", dict.getName());
                intent.putExtra("general", dict.getGeneral());
                intent.putExtra("number", dict.getNumber());
                intent.putExtra("time", dict.getTime());
                intent.putExtra( "address", dict.getAddress());
                intent.putExtra( "hos_med", "업종 : ");

                startActivity(intent);


            }

            @Override
            public void onLongClick(View view, int position) {
            }
        }));


    }


    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }

    public static class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

        private GestureDetector gestureDetector;
        private user_wishlista.ClickListener clickListener;

        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final user_wishlista.ClickListener clickListener) {
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
