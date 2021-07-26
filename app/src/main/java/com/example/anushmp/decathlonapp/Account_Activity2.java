package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Account_Activity2 extends AppCompatActivity {
    private Button log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account2);
        log=findViewById(R.id.logout);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Account_Activity2.this,AccountActivity.class);
                startActivity(intent);
            }
        });
    }
}