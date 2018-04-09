package com.example.android.quakereport;

/**
 * Created by Mateusz on 09.04.2018.
 */

public class Earthquake {

    private String myEarthquakePlace;

    private String myEarthquakeMagnitude;

    private String myEarthquakeTime;

    public Earthquake(String earthquakePlace, String earthquakeMagnitude, String earthquakeTime){
        myEarthquakePlace = earthquakePlace;
        myEarthquakeMagnitude = earthquakeMagnitude;
        myEarthquakeTime = earthquakeTime;
    }

    public String getMyEarthquakePlace(){
        return myEarthquakePlace;
    }

    public String getMyEarthquakeMagnitude(){
        return myEarthquakeMagnitude;
    }

    public String getMyEarthquakeTime(){
        return myEarthquakeTime;
    }
}
