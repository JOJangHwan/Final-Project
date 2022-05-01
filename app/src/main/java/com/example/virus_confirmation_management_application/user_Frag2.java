package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import me.relex.circleindicator.CircleIndicator3;

public class user_Frag2 extends Fragment {
    private View view;
    static int a =0;
    private ViewPager2 mPager;
    private FragmentStateAdapter pagerAdapter;
    private int num_page = 4;
    private CircleIndicator3 mIndicator;



    @Override
    public void onStart() {
        super.onStart();

        /**
         * 가로 슬라이드 뷰 Fragment
         */

        //ViewPager2
        mPager = getView().findViewById(R.id.viewpager);
        //Adapter
        pagerAdapter = new user_slider_Adapter(getActivity(), num_page);
        if(a==0){
            mPager.setAdapter(pagerAdapter); //충돌로 인한 스태틱값을 이용한 한번만 선언하기
        }
        a++;
        //Indicator
        mIndicator = getView().findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        mIndicator.createIndicators(num_page,0);
        //ViewPager Setting
        mPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        /**
         * 이 부분 조정하여 처음 시작하는 이미지 설정.
         * 2000장 생성하였으니 현재위치 1002로 설정하여
         * 좌 우로 슬라이딩 할 수 있게 함. 거의 무한대로
         */

        mPager.setCurrentItem(1000); //시작 지점
        mPager.setOffscreenPageLimit(4); //최대 이미지 수

        mPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                if (positionOffsetPixels == 0) {
                    mPager.setCurrentItem(position);
                }
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                mIndicator.animatePageSelected(position%num_page);
            }
        });
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.user_activity_main, container, false);

        ImageButton virusinformation_button = (ImageButton) view.findViewById(R.id.virusinformation_button);
        virusinformation_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(),user_virusinformationlist.class);
            startActivity(intent);
        }
    });


        ImageButton selftest_button = (ImageButton) view.findViewById(R.id.selftest_button);
        selftest_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_selftest.class);
                startActivity(intent);
            }
        });


        ImageButton govguid_button = (ImageButton) view.findViewById(R.id.govguid_button);
        govguid_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_govguide.class);
                startActivity(intent);
            }
        });

        ImageButton QandA_button = (ImageButton) view.findViewById(R.id.QandA_button);
        QandA_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_QandA.class);
                startActivity(intent);
            }
        });
        ImageButton nearhosfind_button = (ImageButton) view.findViewById(R.id.nearhosfind_button);
        nearhosfind_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_nearhosfind.class);
                startActivity(intent);
            }
        });
        ImageButton myvaccine_button = (ImageButton) view.findViewById(R.id.myvaccine_button);
        myvaccine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),user_myvaccine.class);
                startActivity(intent);
            }
        });


        return view;

    }


}
