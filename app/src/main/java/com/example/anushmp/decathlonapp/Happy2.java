package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Happy2 extends AppCompatActivity {
    private Button mbtn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy2);
        mbtn7=findViewById(R.id.mbtn5);
        mbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Happy2.this,Happy3.class);
                startActivity(intent);
            }
        });

    }
}