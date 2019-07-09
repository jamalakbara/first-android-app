package com.balagendir.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TicketSuccessActivity extends AppCompatActivity {

    private Button btn_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_success);

        btn_profile = findViewById(R.id.profile);


        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_to_profile = new Intent(TicketSuccessActivity.this, ProfileActivity.class);
                startActivity(go_to_profile);
            }
        });
    }
}
