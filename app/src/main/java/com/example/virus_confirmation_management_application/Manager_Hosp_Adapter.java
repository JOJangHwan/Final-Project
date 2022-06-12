package com.example.virus_confirmation_management_application;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Manager_Hosp_Adapter extends RecyclerView.Adapter<Manager_Hosp_Adapter.ViewHolder> {

    private ArrayList<Manager_Hosp_Data> Data_arrayList;

    public Manager_Hosp_Adapter(ArrayList<Manager_Hosp_Data>arrayList){
        this.Data_arrayList= arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hosp_list,parent,false);
        ViewHolder holder= new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.manager_hosp_name.setText(Data_arrayList.get(position).getHosp_name());
        holder.manager_hosp_address.setText(Data_arrayList.get(position).getHosp_address());
        holder.manager_hosp_number.setText(Data_arrayList.get(position).getHosp_number());
        holder.manager_hosp_ing.setText(Data_arrayList.get(position).getHosp_ing());
        holder.manager_hosp_target.setText(Data_arrayList.get(position).getHosp_target());
        holder.manager_hosp_image.setImageResource(Data_arrayList.get(position).getHosp_image());

    }

    @Override
    public int getItemCount() {

        return (null != Data_arrayList ? Data_arrayList.size() :0);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView manager_hosp_image;
        TextView manager_hosp_name;
        TextView manager_hosp_ing;
        TextView manager_hosp_number;
        TextView manager_hosp_target;
        TextView manager_hosp_address;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //img_hosp_list = (ImageView) itemView.findViewById(R.id.img_hosp_list);
            //text_hosp_list = itemView.findViewById(R.id.text_hosp_list);
            manager_hosp_image = (ImageView) itemView.findViewById(R.id.manager_hosp_image);

            manager_hosp_name = itemView.findViewById(R.id.manager_hosp_name);
            manager_hosp_ing = itemView.findViewById(R.id.manager_hosp_ing);
            manager_hosp_number = itemView.findViewById(R.id.manager_hosp_number);
            manager_hosp_target = itemView.findViewById(R.id.manager_hosp_target);
            manager_hosp_address = itemView.findViewById(R.id.manager_hosp_address);
        }


    }




}

