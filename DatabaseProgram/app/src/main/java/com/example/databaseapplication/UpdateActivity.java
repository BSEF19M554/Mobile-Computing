package com.example.databaseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {

    EditText et1, et2;
    Switch s1;
    Button buttonDelete, buttonUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        et1 = findViewById(R.id.editTextNameCustom);
        et2 = findViewById(R.id.editTextRollNumberCustom);
        s1 = findViewById(R.id.switchStudentCustom);
        buttonDelete = findViewById(R.id.buttonDelete);
        buttonUpdate = findViewById(R.id.buttonUpdate);

        Intent intent = getIntent();
        int ID = Integer.parseInt(intent.getStringExtra("ID"));
        String Name = intent.getStringExtra("Name");
        String Roll = intent.getStringExtra("Roll");
        String EnrollStat = intent.getStringExtra("EnrollStat");

        if(EnrollStat.equals("Enrolled"))
            s1.setChecked(true);
        else
            s1.setChecked(false);

        et1.setText(Name);
        et2.setText(Roll);

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper  = new DBHelper(UpdateActivity.this);
                dbHelper.deleteRecord(ID);
                Toast.makeText(UpdateActivity.this, "Record deleted.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(UpdateActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(UpdateActivity.this);
                dbHelper.updateRecord(ID, et1.getText().toString(), et2.getText().toString(), s1.isChecked());
                Toast.makeText(UpdateActivity.this, "Record updated.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(UpdateActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}