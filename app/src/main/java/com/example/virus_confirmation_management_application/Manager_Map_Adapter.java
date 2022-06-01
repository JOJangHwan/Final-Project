package com.example.virus_confirmation_management_application;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Manager_Map_Adapter extends RecyclerView.Adapter<Manager_Map_Adapter.ViewHolder> {

    private ArrayList<Manager_Map_Data> Data_arrayList;

    public Manager_Map_Adapter(ArrayList<Manager_Map_Data>arrayList){
        this.Data_arrayList= arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_map_list,parent,false);
        ViewHolder holder= new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text_map_list.setText(Data_arrayList.get(position).getMessage());
        holder.img_map_list.setImageResource(Data_arrayList.get(position).getResourceId());

    }

    @Override
    public int getItemCount() {

        return (null != Data_arrayList ? Data_arrayList.size() :0);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img_map_list;
        TextView text_map_list;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_map_list = (ImageView) itemView.findViewById(R.id.img_map_list);
            text_map_list = itemView.findViewById(R.id.text_map_list);
        }


    }




}

