package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Happy extends AppCompatActivity {
    private Button mbtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);
        mbtn2=findViewById(R.id.btn2next);
        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Happy.this,Happy1.class);
                startActivity(intent);
            }
        });
    }
}