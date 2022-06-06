package com.example.virus_confirmation_management_application;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class user_map_boardlist_CustomAdapter extends RecyclerView.Adapter<user_map_boardlist_CustomAdapter.ViewHolder> {

    private ArrayList<user_map_boardlist_item> mboardlistIteArrayList;





    @NonNull
    @Override
    public user_map_boardlist_CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_map_boardlist_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull user_map_boardlist_CustomAdapter.ViewHolder holder, int position) {
        holder.onBind(mboardlistIteArrayList.get(position));
    }

    public void setMboardlistIteArrayList(ArrayList<user_map_boardlist_item> list){
        this.mboardlistIteArrayList = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mboardlistIteArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView board_tittle;
        TextView board_date;
        TextView board_userid;
        TextView board_like;
        TextView board_chat;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            board_tittle = (TextView) itemView.findViewById(R.id.board_tittle);
            board_date = (TextView) itemView.findViewById(R.id.board_date);
            board_userid = (TextView) itemView.findViewById(R.id.board_userid);
            board_like = (TextView) itemView.findViewById(R.id.board_like);
            board_chat = (TextView) itemView.findViewById(R.id.board_chat);


        }

        void onBind(user_map_boardlist_item item){
            board_tittle.setText(item.getBoard_tittle());
            board_date.setText(item.getBoard_date());
            board_userid.setText(item.getUser_id());
            board_like.setText(String.valueOf(item.getBoard_like_num()));
            board_chat.setText(String.valueOf(item.getBoard_chat_num()));

        }
    }
}
