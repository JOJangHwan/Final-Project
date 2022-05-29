package com.example.virus_confirmation_management_application;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class user_myfamily extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private user_familyCustomAdapter mfamilyCustomAdapter;
    private ArrayList<user_familyItem> user_familyItem;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_myfamily_activity);

        Button addfamilyButton = (Button) findViewById(R.id.addfamilyButton);
        addfamilyButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), user_addfamily.class);
                startActivity(intent);
            }
        });


        //리싸이클러뷰

        mRecyclerView = (RecyclerView) findViewById(R.id.myfamily_recyclerview);

        /* initiate adapter */
        mfamilyCustomAdapter= new user_familyCustomAdapter();
        /* initiate recyclerview */
        mRecyclerView.setAdapter(mfamilyCustomAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        /* adapt data */
        user_familyItem = new ArrayList<>();
        for(int i=1;i<=10;i++) {
            if(i%2==0)
                user_familyItem.add(new user_familyItem(R.drawable.man,i+"번째 사람",i+"번째 상태메시지","코로나 감염"));
            else
                user_familyItem.add(new user_familyItem(R.drawable.woman,i+"번째 사람",i+"번째 상태메시지","정상"));
        }
        mfamilyCustomAdapter.setMfamilyIteArrayList(user_familyItem);




    }

}
