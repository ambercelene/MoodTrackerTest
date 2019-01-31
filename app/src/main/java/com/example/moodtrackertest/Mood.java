package com.example.moodtrackertest;

import java.util.ArrayList;

public abstract class Mood {

    private String name;
    private String definition;

    private int intensity; // how strongly you are feeling it
    private int duration; // length in mood

    private ArrayList<Mood> correlations; // from correlated two-factor model

    // mood modifiers:  MoodModifier <- Feeling, Emotion
    // private ArrayList<Feeling> feelings
    // private ArrayList<Emotion> emotions

    public Mood(String moodName) {
        name = moodName;

        //TODO: load correlations for this mood from database
        correlations = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
