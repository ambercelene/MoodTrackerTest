package com.example.moodtrackertest;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;

public class Record extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinner;
    private static final String[] paths = {"Default","Anger", "Happy", "Sad"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        spinner = (Spinner)findViewById(R.id.mood_selection);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                Record.this,
                android.R.layout.simple_spinner_item,
                paths
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // TODO: Refactor list selection action using factory and command pattern
        switch (position) {
            case 0:
                // Add Default mood command
                break;
            case 1:
                // Add Anger mood command
                break;
            case 2:
                // Add Sad mood command
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void onClickTrackMood(View view) {
        setContentView(R.layout.activity_record);
    }
}
