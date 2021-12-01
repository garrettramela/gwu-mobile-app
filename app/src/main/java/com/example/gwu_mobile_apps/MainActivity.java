package com.example.gwu_mobile_apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void welcomeScreenClick(View view) {
        System.out.println("clicked welcome screen image button");
        // final ImageButton welcomeButton = (ImageButton)findViewById(R.id.wrktStartLogoButton);

        Intent intent = new Intent(this, Workout_Categories.class);
        startActivity(intent);
    }
}

