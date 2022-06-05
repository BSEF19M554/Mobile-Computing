package com.example.kidsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button lessons, customLessons, exams, repoLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lessons = findViewById(R.id.LessonButton);
        customLessons = findViewById(R.id.CustomLessonButton);
        exams =  findViewById(R.id.ExamButton);
        repoLink = findViewById(R.id.RepoButton);

        repoLink.setOnClickListener(view -> {
            Uri webpage = Uri.parse("https://github.com/BSEF19M554/Mobile-Computing");
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        });

        lessons.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LessonShow.class);
            startActivity(intent);
        });

        customLessons.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CustomLessonShow.class);
            startActivity(intent);
        });

        exams.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ExamShow.class);
            startActivity(intent);
        });
    }
}