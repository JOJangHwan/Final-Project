/*
2017243053 조장환

 */
package com.example.virus_confirmation_management_application;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
/*

2017243053 조장환

 */
public class Manager_viruslist_adapter extends RecyclerView.Adapter<Manager_viruslist_adapter.ViewHolder>{

    private ArrayList<Manager_viruslist_Data> localDataSet;

    public Manager_viruslist_adapter(ArrayList<Manager_virus_people_Adapter> main_dataList) {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder  extends  RecyclerView.ViewHolder{
        private TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
        public TextView getTextView(){
            return  textView;
        }
    }
}










