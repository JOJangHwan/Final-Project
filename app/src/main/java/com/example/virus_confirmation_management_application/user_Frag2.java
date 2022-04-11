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

public class user_Frag2 extends Fragment {
    private View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.user_activity_main, container, false);

        ImageButton virusinformation_button = (ImageButton) view.findViewById(R.id.virusinformation_button);
        virusinformation_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(),user_virusinformationlist.class);
            startActivity(intent);
        }
    });


        ImageButton selftest_button = (ImageButton) view.findViewById(R.id.selftest_button);
        selftest_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_selftest.class);
                startActivity(intent);
            }
        });


        ImageButton govguid_button = (ImageButton) view.findViewById(R.id.govguid_button);
        govguid_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_govguide.class);
                startActivity(intent);
            }
        });

        ImageButton QandA_button = (ImageButton) view.findViewById(R.id.QandA_button);
        QandA_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_QandA.class);
                startActivity(intent);
            }
        });
        ImageButton nearhosfind_button = (ImageButton) view.findViewById(R.id.nearhosfind_button);
        nearhosfind_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_nearhosfind.class);
                startActivity(intent);
            }
        });
        ImageButton myvaccine_button = (ImageButton) view.findViewById(R.id.myvaccine_button);
        myvaccine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_myvaccine.class);
                startActivity(intent);
            }
        });


        return view;

    }


}
