package com.example.anushmp.decathlonapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.anushmp.decathlonapp.R;

public class AccountActivity extends AppCompatActivity {
    Button LogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        LogIn=findViewById(R.id.btnLogIn);
        Intent intent=new Intent(this,Login_Activity.class);
    }
}