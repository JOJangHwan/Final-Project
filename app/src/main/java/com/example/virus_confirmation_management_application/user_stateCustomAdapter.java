package com.example.virus_confirmation_management_application;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class user_stateCustomAdapter extends RecyclerView.Adapter<user_stateCustomAdapter.ViewHolder> {

    private ArrayList<user_stateItem> mstateIteArrayList;





    @NonNull
    @Override
    public user_stateCustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_statelist_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull user_stateCustomAdapter.ViewHolder holder, int position) {
        holder.onBind(mstateIteArrayList.get(position));
    }

    public void setMstateIteArrayList(ArrayList<user_stateItem> list){
        this.mstateIteArrayList = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mstateIteArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView num;
        TextView tittle;
        TextView date;
        TextView answercheck;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            num = (TextView) itemView.findViewById(R.id.tv_num);
            tittle = (TextView) itemView.findViewById(R.id.tv_tittle);
            date = (TextView) itemView.findViewById(R.id.tv_date);
            answercheck = (TextView) itemView.findViewById(R.id.tv_answercheck);

        }

        void onBind(user_stateItem item){
            num.setText(item.getNum());
            tittle.setText(item.getTittle());
            date.setText(item.getDate());
            answercheck.setText(item.getAnswercheck());
        }
    }
}
