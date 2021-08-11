package com.example.anushmp.decathlonapp.IntroductionScreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.anushmp.decathlonapp.R;

public class GettingStartedScreen3 extends AppCompatActivity {
 Button happy1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gettingstartedscreen3);
        happy1=findViewById(R.id.mbtn3);
        happy1.setOnClickListener(v -> {
            Intent intent= new Intent(GettingStartedScreen3.this, GettingStartedScreen4.class);
            startActivity(intent);
        });
    }
}