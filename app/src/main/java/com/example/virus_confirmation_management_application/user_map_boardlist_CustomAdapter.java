package com.example.virus_confirmation_management_application;

import static java.lang.Math.log;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class user_map_boardlist_CustomAdapter extends RecyclerView.Adapter<user_map_boardlist_CustomAdapter.CustomViewHolder> {

    private ArrayList<user_map_boardlist_item> mboardlistIteArrayList;
    private Context context;

    //public user_map_boardlist_CustomAdapter(ArrayList<user_map_boardlist_item> mboardlistIteArrayList);



    public user_map_boardlist_CustomAdapter(ArrayList<user_map_boardlist_item> mboardlistIteArrayList,Context context) {
        this.context = context;
        this.mboardlistIteArrayList= mboardlistIteArrayList;


    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_map_boardlist_item, parent, false);
        CustomViewHolder holder =new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        holder.tittle.setText(mboardlistIteArrayList.get(position).getTittle());
        holder.content.setText(mboardlistIteArrayList.get(position).getContent());
        holder.name.setText(mboardlistIteArrayList.get(position).getName());
        holder.Time.setText(mboardlistIteArrayList.get(position).getTime());
        holder.board_chat.setText(mboardlistIteArrayList.get(position).getChattingnum());
    }

    @Override
    public int getItemCount() {
        return (mboardlistIteArrayList != null ? mboardlistIteArrayList.size():0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView tittle;
        TextView Time;
        TextView name;
        TextView content;
        TextView board_chat;


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            tittle = itemView.findViewById(R.id.board_tittle);
            Time = itemView.findViewById(R.id.board_date);
            name =  itemView.findViewById(R.id.board_userid);
            content = (TextView) itemView.findViewById(R.id.board_chat);
            board_chat = (TextView) itemView.findViewById(R.id.board_chat);


        }


    }

}
