package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView myList;
    String[] myString = {"Lahore", "Islamabad", "Faisalabad", "Sialkot", "Sargodha", "Karachi", "Hyderabad", "Sukkur", "Rawalpindi", "Pindi Bhattian", "Chaghi", "Rawalakot"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = findViewById(R.id.list);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, myString);
        myList.setAdapter(myAdapter);

        myList.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(MainActivity.this, "Clicked " + myString[i], Toast.LENGTH_SHORT).show());
    }
}