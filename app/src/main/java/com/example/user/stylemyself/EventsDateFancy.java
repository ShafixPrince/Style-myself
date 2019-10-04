package com.example.user.stylemyself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class EventsDateFancy extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_date_fancy);

        toolbar=(Toolbar) findViewById(R.id.navigation);
        toolbar.setTitle("By Events");
        setSupportActionBar(toolbar); //NO PROBLEM !!!!

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
