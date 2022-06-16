package com.example.virus_confirmation_management_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import static com.example.virus_confirmation_management_application.user_Frag2.a;
import static com.example.virus_confirmation_management_application.user_bottomnavi.pagedata;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/*
    gramer : 윤승준  UI
 */
public class user_selftest extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_selftest_activity);



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





        Spinner selftest_C_ComboBox = (Spinner)findViewById(R.id.selftest_C_ComboBox);
        ArrayAdapter numAdapter = ArrayAdapter.createFromResource(this,
                R.array.self_temperature, android.R.layout.simple_spinner_item);
        numAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selftest_C_ComboBox.setAdapter(numAdapter);
        selftest_C_ComboBox.setSelection(0); //스피너 초반설정값 설정


        final RadioGroup Group1 = (RadioGroup)findViewById(R.id.group1);
        final RadioGroup Group2 = (RadioGroup)findViewById(R.id.group2);
        final RadioGroup Group3 = (RadioGroup)findViewById(R.id.group3);
        final RadioGroup Group4 = (RadioGroup)findViewById(R.id.group4);
        final RadioGroup Group5 = (RadioGroup)findViewById(R.id.group5);
        final RadioGroup Group6 = (RadioGroup)findViewById(R.id.group6);
        final RadioGroup Group7 = (RadioGroup)findViewById(R.id.group7);
        final RadioGroup Group8 = (RadioGroup)findViewById(R.id.group8);
        final RadioGroup Group9 = (RadioGroup)findViewById(R.id.group9);
        final RadioGroup Group10 = (RadioGroup)findViewById(R.id.group10);

        Button submit = (Button)findViewById(R.id.myselftest_button);

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(user_selftest.this);

                String answer1 = getG1(v);
                String answer2 = getG2(v);
                String answer3 = getG3(v);
                String answer4 = getG4(v);
                String answer5 = getG5(v);
                String answer6 = getG6(v);
                String answer7 = getG7(v);
                String answer8 = getG8(v);
                String answer9 = getG9(v);
                String answer10 = getG10(v);

                if(answer1 == null || answer2 == null || answer3 == null || answer4 == null || answer5 == null || answer6 == null || answer7 == null || answer8 == null || answer9 == null || answer10 == null){
                    dialog.setTitle("결과");
                    dialog.setMessage("전부 입력되지 않았습니다.");
                    dialog.setPositiveButton("확인", null);
                    dialog.show();
                }else{
                    int count = 0;

                    if(answer1.equals("네")){
                        count++;
                    }
                    if(answer4.equals("네")){
                        count++;
                    }
                    if(answer5.equals("네")){
                        count++;
                    }
                    if(answer9.equals("네")){
                        count++;
                    }
                    if(answer10.equals("네")){
                        count++;
                    }

                    if(count >= 3){
                        dialog.setTitle("결과");
                        dialog.setMessage("확진일 확률 높음!");
                        dialog.setPositiveButton("확인", null);
                        dialog.show();
                    }else if(count >= 1){
                        dialog.setTitle("결과");
                        dialog.setMessage("확진일 수 있습니다.");
                        dialog.setPositiveButton("확인", null);
                        dialog.show();
                    }else {
                        dialog.setTitle("결과");
                        dialog.setMessage("확진일 확률 낮음");
                        dialog.setPositiveButton("확인", null);
                        dialog.show();
                    }
                }
            }
        });
    }

    public String getG1(View v){
        RadioButton g1y = (RadioButton)findViewById(R.id.g1y);
        RadioButton g1n = (RadioButton)findViewById(R.id.g1n);
        String answer1 = null;

        if(g1y.isChecked()){
            answer1 = g1y.getText().toString();
        }else if(g1n.isChecked()){
            answer1 = g1n.getText().toString();
        }
        return  answer1;
    }

    public String getG2(View v){
        RadioButton g2y = (RadioButton)findViewById(R.id.g2y);
        RadioButton g2n = (RadioButton)findViewById(R.id.g2n);
        String answer2 = null;

        if(g2y.isChecked()){
            answer2 = g2y.getText().toString();
        }else if(g2n.isChecked()){
            answer2 = g2n.getText().toString();
        }
        return  answer2;
    }

    public String getG3(View v){
        RadioButton g3y = (RadioButton)findViewById(R.id.g3y);
        RadioButton g3n = (RadioButton)findViewById(R.id.g3n);
        String answer3 = null;

        if(g3y.isChecked()){
            answer3 = g3y.getText().toString();
        }else if(g3n.isChecked()){
            answer3 = g3n.getText().toString();
        }
        return  answer3;
    }

    public String getG4(View v){
        RadioButton g4y = (RadioButton)findViewById(R.id.g4y);
        RadioButton g4n = (RadioButton)findViewById(R.id.g4n);
        String answer4 = null;

        if(g4y.isChecked()){
            answer4 = g4y.getText().toString();
        }else if(g4n.isChecked()){
            answer4 = g4n.getText().toString();
        }
        return  answer4;
    }

    public String getG5(View v){
        RadioButton g5y = (RadioButton)findViewById(R.id.g5y);
        RadioButton g5n = (RadioButton)findViewById(R.id.g5n);
        String answer5 = null;

        if(g5y.isChecked()){
            answer5 = g5y.getText().toString();
        }else if(g5n.isChecked()){
            answer5 = g5n.getText().toString();
        }
        return  answer5;
    }

    public String getG6(View v){
        RadioButton g6y = (RadioButton)findViewById(R.id.g6y);
        RadioButton g6n = (RadioButton)findViewById(R.id.g6n);
        String answer6 = null;

        if(g6y.isChecked()){
            answer6 = g6y.getText().toString();
        }else if(g6n.isChecked()){
            answer6 = g6n.getText().toString();
        }
        return  answer6;
    }
    public String getG7(View v){
        RadioButton g7y = (RadioButton)findViewById(R.id.g7y);
        RadioButton g7n = (RadioButton)findViewById(R.id.g7n);
        String answer7 = null;

        if(g7y.isChecked()){
            answer7 = g7y.getText().toString();
        }else if(g7n.isChecked()){
            answer7 = g7n.getText().toString();
        }
        return  answer7;
    }

    public String getG8(View v){
        RadioButton g8y = (RadioButton)findViewById(R.id.g8y);
        RadioButton g8n = (RadioButton)findViewById(R.id.g8n);
        String answer8 = null;

        if(g8y.isChecked()){
            answer8 = g8y.getText().toString();
        }else if(g8n.isChecked()){
            answer8 = g8n.getText().toString();
        }
        return  answer8;
    }

    public String getG9(View v){
        RadioButton g9y = (RadioButton)findViewById(R.id.g9y);
        RadioButton g9n = (RadioButton)findViewById(R.id.g9n);
        String answer9 = null;

        if(g9y.isChecked()){
            answer9 = g9y.getText().toString();
        }else if(g9n.isChecked()){
            answer9 = g9n.getText().toString();
        }
        return  answer9;
    }

    public String getG10(View v){
        RadioButton g10y = (RadioButton)findViewById(R.id.g10y);
        RadioButton g10n = (RadioButton)findViewById(R.id.g10n);
        String answer10 = null;

        if(g10y.isChecked()){
            answer10 = g10y.getText().toString();
        }else if(g10n.isChecked()){
            answer10 = g10n.getText().toString();
        }
        return  answer10;
    }



}
