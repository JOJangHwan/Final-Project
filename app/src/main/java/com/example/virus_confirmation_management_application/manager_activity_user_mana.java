package com.example.virus_confirmation_management_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class manager_activity_user_mana extends AppCompatActivity {

    //private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_activity_user_mana);

       // list = (ListView)findViewById(R.id.list);

        //List<String> data = new ArrayList<>(); // 배열선언

        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data); //중간다리인 adapter 생성
       // list.setAdapter(adapter); //연결 위에 21번줄

        //data.add("최우식");
       // data.add("김다미");
        //data.add("박서준");
        //adapter.notifyDataSetChanged();
    }
}