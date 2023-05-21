package com.bob.chronometersecapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // on below line we are creating variables.
    private Chronometer chronometer;
    private Button chronometerBtn;
    boolean isRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // on below line we are initializing our variables.
        chronometer = findViewById(R.id.idCMmeter);
        chronometerBtn = findViewById(R.id.idBtnChronometer);

        // on below line we are adding click listener for our button
        chronometerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on below line we are checking if
                // chronometer is running or not.
                if (isRunning) {

                    // in this condition chronometer is running
                    // on below line we are updating text for button
                    chronometerBtn.setText("Start Chronometer");

                    // on below line we are updating boolean variable
                    isRunning = false;

                    // on below line we are stopping chronometer
                    chronometer.stop();
                } else {

                    // in this condition chronometer is running
                    // on below line we are updating text for button
                    chronometerBtn.setText("Stop Chronometer");

                    // on below line we are updating boolean variable
                    isRunning = true;

                    // on below line we are starting chronometer
                    chronometer.start();
                }
            }
        });
    }
}
