package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;

    private String mLocation;

    private String mDate;

    public Earthquake(String Magnitude, String Location, String Date) {
        mMagnitude = Magnitude;
        mLocation = Location;
        mDate = Date;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }
}
