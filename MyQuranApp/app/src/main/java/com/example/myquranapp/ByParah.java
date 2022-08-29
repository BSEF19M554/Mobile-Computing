package com.example.myquranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ByParah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_by_parah);

        DataObject dataObject = new DataObject();
        List<Names> array = new ArrayList<>();
        for (int i = 0; i < dataObject.englishParahName.length; i++) {

            Names temp = new Names();
            temp.eng = dataObject.englishParahName[i];
            temp.urdu = dataObject.ParahName[i];
            array.add(temp);
        }

        MainAdapter arrayAdapter = new MainAdapter(ByParah.this, android.R.layout.simple_list_item_1, array);
        ListView listView = findViewById(R.id.listParah);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ByParah.this, Translation.class);
                intent.putExtra("Index", i);
                intent.putExtra("Type", "Parah");
                startActivity(intent);

//                int start = dataObject.getParahStart(i);
//                int end;
//                try{
//                    end = dataObject.getParahStart(i+1);
//                }catch (Exception e){
//                    end = DataObject.QuranArabicText.length+1;
//                }
//                Intent intent = new Intent(ByParah.this, Translation.class);
//                intent.putExtra("Start", start);
//                intent.putExtra("End",end);
//                startActivity(intent);
            }
        });
    }
}