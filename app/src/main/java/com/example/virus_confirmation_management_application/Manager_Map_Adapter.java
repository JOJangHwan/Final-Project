/*
2017243053 조장환

 */
package com.example.virus_confirmation_management_application;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        holder.manager_board_tittle.setText(Data_arrayList.get(position).getMessage());
        holder.manager_board_date.setText(Data_arrayList.get(position).getMessage());
        holder.manager_board_userid.setText(Data_arrayList.get(position).getMessage());
        holder.manager_board_like.setText(Data_arrayList.get(position).getMessage());
        holder.manager_board_chat.setText(Data_arrayList.get(position).getMessage());


    }

    @Override
    public int getItemCount() {

        return (null != Data_arrayList ? Data_arrayList.size() :0);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView manager_board_tittle;
        TextView manager_board_date;
        TextView manager_board_userid;
        TextView manager_board_like;
        TextView manager_board_chat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            manager_board_tittle = (TextView) itemView.findViewById(R.id.manager_board_tittle);
            manager_board_date = (TextView) itemView.findViewById(R.id.manager_board_date);
            manager_board_userid = (TextView) itemView.findViewById(R.id.manager_board_userid);
            manager_board_like = (TextView) itemView.findViewById(R.id.manager_board_like);
            manager_board_chat = (TextView) itemView.findViewById(R.id.manager_board_chat);
        }


    }




}

