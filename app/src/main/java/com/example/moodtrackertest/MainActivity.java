package com.example.moodtrackertest;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, IntroActivity.class);
               startActivity(intent);
    }

    public void record(View view){
        Intent recordIntent = new Intent(this, Record.class);

// Start the new activity.
        startActivity(recordIntent);
    }

    public void data(View view){
        Intent dataIntent = new Intent(this, Data.class);

// Start the new activity.
        startActivity(dataIntent);
    }

}
