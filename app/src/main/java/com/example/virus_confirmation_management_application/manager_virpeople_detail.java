/*
2017243053 조장환

 */
package com.example.virus_confirmation_management_application;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class manager_virpeople_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_virpeople_detail);


        Bundle extras = getIntent().getExtras();

        int viruserimage = extras.getInt("viruserimage");
        ImageView ig_viruserimage = (ImageView) findViewById(R.id.viruserimage_imageview_detail);
        //tv_userimage.setImageResource(userimage);

        String virusername = extras.getString("virusername");
        TextView tv_virusername = (TextView) findViewById(R.id.virusername_textview_detail);
        //tv_userage.setText(userage);

        String viruserage = extras.getString("viruserage");
        TextView tv_viruserage = (TextView) findViewById(R.id.viruserage_textview_detail);
        //tv_username.setText(username);

        String viruserph_number = extras.getString("viruserph_number");
        TextView tv_viruserph_number = (TextView) findViewById(R.id.viruserphnumber_textview_detail);
        //tv_userarea.setText(userarea);

        String virusersex = extras.getString("virusersex");
        TextView tv_virusersex = (TextView) findViewById(R.id.virusersex_textview_detail);
        //tv_userarea.setText(userarea);

        String viruseraddress = extras.getString("viruseraddress");
        TextView tv_viruseraddress = (TextView) findViewById(R.id.viruseraddress_textview_detail);
        //tv_userphnumber.setText(userphnumber);


        ig_viruserimage.setImageResource(viruserimage);
        tv_virusername.setText("이름 : "+virusername);
        tv_viruserage.setText("나이 : "+viruserage);
        tv_viruserph_number.setText("전화번호 : "+viruserph_number);
        tv_virusersex.setText("성별 : "+virusersex);
        tv_viruseraddress.setText("주소 : "+viruseraddress);

        //tv_usergeneral.setText(hos_med+general);
        //tv_usernumber.setText("전화번호 : "+number);
        //tv_usertime.setText("영업시간 : "+time);
        //tv_useraddress.setText("주소 : "+address);
    }
}