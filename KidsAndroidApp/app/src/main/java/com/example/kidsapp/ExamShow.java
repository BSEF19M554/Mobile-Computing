package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class ExamShow extends AppCompatActivity {

    ImageView examImg;
    Button op1, op2, op3, examButton;
    String option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_show);

        String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Random rand_obj = new Random();
        int rand_num = rand_obj.nextInt(26);
        examImg = findViewById(R.id.examImage);
        op1 = findViewById(R.id.option1);
        op2 = findViewById(R.id.option2);
        op3 = findViewById(R.id.option3);

        option = alphabets[rand_num];
        switch(alphabets[rand_num]){
            case "A":
                examImg.setImageResource(R.drawable.a);
                op1.setText("A");
                op2.setText("Y");
                op3.setText("J");
                break;

            case "B":
                examImg.setImageResource(R.drawable.b);
                op1.setText("S");
                op2.setText("B");
                op3.setText("L");
                break;

            case "C":
                examImg.setImageResource(R.drawable.c);
                op1.setText("C");
                op2.setText("I");
                op3.setText("O");
                break;

            case "D":
                examImg.setImageResource(R.drawable.d);
                op1.setText("H");
                op2.setText("T");
                op3.setText("D");
                break;

            case "E":
                examImg.setImageResource(R.drawable.e);
                op1.setText("W");
                op2.setText("B");
                op3.setText("E");
                break;

            case "F":
                examImg.setImageResource(R.drawable.f);
                op1.setText("V");
                op2.setText("F");
                op3.setText("X");
                break;

            case "G":
                examImg.setImageResource(R.drawable.g);
                op1.setText("G");
                op2.setText("O");
                op3.setText("P");
                break;

            case "H":
                examImg.setImageResource(R.drawable.h);
                op1.setText("A");
                op2.setText("B");
                op3.setText("H");
                break;

            case "I":
                examImg.setImageResource(R.drawable.i);
                op1.setText("I");
                op2.setText("S");
                op3.setText("U");
                break;

            case "J":
                examImg.setImageResource(R.drawable.j);
                op1.setText("Q");
                op2.setText("J");
                op3.setText("N");
                break;

            case "K":
                examImg.setImageResource(R.drawable.k);
                op1.setText("K");
                op2.setText("Z");
                op3.setText("X");
                break;

            case "L":
                examImg.setImageResource(R.drawable.l);
                op1.setText("L");
                op2.setText("B");
                op3.setText("E");
                break;

            case "M":
                examImg.setImageResource(R.drawable.m);
                op1.setText("M");
                op2.setText("W");
                op3.setText("V");
                break;

            case "N":
                examImg.setImageResource(R.drawable.n);
                op1.setText("Q");
                op2.setText("N");
                op3.setText("A");
                break;

            case "O":
                examImg.setImageResource(R.drawable.o);
                op1.setText("D");
                op2.setText("L");
                op3.setText("O");
                break;

            case "P":
                examImg.setImageResource(R.drawable.p);
                op1.setText("I");
                op2.setText("Y");
                op3.setText("P");
                break;

            case "Q":
                examImg.setImageResource(R.drawable.q);
                op1.setText("T");
                op2.setText("Q");
                op3.setText("R");
                break;

            case "R":
                examImg.setImageResource(R.drawable.r);
                op1.setText("R");
                op2.setText("O");
                op3.setText("E");
                break;

            case "S":
                examImg.setImageResource(R.drawable.s);
                op1.setText("S");
                op2.setText("D");
                op3.setText("E");
                break;

            case "T":
                examImg.setImageResource(R.drawable.t);
                op1.setText("W");
                op2.setText("T");
                op3.setText("E");
                break;

            case "U":
                examImg.setImageResource(R.drawable.u);
                op1.setText("U");
                op2.setText("V");
                op3.setText("W");
                break;

            case "V":
                examImg.setImageResource(R.drawable.v);
                op1.setText("V");
                op2.setText("B");
                op3.setText("E");
                break;

            case "W":
                examImg.setImageResource(R.drawable.w);
                op1.setText("W");
                op2.setText("O");
                op3.setText("Q");
                break;

            case "X":
                examImg.setImageResource(R.drawable.x);
                op1.setText("E");
                op2.setText("X");
                op3.setText("Q");
                break;

            case "Y":
                examImg.setImageResource(R.drawable.y);
                op1.setText("P");
                op2.setText("Y");
                op3.setText("R");
                break;

            case "Z":
                examImg.setImageResource(R.drawable.z);
                op1.setText("Z");
                op2.setText("O");
                op3.setText("I");
                break;
        }
    }

    public void examCheck(View view) {
        examButton = (Button) view;
        String name = examButton.getText().toString();

        if(name.equals(option)){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        }
    }
}