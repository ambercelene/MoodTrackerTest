package com.example.moodtrackertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
