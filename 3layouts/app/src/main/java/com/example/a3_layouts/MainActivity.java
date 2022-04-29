package com.example.a3_layouts;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button changeTextButton;
    TextView textToChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        textToChange = findViewById(R.id.textView6);
        changeTextButton = findViewById(R.id.button14);
        changeTextButton.setOnClickListener(view -> textToChange.setText(R.string.onClickEvent));
    }
}