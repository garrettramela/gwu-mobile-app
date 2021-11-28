package com.example.gwu_mobile_apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Workout_Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_categories);
        final ImageButton stretchButton = (ImageButton) findViewById(R.id.stretchesAndWarmups);
        final ImageButton strengthButton = (ImageButton) findViewById(R.id.strengthTraining);
        final ImageButton cardioButton = (ImageButton) findViewById(R.id.cardio);
        final ImageButton sportsButton = (ImageButton) findViewById(R.id.sports);
        final ImageButton meditationButton = (ImageButton) findViewById(R.id.mindfulnessAndMeditation);
        final ImageButton nutritionButton = (ImageButton) findViewById(R.id.nutrition);

        /*Why is this in the workout categories class??
        ImageButton next = (ImageButton) findViewById(R.id.wrktStartLogoButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
         */
    }
    public void onImageButtonClick (View view){
        int id = view.getId(); //this is the desired action
        Intent intent = null;
        switch (id) {
            case R.id.stretchesAndWarmups:
                //debug statement
                Toast.makeText(getApplicationContext(), "Clicked Stretching", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Stretching.class); //later will update this to say stretching.class
                startActivity(intent);
                break;
            case R.id.strengthTraining:
                //debug statement
                Toast.makeText(getApplicationContext(), "Clicked Strength Training", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Strength_Training.class);
                startActivity(intent);
                break;
            case R.id.cardio:
                //debug statement
                Toast.makeText(getApplicationContext(), "Clicked Strength Training", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Cardio.class);
                startActivity(intent);
                break;
            case R.id.sports:
                //debug statement
                Toast.makeText(getApplicationContext(), "Clicked Strength Training", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Sports.class);
                startActivity(intent);
                break;
            case R.id.mindfulnessAndMeditation:
                //debug statement
                Toast.makeText(getApplicationContext(), "Clicked Strength Training", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Mindfulness_and_Meditation.class);
                startActivity(intent);
                break;
            case R.id.nutrition:
                //debug statement
                Toast.makeText(getApplicationContext(), "Clicked Strength Training", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Nutrition.class);
                startActivity(intent);
                break;
            }
        }
    }