package com.mood.tracker;

import java.util.ArrayList;

public class Mood {

    private Feeling overallMood;
    private String definition;

    private int intensity; // how strongly you are feeling it
    private int duration; // length in mood

    private ArrayList<Mood> correlations; // from correlated two-factor model

    // mood modifiers:  MoodModifier <- Feeling, Emotion
    // private ArrayList<Feeling> feelings
    // private ArrayList<Emotion> emotions

    public Mood(String moodName) {
        overallMood = new Feeling(moodName);

        //TODO: load correlations for this mood from database
        correlations = new ArrayList<>();
    }

    @Override
    public String toString() {
        return overallMood.toString();
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
