package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class oldcartActivity extends AppCompatActivity {

    TextView total;
    TextView orderview;
    String info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartview);

        total = findViewById(R.id.total);
        orderview = findViewById(R.id.orderview);

        info = "PW MENS RUNNING SHOES 1 PC";

        if(getIntent() !=null){

            int price = getIntent().getIntExtra("price", 0000);

            if(price == 0000){info = "";}

            total.setText(price + "");
            orderview.append("\n" + info);

        }

    }
}