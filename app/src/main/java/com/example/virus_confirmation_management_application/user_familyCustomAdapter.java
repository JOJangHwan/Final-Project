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
    gramer : 윤승준 내부 기능 및 UI 담당
 */
public class user_familyCustomAdapter extends RecyclerView.Adapter<user_familyCustomAdapter.ViewHolder> {

    private ArrayList<user_familyItem> mfamilyArrayList;





    @NonNull
    @Override
    public user_familyCustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_family_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull user_familyCustomAdapter.ViewHolder holder, int position) {
        holder.onBind(mfamilyArrayList.get(position));
    }

    public void setMfamilyIteArrayList(ArrayList<user_familyItem> list){
        this.mfamilyArrayList = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mfamilyArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;
        TextView vacnum;
        TextView userstate;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.family_image);
            name = (TextView) itemView.findViewById(R.id.tv_name);
            vacnum = (TextView) itemView.findViewById(R.id.tv_vacnum);
            userstate = (TextView) itemView.findViewById(R.id.tv_userstate);

        }

        void onBind(user_familyItem item){
            image.setImageResource(item.getImage());
            name.setText(item.getName());
            vacnum.setText(item.getVacnum());
            userstate.setText(item.getUserstate());
        }
    }
}
