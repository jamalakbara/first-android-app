package com.balagendir.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView applogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        applogo = findViewById(R.id.applogo);

//        HANDLING EVENT
        Handler handler = new Handler();
//        MELAKUKAN EVENT SETELAH 2000ms/2s
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
//                MENUJU APP LAIN
                Intent next_page = new Intent(MainActivity.this, GetStartedActivity.class);
                startActivity(next_page);
                finish();
            }
        }, 2000);

    }
}
