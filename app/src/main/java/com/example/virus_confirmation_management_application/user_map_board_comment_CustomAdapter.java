package com.example.virus_confirmation_management_application;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class user_map_board_comment_CustomAdapter extends RecyclerView.Adapter<user_map_board_comment_CustomAdapter.ViewHolder> {

    private ArrayList<user_map_board_comment_item> mboardcommentIteArrayList;





    @NonNull
    @Override
    public user_map_board_comment_CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_map_board_comment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull user_map_board_comment_CustomAdapter.ViewHolder holder, int position) {
        holder.onBind(mboardcommentIteArrayList.get(position));
    }

    public void setMboardcommentIteArrayList(ArrayList<user_map_board_comment_item> list){
        this.mboardcommentIteArrayList = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mboardcommentIteArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView cmt_content_tv;
        TextView cmt_date_tv;
        TextView cmt_userid_tv;
        TextView board_like;
        TextView board_chat;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cmt_content_tv = (TextView) itemView.findViewById(R.id.cmt_content_tv);
            cmt_date_tv = (TextView) itemView.findViewById(R.id.cmt_date_tv);
            cmt_userid_tv = (TextView) itemView.findViewById(R.id.cmt_userid_tv);
            board_like = (TextView) itemView.findViewById(R.id.board_like);
            board_chat = (TextView) itemView.findViewById(R.id.board_chat);


        }

        void onBind(user_map_board_comment_item item){
            cmt_content_tv.setText(item.getComment());
            cmt_date_tv.setText(item.getBoard_date());
            cmt_userid_tv.setText(item.getUser_id());

        }
    }
}
