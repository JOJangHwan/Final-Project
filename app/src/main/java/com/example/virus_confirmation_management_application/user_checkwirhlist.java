package com.example.virus_confirmation_management_application;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class user_checkwirhlist extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private user_stateCustomAdapter mstateCustomAdapter;
    private ArrayList<user_stateItem> user_stateItem;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_checkwirhlist_activity);

        mRecyclerView = (RecyclerView) findViewById(R.id.checkwith_recyclerview);

        /* initiate adapter */
        mstateCustomAdapter= new user_stateCustomAdapter();
        /* initiate recyclerview */
        mRecyclerView.setAdapter(mstateCustomAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        /* adapt data */
        user_stateItem = new ArrayList<>();
        for(int i=1;i<=10;i++) {
            user_stateItem.add(new user_stateItem(i + "", i + "번째 문의사항 제목", i + "번째 날짜", "미답변"));
        }
        mstateCustomAdapter.setMstateIteArrayList(user_stateItem);




        mRecyclerView.addOnItemTouchListener(new user_mystatereportlist.RecyclerTouchListener(getApplicationContext(), mRecyclerView, new user_mystatereportlist.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                com.example.virus_confirmation_management_application.user_stateItem dict = user_stateItem.get(position);
                Toast.makeText(getApplicationContext(), dict.getNum()+' '+dict.getTittle()+' '+dict.getAnswercheck(), Toast.LENGTH_LONG).show();
                //아이템화면전환
                Intent intent = new Intent(getBaseContext(), user_checkwith1.class);

                intent.putExtra("td_num", dict.getNum());
                intent.putExtra( "td_tittle", dict.getTittle());

                startActivity(intent);


            }

            @Override
            public void onLongClick(View view, int position) {
            }
        }));






        //이동버튼
        ImageButton addcheckwithButton = (ImageButton) findViewById(R.id.addcheckwithButton);
        addcheckwithButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_checkwith.class);
                startActivity(intent);
            }
        });

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