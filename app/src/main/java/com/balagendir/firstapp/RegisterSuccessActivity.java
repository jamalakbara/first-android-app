package com.balagendir.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterSuccessActivity extends AppCompatActivity {

    private Button btn_explore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_success);

        btn_explore = findViewById(R.id.btn_explore);

        btn_explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_to_home = new Intent(RegisterSuccessActivity.this, HomeActivity.class);
                startActivity(go_to_home);
            }
        });

    }
}
