package com.example.user.stylemyself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Activity_MatchandPair extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__matchand_pair);
        setTitle("MatchandPair");
//        toolbar=(Toolbar) findViewById(R.id.navigation);
//        toolbar.setTitle("Match and Pair");
//        toolbar.setTitleTextColor(android.graphics.Color.WHITE);
//        setSupportActionBar(toolbar); //NO PROBLEM !!!!

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
