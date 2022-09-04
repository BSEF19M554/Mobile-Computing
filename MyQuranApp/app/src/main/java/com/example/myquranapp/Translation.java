package com.example.myquranapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Translation extends AppCompatActivity {

    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation);

        b1 = findViewById(R.id.fateh_urdu);
        b2 = findViewById(R.id.mehmood_urdu);
        b3 = findViewById(R.id.dr_english);
        b4 = findViewById(R.id.mufti_english);

        Intent intent = getIntent();
        int index = intent.getIntExtra("Index", 0);
        String type = intent.getStringExtra("Type");
//        int start = intent.getIntExtra("Start",-1);
//        int end = intent.getIntExtra("End",-1);

        Intent newIntent = new Intent(Translation.this, AyahView.class);
//        newIntent.putExtra("Start", start);
//        newIntent.putExtra("End", end);
        newIntent.putExtra("Index", index);
        newIntent.putExtra("Type", type);

        //Toast.makeText(this, "Type" + type, Toast.LENGTH_SHORT).show();

        b1.setOnClickListener(view -> {
            newIntent.putExtra("Translation", "urdu1");
            startActivity(newIntent);
        });

        b2.setOnClickListener(view -> {
            newIntent.putExtra("Translation", "urdu2");
            startActivity(newIntent);
        });

        b3.setOnClickListener(view -> {
            newIntent.putExtra("Translation", "eng1");
            startActivity(newIntent);
        });

        b4.setOnClickListener(view -> {
            newIntent.putExtra("Translation", "eng2");
            startActivity(newIntent);
        });
    }
}