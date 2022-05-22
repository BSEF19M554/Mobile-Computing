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

        switch(val){
            case "A":
                myText.setText(R.string.alphabetA);
                myImg.setImageResource(R.drawable.a);
                break;

            case "B":
                myText.setText(R.string.alphabetB);
                myImg.setImageResource(R.drawable.b);
                break;

            case "C":
                myText.setText(R.string.alphabetC);
                myImg.setImageResource(R.drawable.c);
                break;

            case "D":
                myText.setText(R.string.alphabetD);
                myImg.setImageResource(R.drawable.d);
                break;

            case "E":
                myText.setText(R.string.alphabetE);
                myImg.setImageResource(R.drawable.e);
                break;

            case "F":
                myText.setText(R.string.alphabetF);
                myImg.setImageResource(R.drawable.f);
                break;

            case "G":
                myText.setText(R.string.alphabetG);
                myImg.setImageResource(R.drawable.g);
                break;

            case "H":
                myText.setText(R.string.alphabetH);
                myImg.setImageResource(R.drawable.h);
                break;

            case "I":
                myText.setText(R.string.alphabetI);
                myImg.setImageResource(R.drawable.i);
                break;
        }
    }
}