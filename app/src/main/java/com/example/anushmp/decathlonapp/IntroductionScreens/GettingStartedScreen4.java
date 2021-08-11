package com.example.anushmp.decathlonapp.IntroductionScreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.anushmp.decathlonapp.R;

public class GettingStartedScreen4 extends AppCompatActivity {
     Button mbtn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gettingstartedscreen4);
        mbtn7=findViewById(R.id.mbtn5);
        mbtn7.setOnClickListener(v -> {
            Intent intent= new Intent(GettingStartedScreen4.this, GettingStartedScreen5.class);
            startActivity(intent);
        });

    }
}