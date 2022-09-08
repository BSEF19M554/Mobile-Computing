package com.example.a3_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MyChangeText extends AppCompatActivity {

    TextView textToChange;
    Button changeTextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_change_text);

        textToChange = findViewById(R.id.myText);
        changeTextButton = findViewById(R.id.myButton);
        changeTextButton.setOnClickListener(view -> textToChange.setText(R.string.onClickEvent));
    }
}