package com.example.virus_confirmation_management_application;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
/*
    gramer : 윤승준 내부 기능 및 UI 담당
 */
public class user_Frag1 extends Fragment {


    private View view;
    private Button button_move;
    private ImageButton imageButton_move;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.user_frag_map, container, false);

        imageButton_move = view.findViewById(R.id.button_se); // 서울
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "seoul");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_gy); // 경기도
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "gyeonggi_do");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_in); // 인천
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "incheon");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_gang); // 강원도
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "gangwon_do");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_ch1); // 충남
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "chungcheongnam_do");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_ch2); // 충북
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "chungcheongbuk_do");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_daejeon); // 대전
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "daejeon");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_gy1); // 경북
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "gyeongsangbuk_do");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_gy2); // 경남
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "gyeongsangnam_do");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_daegu); // 대구
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "daegu");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_busan); // 부산
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "busan");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_ulsan); // 울산
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "ulsan");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_jeo1); // 전라북도
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "jeollabuk_do");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_jeo2); // 전라남도
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "jeollanam_do");
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_jeju); // 제주
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), user_map_boardlist.class);
                intent.putExtra("tittle", "jeju_do");
                startActivity(intent); // 액티비티 이동 구문
            }
        });



        return view;
    }


}

