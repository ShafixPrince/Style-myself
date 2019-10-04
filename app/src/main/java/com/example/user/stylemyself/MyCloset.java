package com.example.user.stylemyself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MyCloset extends AppCompatActivity {

  private Button button;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_closet);

//        toolbar=(Toolbar) findViewById(R.id.navigation);
        setTitle("My Closet");
//        setSupportActionBar(toolbar); //NO PROBLEM !!!!


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button =(Button)findViewById(R.id.buttonHeadwear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HeadWearCloset();
            }
        });


        button =(Button)findViewById(R.id.buttonTops);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TopsCloset();
            }
        });


        button =(Button)findViewById(R.id.buttonBottoms);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomsCloset();
            }
        });


        button =(Button)findViewById(R.id.buttonAccessories);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AccessoriesCloset();
            }
        });

        button =(Button)findViewById(R.id.buttonShoes);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ShoesCloset();
            }
        });


    }


    public void HeadWearCloset(){
        Intent mainpage= new Intent(getApplicationContext(), MyCloset_Headwear.class);
        startActivity(mainpage);
    }


    public void TopsCloset(){
        Intent mainpage= new Intent(getApplicationContext(), MyCloset_Tops.class);
        startActivity(mainpage);
    }


    public void BottomsCloset(){
        Intent mainpage= new Intent(getApplicationContext(), MyCloset_Bottoms.class);
        startActivity(mainpage);
    }

    public void AccessoriesCloset(){
        Intent mainpage= new Intent(getApplicationContext(), MyCloset_Accesories.class);
        startActivity(mainpage);
    }

    public void ShoesCloset(){
        Intent mainpage= new Intent(getApplicationContext(), MyCloset_Shoes.class);
        startActivity(mainpage);
    }
}
