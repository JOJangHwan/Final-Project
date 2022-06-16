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

public class Manager_User_Adapter extends RecyclerView.Adapter<Manager_User_Adapter.ViewHolder> {

    private ArrayList<Manager_User_Data> Data_arrayList;

    public Manager_User_Adapter(ArrayList<Manager_User_Data>arrayList){
        this.Data_arrayList= arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_list,parent,false);
        ViewHolder holder= new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //holder.text_user_list.setText(Data_arrayList.get(position).getMessage());

        holder.manager_user_name.setText(Data_arrayList.get(position).getUser_name());
        holder.manager_user_age.setText(Data_arrayList.get(position).getUser_age());
        holder.manager_user_address.setText(Data_arrayList.get(position).getUser_address());
        holder.manager_user_sex.setText(Data_arrayList.get(position).getUser_sex());
        holder.manager_user_phnumber.setText(Data_arrayList.get(position).getUser_ph_number());

        //holder.img_user_list.setImageResource(Data_arrayList.get(position).getResourceId());
        holder.manager_user_image.setImageResource(Data_arrayList.get(position).getUser_image());





    }

    @Override
    public int getItemCount() {

        return (null != Data_arrayList ? Data_arrayList.size() :0);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
       // ImageView img_user_list;
        ImageView manager_user_image;
        TextView manager_user_name;
        TextView manager_user_age;
        TextView manager_user_address;
        TextView manager_user_sex;
        TextView manager_user_phnumber;
       // TextView text_user_list;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //img_user_list = (ImageView) itemView.findViewById(R.id.manager_user_image);
            //text_user_list = itemView.findViewById(R.id.manager_user_name);

            manager_user_image = (ImageView) itemView.findViewById(R.id.manager_user_image);
            manager_user_name = (TextView) itemView.findViewById(R.id.manager_user_name);



            manager_user_name = itemView.findViewById(R.id.manager_user_name);
            manager_user_age = itemView.findViewById(R.id.manager_user_age);
            manager_user_address = itemView.findViewById(R.id.manger_user_address);
            manager_user_sex = itemView.findViewById(R.id.manager_user_sex);
            manager_user_phnumber = itemView.findViewById(R.id.manager_user_phnumber);

        }


    }




}

