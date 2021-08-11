package com.example.anushmp.decathlonapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.anushmp.decathlonapp.R;

public class Account_Activity2 extends AppCompatActivity {
    Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account2);
        log = findViewById(R.id.logout);
        log.setOnClickListener(v -> {
            Intent intent = new Intent(Account_Activity2.this, AccountActivity.class);
            startActivity(intent);
        });
    }
}