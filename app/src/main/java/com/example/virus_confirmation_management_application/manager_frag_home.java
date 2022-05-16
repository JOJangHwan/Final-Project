package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class manager_frag_home extends Fragment {


    private View view;
    private Button button_move;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.manager_frag_home,container, false);

        button_move = view.findViewById(R.id.button_user_mana); // 사용자 관리
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_user_mana.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.button_hosp); // 병원 추가
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_hosp_add.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.button_noti); // 병원 추가
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_notice.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.button_QnA); // 병원 추가
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_qanda.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.button_gogu); // 병원 추가
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_gogu.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.button_vimana); // 병원 추가
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_virus_mana.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.button_mfimana); // 병원 추가
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_matter_update.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.button_hosp_list); // 병원 추가
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_hosp_list.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });



        button_move = view.findViewById(R.id.button_vimo); // 바이러스 수정인데 사실 지도
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_webview.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.button_pr); // 내정보인데 사실 지도
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_main.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });






        return view;

    }




}


