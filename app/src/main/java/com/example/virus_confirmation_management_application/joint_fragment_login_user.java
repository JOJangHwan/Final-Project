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

import static com.example.virus_confirmation_management_application.user_Frag2.a;

public class joint_fragment_login_user extends Fragment {

    private View view;
    private Button button_move;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.joint_fragment_login_user,container, false);

        button_move = view.findViewById(R.id.btn_login_user); // 메인으로 이동
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),user_bottomnavi.class);
                a=0; //슬라이드 오류 해결 코드
                startActivity(intent); // 액티비티 이동 구문
            }
        });

        button_move = view.findViewById(R.id.btn_signup_user); // 회원가입
        button_move.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),joint_activity_register_user.class);
                startActivity(intent); // 액티비티 이동 구문
            }
        });





        return view;
    }
}
