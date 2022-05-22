package com.example.kidsapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LessonShow extends AppCompatActivity {

    Button btnPressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_show);
    }

    public void openImage(View view) {
        btnPressed = (Button) view;
        String val = btnPressed.getText().toString();

        Intent intent = new Intent(LessonShow.this, ImageShow.class);
        intent.putExtra("alphabet", val);
        startActivity(intent);
    }
}