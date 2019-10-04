package com.example.user.stylemyself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Activity_AddCollection extends AppCompatActivity {


    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__add_collection);

        toolbar=(Toolbar) findViewById(R.id.navigation);
        toolbar.setTitle("Add Collection");
        setSupportActionBar(toolbar); //NO PROBLEM !!!!
    }
}
