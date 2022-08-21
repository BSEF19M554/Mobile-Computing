package com.example.databaseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Switch;

public class UpdateActivity extends AppCompatActivity {

    EditText et1, et2;
    Switch s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        et1 = findViewById(R.id.editTextNameCustom);
        et2 = findViewById(R.id.editTextRollNumberCustom);
        s1 = findViewById(R.id.switchStudentCustom);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("Name");
        String Roll = intent.getStringExtra("Roll");
        String EnrollStat = intent.getStringExtra("EnrollStat");

        if(EnrollStat.equals("Enrolled"))
            s1.setChecked(true);
        else
            s1.setChecked(false);

        et1.setText(Name);
        et2.setText(Roll);
    }
}