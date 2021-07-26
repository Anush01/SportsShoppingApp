package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class GettingStarted extends AppCompatActivity {
        private Button mbtnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_started);
        mbtnext=findViewById(R.id.btnnext);
        mbtnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(GettingStarted.this,Happy.class);
                startActivity(intent);
            }
        });
    }
}