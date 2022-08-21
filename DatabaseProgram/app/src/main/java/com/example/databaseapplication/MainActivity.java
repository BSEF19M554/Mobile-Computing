package com.example.databaseapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText editName, editRollNumber;
    Switch switchIsActive;
    Button buttonAdd, buttonViewAll;
    ListView listViewStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonViewAll = findViewById(R.id.buttonViewAll);
        editName = findViewById(R.id.editTextName);
        editRollNumber = findViewById(R.id.editTextRollNumber);
        switchIsActive = findViewById(R.id.switchStudent);
        listViewStudent = findViewById(R.id.listViewStudent);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            StudentModel studentModel;

            @Override
            public void onClick(View v) {
                try {
                    studentModel = new StudentModel(editName.getText().toString(), Integer.parseInt(editRollNumber.getText().toString()), switchIsActive.isChecked());
                    //Toast.makeText(MainActivity.this, studentModel.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
                DBHelper dbHelper  = new DBHelper(MainActivity.this);
                dbHelper.addStudent(studentModel);
            }
        });

        buttonViewAll.setOnClickListener(v -> {
            DBHelper dbHelper = new DBHelper(MainActivity.this);
            List<StudentModel> list = dbHelper.getAllStudents();

            CustomBaseAdapter cba = new CustomBaseAdapter(getApplicationContext(), list);
            listViewStudent.setAdapter(cba);
            listViewStudent.setOnItemClickListener((adapterView, view, i, l) -> {
                Intent intent = new Intent(MainActivity.this, UpdateActivity.class);
                intent.putExtra("Name", list.get(i).getName());
                intent.putExtra("Roll", String.valueOf(list.get(i).getRollNmber()));

                boolean bool = list.get(i).isEnroll();
                if(bool == true)
                    intent.putExtra("EnrollStat", "Enrolled");
                else
                    intent.putExtra("EnrollStat", "Not Enrolled");

                startActivity(intent);
            });
        });
    }
}