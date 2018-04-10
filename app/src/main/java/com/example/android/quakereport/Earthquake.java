package com.example.android.quakereport;

/**
 * Created by Mateusz on 09.04.2018.
 */

public class Earthquake {

    private String myEarthquakePlace;

    private double myEarthquakeMagnitude;

    private long myEarthquakeTime;

    private String myUrl;

    public Earthquake(String earthquakePlace, double earthquakeMagnitude, long earthquakeTime, String url){
        myEarthquakePlace = earthquakePlace;
        myEarthquakeMagnitude = earthquakeMagnitude;
        myEarthquakeTime = earthquakeTime;
        myUrl = url;
    }

    public String getMyEarthquakePlace(){
        return myEarthquakePlace;
    }

    public double getMyEarthquakeMagnitude(){
        return myEarthquakeMagnitude;
    }

    public long getMyEarthquakeTime(){
        return myEarthquakeTime;
    }

    public String getMyUrl(){
        return myUrl;
    }
}
