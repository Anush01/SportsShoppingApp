package com.example.anushmp.decathlonapp.IntroductionScreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.anushmp.decathlonapp.Activity.MainActivity2;
import com.example.anushmp.decathlonapp.R;

public class GettingStartedScreen5 extends AppCompatActivity {
     Button mbtn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gettingstartedscreen5);
        mbtn9=findViewById(R.id.mbtn0);
        mbtn9.setOnClickListener(v -> {
            Intent intent= new Intent(GettingStartedScreen5.this, MainActivity2.class);
            startActivity(intent);
        });

    }
}