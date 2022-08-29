package com.example.myquranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class AyahView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayah_view);

        Intent intent = getIntent();
//        int start = intent.getIntExtra("Start",-1);
//        int end = intent.getIntExtra("End",-1);
        int index = intent.getIntExtra("Index", 0);
        String type = intent.getStringExtra("Type");
        String translation = intent.getStringExtra("Translation");

        //Toast.makeText(this, "Type " + type, Toast.LENGTH_SHORT).show();

//        DataObject dataObject = new DataObject();
        DBHelper dbHelper = new DBHelper(AyahView.this);

//        String[] verses = Arrays.copyOfRange(dataObject.QuranArabicText, start-1, end-1);
        ArrayList<String> verses = dbHelper.populateAyah(type, index);
        ArrayList<String> Translated = dbHelper.translation(type, translation, index);

        ListView listview = findViewById(R.id.listAyah);
        CustomBaseAdapter cba = new CustomBaseAdapter(getApplicationContext(), verses, Translated);
        listview.setAdapter(cba);
    }
}