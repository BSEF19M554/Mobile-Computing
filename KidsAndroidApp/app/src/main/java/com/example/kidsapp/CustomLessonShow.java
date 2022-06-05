package com.example.kidsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class CustomLessonShow extends AppCompatActivity {

    ListView myList;
    String[] myAlphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_lesson_show);

        myList = findViewById(R.id.list);
        CustomBaseAdapter cba = new CustomBaseAdapter(getApplicationContext(), myAlphabets);
        myList.setAdapter(cba);

        myList.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(CustomLessonShow.this, ImageShow.class);
            intent.putExtra("alphabet", myAlphabets[i]);
            startActivity(intent);
        });
    }
}