/*
2017243053 조장환

 */
package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class manager_frag_home extends Fragment {

    private View view;
    private Button button_move;
    private ImageButton imageButton_move;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.manager_frag_home,container, false);

        imageButton_move = view.findViewById(R.id.button_se); // 서울
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_seoul.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_gy); // 경기도
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_gyeonggi_do.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_in); // 인천
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_incheon.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_gang); // 강원도
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_ganwon_do.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_ch1); // 충남
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_chungnam.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_ch2); // 충북
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_chungbuk.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_daejeon); // 대전
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_daejeon.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_gy1); // 경북
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_gyeongbuk.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_gy2); // 경남
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_gyeognam.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_daegu); // 대구
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_daegu.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_busan); // 부산
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_busan.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_ulsan); // 울산
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_ulsan.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_jeo1); // 전북
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_jeonbuk.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_jeo2); // 전북
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_jeonnam.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.button_jeju); // 전북
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_map_bulletin_board_jeju.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });










        return view;
    }
}
