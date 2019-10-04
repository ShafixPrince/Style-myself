package com.example.user.stylemyself;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertHeadWear extends AppCompatActivity implements View.OnClickListener{

    // Import our class just now
    DatabaseMangerHeadwear mDatabase;

    // Define on global so we can use across methods
    EditText profile_name, profile_color, profile_type;

    Boolean activity_update = false;

    int user_id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_head_wear);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        // Initialize our class :D
        mDatabase = new DatabaseMangerHeadwear(this);
        // Now we can use the functions inside the class (add/write/update/delete)

        profile_name = findViewById(R.id.profile_name);
        profile_color = findViewById(R.id.profile_address);
        profile_type = findViewById(R.id.profile_password);

        Button button_insert = findViewById(R.id.button_insert);

        String user_name, user_color, user_type;

        int user_profile_id = 0;

        if (getIntent().hasExtra("profile_id")) {
            activity_update = true;
            user_profile_id = getIntent().getIntExtra("profile_id",0);
            user_name = getIntent().getStringExtra("profile_name");
            user_color = getIntent().getStringExtra("profile_color");
            user_type= getIntent().getStringExtra("profile_type");

            user_id = user_profile_id;
            if(user_profile_id == 0){
                returnMainActivity();
            }
            // settext for edittext here
            profile_name.setText(user_name);
            profile_color.setText(user_color);
            profile_type.setText(user_type);
            button_insert.setText("Update !");
        }

        button_insert.setOnClickListener(this);
    }


    // Kalau ada banyak lagi button boleh set dalam method bawah ni (onClick)
    // Takde la serabut coding kita nanti :D
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_insert:

                if(activity_update){
                    updateProfile();
                }else{
                    // Run method insert profile
                    insertProfile();
                }

                break;
        }
    }

    private void insertProfile(){
        // To retrieve the string and remove space (caused by spacebar) behind
        String name = profile_name.getText().toString().trim();
        String color= profile_color.getText().toString().trim();
        String type = profile_type.getText().toString().trim();

        if( name.isEmpty() || color.isEmpty() || type.isEmpty() ){
            // Any of the field is empty
            Toast.makeText(this, "Please fill all field !", Toast.LENGTH_SHORT).show();
        }else{
            // All field not empty
            if (mDatabase.insertProfileData(name, color, type)){
                // Successful
                Toast.makeText(this, "Profile data inserted !", Toast.LENGTH_SHORT).show();
                returnMainActivity();
            }else{
                Toast.makeText(this, "Insert query failed :(", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void updateProfile(){
        // To retrieve the string and remove space (caused by spacebar) behind
        String name = profile_name.getText().toString().trim();
        String address = profile_color.getText().toString().trim();
        String password = profile_type.getText().toString().trim();

        if( name.isEmpty() || address.isEmpty() || password.isEmpty() ){
            // Any of the field is empty
            Toast.makeText(this, "Please fill all field !", Toast.LENGTH_SHORT).show();
        }else{
            // All field not empty
            if (mDatabase.updateProfile(user_id, name, address, password)){
                // Successful
                Toast.makeText(this, "Profile data updated !", Toast.LENGTH_SHORT).show();
                returnMainActivity();
            }else{
                Toast.makeText(this, "Insert query failed :(", Toast.LENGTH_SHORT).show();
            }
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

    private void returnMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
