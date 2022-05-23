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

public class manager_frag_user_information extends Fragment {

    private View view;
    private Button button_move;
    private ImageButton imageButton_move;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.manager_frag_user_information,container, false);

        imageButton_move = view.findViewById(R.id.manager_button_virus); // 바이러스 관리
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_virus_mana.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });




        imageButton_move = view.findViewById(R.id.manager_button_hosp); // 병원리스트
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_hosp_list.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        imageButton_move = view.findViewById(R.id.manager_button_people); // 사용자 관리
        imageButton_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_user_mana.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.button_manager_information); // 내정보
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_user_mana.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.button_manager_notice); // 공지사항
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_notice.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.button_manager_QandA); // qanda
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_qanda.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.button_manager_question); // 문의사항
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_avtivity_matter_mana.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.button_manager_gogu); // 정부지침
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), manager_activity_gogu.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });





        return view;
    }
}
