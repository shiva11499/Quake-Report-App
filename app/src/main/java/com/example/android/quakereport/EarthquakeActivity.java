package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("8.5","San Francisco", "March"));
        earthquakes.add(new Earthquake("7.5","San Francisco", "April"));
        earthquakes.add(new Earthquake("6.5","San Francisco", "June"));
        earthquakes.add(new Earthquake("9.5","San Francisco", "July"));
        earthquakes.add(new Earthquake("10.5","San Francisco", "August"));
        earthquakes.add(new Earthquake("5.5","San Francisco", "Sep"));
        earthquakes.add(new Earthquake("2.5","San Francisco", "Oct"));

        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
