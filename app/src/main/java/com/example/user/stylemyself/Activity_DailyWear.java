package com.example.user.stylemyself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Activity_DailyWear extends AppCompatActivity {
//    Toolbar toolbar;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__daily_wear);

        setTitle("Menu");
//        toolbar=(Toolbar) findViewById(R.id.navigation);
//        toolbar.setTitle("Menu");
//        toolbar.setTitleTextColor(android.graphics.Color.WHITE);
//        setSupportActionBar(toolbar); //NO PROBLEM !!!!

        button =(Button)findViewById(R.id.buttonDailyWear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DailyWear();
            }
        });


        button =(Button)findViewById(R.id.buttonByevent);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Events();
            }
        });


        button =(Button)findViewById(R.id.buttonMatchandPair);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MatchandPair();
            }
        });

    }


    public void DailyWear(){
        Intent mainpage= new Intent(getApplicationContext(), Activity_DailyWear2.class);
        startActivity(mainpage);
    }


    public void Events(){
        Intent mainpage= new Intent(getApplicationContext(), Events.class);
        startActivity(mainpage);
    }


    public void MatchandPair(){
        Intent mainpage= new Intent(getApplicationContext(), Activity_MatchandPair.class);
        startActivity(mainpage);
    }
}
