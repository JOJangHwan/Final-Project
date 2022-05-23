package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class user_virusinformation_influ extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_virusinformation_influenza);

    }
    public void onButton1Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kdca.go.kr/npt/biz/npp/portal/nppPblctDtaView.do?pblctDtaSeAt=8&pblctDtaSn=877"));
        startActivity(intent);
    }
}
