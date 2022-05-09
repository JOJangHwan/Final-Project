package com.example.virus_confirmation_management_application;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class user_selftest extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_selftest_activity);


        Spinner selftest_C_ComboBox = (Spinner)findViewById(R.id.selftest_C_ComboBox);
        ArrayAdapter numAdapter = ArrayAdapter.createFromResource(this,
                R.array.self_temperature, android.R.layout.simple_spinner_item);
        numAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selftest_C_ComboBox.setAdapter(numAdapter);
        selftest_C_ComboBox.setSelection(0); //스피너 초반설정값 설정

    }
}
