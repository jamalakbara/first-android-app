package com.balagendir.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RegisterTwoActivity extends AppCompatActivity {

    private LinearLayout btn_back;
    private Button btn_continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_two);

        btn_back = findViewById(R.id.btn_back2);
        btn_continue = findViewById(R.id.btn_continue2);

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_to_success = new Intent(RegisterTwoActivity.this, RegisterSuccessActivity.class);
                startActivity(go_to_success);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
