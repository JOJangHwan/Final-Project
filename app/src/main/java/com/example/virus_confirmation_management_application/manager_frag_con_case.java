package com.example.virus_confirmation_management_application;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class manager_frag_con_case extends Fragment {

    private Context context;

    private View view;
    private ArrayList<com.example.virus_confirmation_management_application.Manager_virus_people_Data> Main_dataList = new ArrayList<com.example.virus_confirmation_management_application.Manager_virus_people_Data>();
    private Manager_virus_people_Adapter Main_adapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private Object Manager_virus_people_Data;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.manager_frag_con_case,container, false);

        //recyclerView = (RecyclerView) recyclerView.findViewById(R.id.rc_virus_people_view);

        //recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationcontext(),DividerItemDecoration.VERTICAL));
        recyclerView = (RecyclerView) view.findViewById(R.id.rc_virus_people_view);
        recyclerView.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        Main_dataList = new ArrayList<com.example.virus_confirmation_management_application.Manager_virus_people_Data>();
        Main_adapter = new Manager_virus_people_Adapter(Main_dataList);
        recyclerView.setAdapter((RecyclerView.Adapter)Main_adapter);

        load();
        


        return view;


    }

    private void load() {

        for (int i =0; i<10; i++) {
            Manager_virus_people_Data data= new Manager_virus_people_Data(R.drawable.man, i+"번째 이름",i+"번째 나이",i+"번째 전화번호",
                    i+"번째 성별",i+"번째 주소");
            Main_dataList.add(0, data);
            Main_adapter.notifyDataSetChanged();
        }


    }




}
