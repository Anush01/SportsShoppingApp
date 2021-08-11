package com.example.anushmp.decathlonapp.IntroductionScreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.anushmp.decathlonapp.R;

public class GettingStartedScreen2 extends AppCompatActivity {
     Button mbtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gettingstartedscreen2);
        mbtn2=findViewById(R.id.btn2next);
        mbtn2.setOnClickListener(v -> {
            Intent intent= new Intent(GettingStartedScreen2.this, GettingStartedScreen3.class);
            startActivity(intent);
        });
    }
}