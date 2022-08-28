package com.example.myquranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BySurah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_by_surah);

        DBHelper dbHelper = new DBHelper(BySurah.this);
        ArrayList<Names> myList = dbHelper.populateSurah();

        MainAdapter arrayAdapter = new MainAdapter(BySurah.this, android.R.layout.simple_list_item_1, myList);
        ListView listView = findViewById(R.id.listSurah);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                DataObject dataObject = new DataObject();
                int start = dataObject.getSurahStart(i);
                int end;
                try{
                    end = dataObject.getSurahStart(i+1);
                }
                catch (Exception e){
                    end = DataObject.QuranArabicText.length+1;
                }
                Intent intent = new Intent(BySurah.this, Translation.class);
                intent.putExtra("Start", start);
                intent.putExtra("End",end);
                startActivity(intent);
            }
        });
    }
}