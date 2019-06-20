package com.balagendir.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class GetStartedActivity extends AppCompatActivity {

    EditText input_email;
    String email_address = "akunpalsu29@gmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        input_email = findViewById(R.id.email_address);
        if (email_address == "akunpalsu29@gmail.com"){
            input_email.setText(email_address);
//            ALERT
            Toast.makeText(getApplicationContext(), "Your Email Address Is Valid", Toast.LENGTH_SHORT).show();
        }
        else {
//            ALERT
            Toast.makeText(getApplicationContext(), "Your Email Address Is Invalid or Not Registered", Toast.LENGTH_SHORT).show();
        }
    }
}
