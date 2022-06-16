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
public class Manager_QnA_Adapter extends RecyclerView.Adapter<Manager_QnA_Adapter.ViewHolder> {

    private ArrayList<Manager_QnA_Data> Data_arrayList;

    public Manager_QnA_Adapter(ArrayList<Manager_QnA_Data>arrayList){
        this.Data_arrayList= arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_qna_list,parent,false);
        ViewHolder holder= new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text_qnalist.setText(Data_arrayList.get(position).getMessage());
        holder.img_qnalist.setImageResource(Data_arrayList.get(position).getResourceId());

    }

    @Override
    public int getItemCount() {

        return (null != Data_arrayList ? Data_arrayList.size() :0);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img_qnalist;
        TextView text_qnalist;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_qnalist = (ImageView) itemView.findViewById(R.id.img_qnalist);
            text_qnalist = itemView.findViewById(R.id.text_qnalist);
        }


    }




}

