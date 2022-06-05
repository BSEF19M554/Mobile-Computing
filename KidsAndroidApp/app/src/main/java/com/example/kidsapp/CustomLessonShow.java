package com.example.kidsapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CustomLessonShow extends AppCompatActivity {

    ListView myList;
    String[] myAlphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_lesson_show);

        myList = findViewById(R.id.list);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(CustomLessonShow.this, android.R.layout.simple_dropdown_item_1line, myAlphabets);
        myList.setAdapter(myAdapter);

        myList.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(CustomLessonShow.this, "Clicked " + myAlphabets[i], Toast.LENGTH_SHORT).show());
    }
}