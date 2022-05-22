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

            case "J":
                myText.setText(R.string.alphabetJ);
                myImg.setImageResource(R.drawable.j);
                break;

            case "K":
                myText.setText(R.string.alphabetK);
                myImg.setImageResource(R.drawable.k);
                break;

            case "L":
                myText.setText(R.string.alphabetL);
                myImg.setImageResource(R.drawable.l);
                break;

            case "M":
                myText.setText(R.string.alphabetM);
                myImg.setImageResource(R.drawable.m);
                break;

            case "N":
                myText.setText(R.string.alphabetN);
                myImg.setImageResource(R.drawable.n);
                break;

            case "O":
                myText.setText(R.string.alphabetO);
                myImg.setImageResource(R.drawable.o);
                break;

            case "P":
                myText.setText(R.string.alphabetP);
                myImg.setImageResource(R.drawable.p);
                break;

            case "Q":
                myText.setText(R.string.alphabetQ);
                myImg.setImageResource(R.drawable.q);
                break;

            case "R":
                myText.setText(R.string.alphabetR);
                myImg.setImageResource(R.drawable.r);
                break;

            case "S":
                myText.setText(R.string.alphabetS);
                myImg.setImageResource(R.drawable.s);
                break;

            case "T":
                myText.setText(R.string.alphabetT);
                myImg.setImageResource(R.drawable.t);
                break;

            case "U":
                myText.setText(R.string.alphabetU);
                myImg.setImageResource(R.drawable.u);
                break;

            case "V":
                myText.setText(R.string.alphabetV);
                myImg.setImageResource(R.drawable.v);
                break;

            case "W":
                myText.setText(R.string.alphabetW);
                myImg.setImageResource(R.drawable.w);
                break;

            case "X":
                myText.setText(R.string.alphabetX);
                myImg.setImageResource(R.drawable.x);
                break;

            case "Y":
                myText.setText(R.string.alphabetY);
                myImg.setImageResource(R.drawable.y);
                break;

            case "Z":
                myText.setText(R.string.alphabetZ);
                myImg.setImageResource(R.drawable.z);
                break;
        }
    }
}