package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Happy1 extends AppCompatActivity {
private Button happy1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy1);
        happy1=findViewById(R.id.mbtn3);
        happy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Happy1.this,Happy2.class);
                startActivity(intent);
            }
        });
    }
}