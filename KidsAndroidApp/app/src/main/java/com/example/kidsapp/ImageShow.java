package com.example.kidsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageShow extends AppCompatActivity {

    TextView myText;
    ImageView myImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_show);

        myText = findViewById(R.id.Description);
        myImg = findViewById(R.id.myImage);
        Intent intent = getIntent();

        String val = intent.getStringExtra("alphabet");
        myText.setText(val);

        switch(val){
            case "A":
                myText.setText("Apple");
                myImg.setImageResource(R.drawable.a);
        }
    }
}