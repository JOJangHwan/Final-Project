package com.example.virus_confirmation_management_application;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;

public class user_announce extends AppCompatActivity implements View.OnClickListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_announce_activity);

        findViewById(R.id.an1).setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.an1:
                new AlertDialog.Builder(this)
                        .setTitle("공지사항")
                        .setMessage("22.05.22 ver1.0\n\n 버그가 다수 발생할 수 있습니다.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;
        }
    }

}
