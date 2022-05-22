package com.example.virus_confirmation_management_application;

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

    private View view;
    private ArrayList<Manager_viruslist_Data> arrayList;
    private Manager_viruslist_adapter manager_viruslist;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.manager_frag_con_case,container, false);





        return view;


    }
}
