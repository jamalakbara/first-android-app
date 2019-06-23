package com.balagendir.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GetStartedActivity extends AppCompatActivity {

    private Button btn_sign_in, btn_new_acc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        btn_sign_in = findViewById(R.id.btn_sign_in);
        btn_new_acc = findViewById(R.id.btn_new_acc);

        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_to_sign_in = new Intent(GetStartedActivity.this, SignInActivity.class);
                startActivity(go_to_sign_in);
            }
        });

        btn_new_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_to_regis1 = new Intent(GetStartedActivity.this, RegisterOneActivity.class);
                startActivity(go_to_regis1);
            }
        });

    }
}
