/*
2017243053 조장환

 */
package com.example.virus_confirmation_management_application;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
/*

2017243053 조장환

 */
public class Manager_virus_people_Adapter extends RecyclerView.Adapter<Manager_virus_people_Adapter.ViewHolder> {

    private ArrayList<Manager_virus_people_Data> Data_arrayList;

    public Manager_virus_people_Adapter(ArrayList<Manager_virus_people_Data>arrayList){
        this.Data_arrayList= arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_virpeoplelist,parent,false);
        ViewHolder holder= new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.manager_viruser_name.setText(Data_arrayList.get(position).getViruser_name());
        holder.manager_viruser_age.setText(Data_arrayList.get(position).getViruser_age());
        holder.manager_viruser_address.setText(Data_arrayList.get(position).getViruser_address());
        holder.manager_viruser_sex.setText(Data_arrayList.get(position).getViruser_sex());
        holder.manager_viruser_phnumber.setText(Data_arrayList.get(position).getViruser_ph_number());

        //holder.img_user_list.setImageResource(Data_arrayList.get(position).getResourceId());
        holder.manager_viruser_image.setImageResource(Data_arrayList.get(position).getViruser_image());

    }

    @Override
    public int getItemCount() {

        return (null != Data_arrayList ? Data_arrayList.size() :0);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView manager_viruser_image;
        TextView manager_viruser_name;
        TextView manager_viruser_age;
        TextView manager_viruser_address;
        TextView manager_viruser_sex;
        TextView manager_viruser_phnumber;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            manager_viruser_image = (ImageView) itemView.findViewById(R.id.manager_viruser_image);
            manager_viruser_name = (TextView) itemView.findViewById(R.id.manager_viruser_name);



            manager_viruser_name = itemView.findViewById(R.id.manager_viruser_name);
            manager_viruser_age = itemView.findViewById(R.id.manager_viruser_age);
            manager_viruser_address = itemView.findViewById(R.id.manger_viruser_address);
            manager_viruser_sex = itemView.findViewById(R.id.manager_viruser_sex);
            manager_viruser_phnumber = itemView.findViewById(R.id.manager_viruser_phnumber);
        }


    }




}

