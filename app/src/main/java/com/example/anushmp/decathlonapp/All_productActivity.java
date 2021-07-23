package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class All_productActivity extends AppCompatActivity {

    ImageView pwmens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_product);

        pwmens = findViewById(R.id.pwmens);


        pwmens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(All_productActivity.this,productViewActivity.class);
                startActivity(i);

            }
        });


    }
}