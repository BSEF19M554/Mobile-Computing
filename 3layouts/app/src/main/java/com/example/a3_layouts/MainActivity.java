package com.example.a3_layouts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);

        b1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyChangeText.class);
            startActivity(intent);
        });

        b2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyCalculator.class);
            startActivity(intent);
        });

        b3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MyLogin.class);
            startActivity(intent);
        });
    }
}