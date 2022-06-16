package com.example.virus_confirmation_management_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class user_map_board_comment_CustomAdapter extends RecyclerView.Adapter<user_map_board_comment_CustomAdapter.CustomViewHolder> {

    private ArrayList<user_map_board_comment_item> mboardcommentIteArrayList;
    private Context context;


    public user_map_board_comment_CustomAdapter(ArrayList<user_map_board_comment_item> mboardcommentIteArrayList,Context context) {
        this.context = context;
        this.mboardcommentIteArrayList= mboardcommentIteArrayList;


    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_map_board_comment_item, parent, false);
        CustomViewHolder holder =new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.cmt_date_tv.setText(mboardcommentIteArrayList.get(position).getTime());
        holder.cmt_userid_tv.setText(mboardcommentIteArrayList.get(position).getName());
        holder.cmt_content_tv.setText(mboardcommentIteArrayList.get(position).getContent());


    }

    public void setMboardcommentIteArrayList(ArrayList<user_map_board_comment_item> list){
        this.mboardcommentIteArrayList = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mboardcommentIteArrayList != null ? mboardcommentIteArrayList.size():0;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView cmt_content_tv;
        TextView cmt_date_tv;
        TextView cmt_userid_tv;



        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            cmt_content_tv = (TextView) itemView.findViewById(R.id.cmt_content_tv);
            cmt_date_tv = (TextView) itemView.findViewById(R.id.cmt_date_tv);
            cmt_userid_tv = (TextView) itemView.findViewById(R.id.cmt_userid_tv);



        }


    }
}
