package com.example.user.stylemyself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Events extends AppCompatActivity {
    Toolbar toolbar;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        setTitle("By Events");
//        toolbar=(Toolbar) findViewById(R.id.navigation);
//        toolbar.setTitle("By Events");
//        toolbar.setTitleTextColor(android.graphics.Color.WHITE);
//        setSupportActionBar(toolbar); //NO PROBLEM !!!!


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        button =(Button)findViewById(R.id.buttonDinner);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dinner();
            }
        });


        button =(Button)findViewById(R.id.buttonDateCasual);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DateCasual();
            }
        });


        button =(Button)findViewById(R.id.buttonDateFancy);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DateFancy();
            }
        });
    }



    public void Dinner(){
        Intent mainpage= new Intent(getApplicationContext(), EventsDinner.class);
        startActivity(mainpage);
    }


    public void DateCasual(){
        Intent mainpage= new Intent(getApplicationContext(), EventsDateCasual.class);
        startActivity(mainpage);
    }


    public void DateFancy(){
        Intent mainpage= new Intent(getApplicationContext(), EventsDateFancy.class);
        startActivity(mainpage);
    }
}
