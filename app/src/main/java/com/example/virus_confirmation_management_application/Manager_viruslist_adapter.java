package com.example.virus_confirmation_management_application;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Manager_viruslist_adapter extends RecyclerView.Adapter<Manager_viruslist_adapter.CustomViewHolder> {

    private ArrayList<Manager_viruslist_Data> arrayList;

    public  Manager_viruslist_adapter(ArrayList<Manager_viruslist_Data> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public Manager_viruslist_adapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_virpeoplelist,parent,false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Manager_viruslist_adapter.CustomViewHolder holder, int position) {
        holder.img_viruslist_pelple.setImageResource(arrayList.get(position).getImg_viruslist_pelple());
        holder.text_vruslist_name.setText(arrayList.get(position).getText_vruslist_name());
        holder.text_vruslist_age.setText(arrayList.get(position).getText_vruslist_age());

        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                String curName = holder.text_vruslist_name.getText().toString();
                Toast.makeText(v.getContext(),curName,Toast.LENGTH_SHORT).show();

            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                remove(holder.getAdapterPosition());
                return;

            }
        });


    }

    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() : 0);
    }

    public void remove(int position) {
        try {
            arrayList.remove(position);
            notifyItemRemoved(position);

        }catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected ImageView img_viruslist_pelple;
        protected TextView text_vruslist_name;
        protected TextView text_vruslist_age;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.img_viruslist_pelple = (ImageView) itemView.findViewById(R.id.img_viruslist_pelple);
            this.text_vruslist_name = (TextView) itemView.findViewById(R.id.text_vruslist_name);
            this.text_vruslist_age = (TextView) itemView.findViewById(R.id.text_vruslist_age);


        }
    }
}
