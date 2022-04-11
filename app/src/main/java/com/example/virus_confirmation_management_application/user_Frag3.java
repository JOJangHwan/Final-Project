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

public class user_Frag3 extends Fragment {
    private View view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.user_mypage_activity, container, false);

        Button checkwirth_button = (Button) view.findViewById(R.id.checkwirth_button);
        checkwirth_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_checkwirhlist.class);
                startActivity(intent);
            }
        });

        Button announce_button = (Button) view.findViewById(R.id.announce_button);
        announce_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_announce.class);
                startActivity(intent);
            }
        });

        Button mystatereport_button = (Button) view.findViewById(R.id.mystatereport_button);
        mystatereport_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_mystatereportlist.class);
                startActivity(intent);
            }
        });
        Button addfamily_button = (Button) view.findViewById(R.id.addfamily_button);
        addfamily_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), user_myfamily.class);
                startActivity(intent);
            }
        });

        return view;

    }
}
