package com.balagendir.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
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

        applogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                menuju page lain
                Intent next_page = new Intent(MainActivity.this, GetStartedActivity.class);
                startActivity(next_page);
                finish();
            }
        });

    }
}
