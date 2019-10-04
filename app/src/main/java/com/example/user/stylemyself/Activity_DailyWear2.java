package com.example.user.stylemyself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Activity_DailyWear2 extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__daily_wear2);
        setTitle("DailyWear");

//        toolbar=(Toolbar) findViewById(R.id.navigation);
//        toolbar.setTitle("Daily Wear");
//        toolbar.setTitleTextColor(android.graphics.Color.WHITE);
//        setSupportActionBar(toolbar); //NO PROBLEM !!!!

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
