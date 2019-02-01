package com.mood.tracker;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Feeling implements Affect {

    private String feelingName;

    //
    public Feeling(String typeName) {
        feelingName = typeName;
    }

    @Override
    public String toString() {
        return feelingName;
    }

    @Override
    public void setDate() {
        Calendar rightNow = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("yyyy / MM / dd ");
        String strDate = mdformat.format(rightNow.getTime());
        // TODO: store date
    }

    @Override
    public void setDuration() {
        //
    }

    @Override
    public int getDuration() {
        return 0;
    }
}
