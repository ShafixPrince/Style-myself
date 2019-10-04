package com.example.user.stylemyself;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import android.view.MenuItem;

import java.util.ArrayList;

public class MyCloset_Headwear extends AppCompatActivity {
    Toolbar toolbar;

    // Arraylist will store each row of data from DB as Object
    // We'll create an Object (Profile.java) so they would refer each other. Tak reti explain sorry.
    // Nanti dalam adapter kena pass object gak
    // Adapter akan handle. Takyah risau kalau tak faham.

    ArrayList<Headwear> profiles;
    DatabaseMangerHeadwear mDatabase;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_closet__headwear);

        setTitle("Headwear");


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Initialize myRecyclerView

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        loadProfileDataFromDatabase();
    }

    private void loadProfileDataFromDatabase(){
        Cursor cursor = mDatabase.getAllProfiles();

        if (cursor.moveToFirst()) {
            do {
                profiles.add(new Headwear(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3)
                ));
            } while (cursor.moveToNext());

            ProfileAdapter adapter = new ProfileAdapter(profiles);
            // Attach the adapter to the recyclerview to populate items
            mRecyclerView.setAdapter(adapter);
            // Set layout manager to position the items
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}