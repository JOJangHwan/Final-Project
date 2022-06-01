package com.example.virus_confirmation_management_application;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class user_slider_Adapter extends FragmentStateAdapter {

    public int mCount;

    public user_slider_Adapter(FragmentActivity fa, int count) {
        super(fa);
        mCount = count;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        int index = getRealPosition(position);

        if(index==0) return new user_slider_Fragment_1();
        else if(index==1) return new user_slider_Fragment_2();
        else return new user_slider_Fragment_3();
    }

    @Override
    public int getItemCount() {
        return 2000;
    }

    public int getRealPosition(int position) { return position % mCount; }

}