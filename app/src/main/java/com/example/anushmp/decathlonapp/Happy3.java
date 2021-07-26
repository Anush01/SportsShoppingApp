package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Happy3 extends AppCompatActivity {
    private Button mbtn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy3);
        mbtn9=findViewById(R.id.mbtn0);
        mbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Happy3.this,MainActivity2.class);
                startActivity(intent);
            }
        });

    }
}