package com.example.android.quakereport;

import android.app.Activity;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.DecimalFormat;
import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Mateusz on 09.04.2018.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOCATION_SEPARATOR = " of ";

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes){
        super(context,0,earthquakes);
    }

    private String formatDate(Date dateObject){
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject){
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    private String formatMagnitude(double mag){
        DecimalFormat formatter = new DecimalFormat("0.0");
        return formatter.format(mag);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item,parent,false);

            Earthquake currentEarthquake = getItem(position);

            String location = currentEarthquake.getMyEarthquakePlace();
            String locationPartOne;
            String locationPartTwo;

            if (location.contains(LOCATION_SEPARATOR)){
                String[] parts = location.split(LOCATION_SEPARATOR);
                locationPartOne = parts[0] + LOCATION_SEPARATOR;
                locationPartTwo = parts[1];
            } else {
                locationPartOne = "Near of";
                locationPartTwo = location;
            }

            double mag = currentEarthquake.getMyEarthquakeMagnitude();

            TextView magnitude = (TextView) listItemView.findViewById(R.id.magnitude);
            magnitude.setText(formatMagnitude(mag));

            TextView placePartOne = (TextView) listItemView.findViewById(R.id.location_offset);
            placePartOne.setText(locationPartOne);

            TextView placePartTwo = (TextView) listItemView.findViewById(R.id.primary_location);
            placePartTwo.setText(locationPartTwo);

            Date dateObject = new Date(currentEarthquake.getMyEarthquakeTime());

            TextView time = (TextView) listItemView.findViewById(R.id.time);
            time.setText(formatTime(dateObject));

            TextView date = (TextView) listItemView.findViewById(R.id.date);
            date.setText(formatDate(dateObject));

        }
        return listItemView;
    }
}
