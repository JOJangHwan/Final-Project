/*
2017243053 조장환

 */
package com.example.virus_confirmation_management_application;
/*

2017243053 조장환

 */
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Manager_Notice_Adapter extends RecyclerView.Adapter<Manager_Notice_Adapter.ViewHolder> {

    private ArrayList<Manager_Notice_Data> Data_arrayList;
    //private Context context;

    public Manager_Notice_Adapter(ArrayList<Manager_Notice_Data>arrayList){
        this.Data_arrayList= arrayList;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notice_list,parent,false);
        ViewHolder holder= new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text_notice_list.setText(Data_arrayList.get(position).getMessage());
        holder.img_notice_list.setImageResource(Data_arrayList.get(position).getResourceId());



    }

    @Override
    public int getItemCount() {

        return (null != Data_arrayList ? Data_arrayList.size() :0);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img_notice_list;
        TextView text_notice_list;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_notice_list = (ImageView) itemView.findViewById(R.id.img_notice_list);
            text_notice_list = itemView.findViewById(R.id.text_notice_list);
        }


    }




}

