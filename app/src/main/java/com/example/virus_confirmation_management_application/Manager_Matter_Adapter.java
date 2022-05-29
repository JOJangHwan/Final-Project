package com.example.virus_confirmation_management_application;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Manager_Matter_Adapter extends RecyclerView.Adapter<Manager_Matter_Adapter.ViewHolder> {

    private ArrayList<Manager_Matter_Data> Data_arrayList;

    public Manager_Matter_Adapter(ArrayList<Manager_Matter_Data>arrayList){
        this.Data_arrayList= arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_matter_list,parent,false);
        ViewHolder holder= new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text_matter_list.setText(Data_arrayList.get(position).getMessage());
        holder.img_matter_list.setImageResource(Data_arrayList.get(position).getResourceId());

    }

    @Override
    public int getItemCount() {

        return (null != Data_arrayList ? Data_arrayList.size() :0);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img_matter_list;
        TextView text_matter_list;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_matter_list = (ImageView) itemView.findViewById(R.id.img_matter_list);
            text_matter_list = itemView.findViewById(R.id.text_matter_list);
        }


    }




}

