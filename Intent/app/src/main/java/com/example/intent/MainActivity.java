package com.example.intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button callButton;
    Button locButton;
    Button emailButton;
    Button repoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callButton = findViewById(R.id.button1);
        locButton = findViewById(R.id.button2);
        emailButton = findViewById(R.id.button3);
        repoButton = findViewById(R.id.button4);

        callButton.setOnClickListener(view -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:+923454321243"));
            startActivity(callIntent);
        });

        locButton.setOnClickListener(view -> {
            Intent locIntent = new Intent(Intent.ACTION_VIEW);
            locIntent.setData(Uri.parse("geo:31.47,74.26"));
            if (locIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(locIntent);
            }
        });

        emailButton.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); // only email apps should handle this
            intent.putExtra(Intent.EXTRA_EMAIL, "589amf@gmail.com");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Sent from android app");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        });

        repoButton.setOnClickListener(view -> {
            Uri webpage = Uri.parse("https://www.youtube.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        });
    }
}