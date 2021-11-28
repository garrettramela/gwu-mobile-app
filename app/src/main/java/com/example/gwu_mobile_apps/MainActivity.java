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

        /*
        ImageButton next = (ImageButton) findViewById(R.id.wrktStartLogoButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Workout_Categories.class);
                startActivityForResult(myIntent, 0);
            }

        });
         */
    }
    public void welcomeScreenClick(View view) {
        System.out.println("clicked welcome screen image button");
        //final ImageButton welcomeButton = (ImageButton)findViewById(R.id.wrktStartLogoButton);

        Intent intent = new Intent(this, Workout_Categories.class);
        startActivity(intent);

    }
}

