package com.example.virus_confirmation_management_application;

import static com.example.virus_confirmation_management_application.user_Frag2.a;
import static com.example.virus_confirmation_management_application.user_bottomnavi.pagedata;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class user_vaccineenroll extends AppCompatActivity {


    private final int GET_GALLERY_IMAGE = 200;
    private ImageView imageview;


    Calendar myCalendar = Calendar.getInstance();
    //다일로그 쓰기위한 날짜
    DatePickerDialog.OnDateSetListener myDatePicker = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, month);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateLabel();
        }
    };



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_vaccineenroll_activity);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_map:
                        pagedata=0;
                        Intent intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.action_main:
                        pagedata=1;
                        a=0;
                        intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.action_person:
                        pagedata=2;
                        intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                }
                return true;
            }
        });



        Button finish = (Button) findViewById(R.id.vaccineenroll_backButton);
        finish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //스피너는 콤보 박스다
        Spinner vaccineNUM = (Spinner)findViewById(R.id.vaccineenroll_num_ComboBox);
        ArrayAdapter numAdapter = ArrayAdapter.createFromResource(this,
                R.array.vaccineCheckNUM, android.R.layout.simple_spinner_item);
        numAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vaccineNUM.setAdapter(numAdapter);
        vaccineNUM.setSelection(0); //스피너 초반설정값 설정


        //사진 불러오는곳
        imageview = (ImageView)findViewById(R.id.imageView3);
        imageview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_PICK);
                intent. setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
                startActivityForResult(intent, GET_GALLERY_IMAGE);
            }
        });

        //날짜 설정
        EditText et_Date = (EditText) findViewById(R.id.Date);
        et_Date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(user_vaccineenroll.this, myDatePicker, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });



    }


    //사진불러오는것
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == GET_GALLERY_IMAGE && resultCode == RESULT_OK && data != null && data.getData() != null) {

            Uri selectedImageUri = data.getData();
            imageview.setImageURI(selectedImageUri);

        }

    }

    //라벨 업데이트 사용자 보여주기
    private void updateLabel() {
        String myFormat = "yyyy/MM/dd";    // 출력형식   2021/07/26
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.KOREA);

        EditText et_date = (EditText) findViewById(R.id.Date);
        et_date.setText(sdf.format(myCalendar.getTime()));
    }
}

