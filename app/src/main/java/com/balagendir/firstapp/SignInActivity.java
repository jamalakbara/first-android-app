package com.balagendir.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    private TextView btn_new_acc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btn_new_acc = findViewById(R.id.new_acc);

        btn_new_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_to_regis1 = new Intent(SignInActivity.this, RegisterOneActivity.class);
                startActivity(go_to_regis1);
            }
        });

    }
}
