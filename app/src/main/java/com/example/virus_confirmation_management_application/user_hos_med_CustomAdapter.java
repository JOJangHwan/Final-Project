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
public class user_hos_med_CustomAdapter extends RecyclerView.Adapter<user_hos_med_CustomAdapter.ViewHolder> {

    private ArrayList<user_hos_med_Item> mhosmedArrayList;





    @NonNull
    @Override
    public user_hos_med_CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_hos_med_information_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull user_hos_med_CustomAdapter.ViewHolder holder, int position) {
        holder.onBind(mhosmedArrayList.get(position));
    }

    public void setMhosmedIteArrayList(ArrayList<user_hos_med_Item> list){
        this.mhosmedArrayList = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mhosmedArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;
        TextView general;
        TextView number;
        TextView time;
        TextView address;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.hos_med_image);
            name = (TextView) itemView.findViewById(R.id.hos_med_name);
            general = (TextView) itemView.findViewById(R.id.hos_med_general);
            number = (TextView) itemView.findViewById(R.id.hos_med_number);
            time = (TextView) itemView.findViewById(R.id.hos_med_time);
            address = (TextView) itemView.findViewById(R.id.hos_med_address);
        }

        void onBind(user_hos_med_Item item){
            image.setImageResource(item.getImage());
            name.setText(item.getName());
            general.setText(item.getGeneral());
            number.setText(item.getNumber());
            time.setText(item.getTime());
            address.setText(item.getAddress());

        }
    }
}
