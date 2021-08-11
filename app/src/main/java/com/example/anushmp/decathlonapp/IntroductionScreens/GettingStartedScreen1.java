package com.example.anushmp.decathlonapp.IntroductionScreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.anushmp.decathlonapp.R;

public class GettingStartedScreen1 extends AppCompatActivity {
       Button mbtnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gettingstartedscreen1);
        mbtnext=findViewById(R.id.btnnext);
        mbtnext.setOnClickListener(v -> {
            Intent intent= new Intent(GettingStartedScreen1.this, GettingStartedScreen2.class);
            startActivity(intent);
        });
    }
}