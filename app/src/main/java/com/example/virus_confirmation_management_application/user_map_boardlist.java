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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class user_map_boardlist  extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private user_map_boardlist_CustomAdapter mboardlistCustomAdapter;
    private ArrayList<user_map_boardlist_item> user_map_boardlist_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_map_boardlist);

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








        Bundle extras = getIntent().getExtras();

        String tittle = extras.getString("tittle");
        String tittlename="미정";
        String url="";
        switch (tittle){
            case "seoul":
                tittlename="서울";
                url="https://www.seoul.go.kr/coronaV/coronaStatus.do";
                break;
            case "gyeonggi_do":
                tittlename="경기도";
                url="https://www.gg.go.kr/contents/contents.do?ciIdx=1150&menuId=2909";
                break;
            case "incheon":
                tittlename="인천";
                url="https://www.incheon.go.kr/covid19/index";
                break;
            case "gangwon_do":
                tittlename="강원도";
                url="http://www.provin.gangwon.kr/covid-19.html";
                break;
            case "chungcheongnam_do":
                tittlename="충남";
                url="http://www.chungnam.go.kr/coronaStatus.do";
                break;
            case "chungcheongbuk_do":
                tittlename="충북";
                url="https://www.chungbuk.go.kr/covid-19/index.do";
                break;
            case "daejeon":
                tittlename="대전";
                url="https://corona.daejeon.go.kr/index.do";
                break;
            case "gyeongsangbuk_do":
                tittlename="경북";
                url="https://www.gb.go.kr/Main/open_contents/section/wel/page.do?mnu_uid=5857&LARGE_CODE=360&MEDIUM_CODE=90&SMALL_CODE=10&mnu_order=2";
                break;
            case "gyeongsangnam_do":
                tittlename="경남";
                url="http://xn--19-q81ii1knc140d892b.kr/main/main.do";
                break;
            case "daegu":
                tittlename="대구";
                url="http://covid19.daegu.go.kr/index.html";
                break;
            case "busan":
                tittlename="부산";
                url="https://www.busan.go.kr/covid19/";
                break;
            case "ulsan":
                tittlename="울산";
                url="https://www.ulsan.go.kr/u/health/contents.ulsan?mId=001002014000000000";
                break;
            case "jeollabuk_do":
                tittlename="전라북도";
                url="https://www.jeonbuk.go.kr/board/list.jeonbuk?boardId=BBS_0000105&menuCd=DOM_000000110001000000&contentsSid=1219&cpath=";
                break;
            case "jeollanam_do":
                tittlename="전라남도";
                url="http://xn--19-q81ii1knc140d892b.kr/main/main.do";
                break;
            case "jeju_do":
                tittlename="제주";
                url="https://covid19.jeju.go.kr/";
                break;



        }


        Button textView1 = (Button) findViewById(R.id.button_bulletin_board);

        textView1.setText(tittlename+"확진자 확인하러 가기");


        Button button_bulletin_board = (Button)findViewById(R.id.button_bulletin_board);
        String finalUrl = url;
        button_bulletin_board.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_map_board_webview.class);
                intent.putExtra("Url", finalUrl);
                startActivity(intent);
            }
        });

        Button button_board_add = (Button)findViewById(R.id.button_board_add);
        button_board_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),user_map_board_add.class);
                startActivity(intent);
            }
        });



        mRecyclerView = (RecyclerView) findViewById(R.id.user_map_bord_recyclerview);

        /* initiate adapter */
        mboardlistCustomAdapter= new user_map_boardlist_CustomAdapter();
        /* initiate recyclerview */
        mRecyclerView.setAdapter(mboardlistCustomAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        /* adapt data */
        user_map_boardlist_item = new ArrayList<>();
        for(int i=1;i<=10;i++){
            user_map_boardlist_item.add(new user_map_boardlist_item(tittlename,i,i+"번째 제목",i+"번째아이디",i+"번째 날짜",i,i));

        }
        mboardlistCustomAdapter.setMboardlistIteArrayList(user_map_boardlist_item);


        mRecyclerView.addOnItemTouchListener(new user_mystatereportlist.RecyclerTouchListener(getApplicationContext(), mRecyclerView, new user_mystatereportlist.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                com.example.virus_confirmation_management_application.user_map_boardlist_item dict = user_map_boardlist_item.get(position);
                //Toast.makeText(getApplicationContext(), dict.getNum()+' '+dict.getTittle()+' '+dict.getAnswercheck(), Toast.LENGTH_LONG).show();
                //아이템화면전환
                Intent intent = new Intent(getBaseContext(), user_map_board.class);

                intent.putExtra("Boardlocation", dict.getBoardlocation());
                intent.putExtra( "Board_tittle", dict.getBoard_tittle());
                intent.putExtra( "Board_date", dict.getBoard_date());
                intent.putExtra( "User_id", dict.getUser_id());
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
