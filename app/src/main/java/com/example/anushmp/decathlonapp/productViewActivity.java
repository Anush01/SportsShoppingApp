package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class productViewActivity extends AppCompatActivity {

    int price = 599;
    String info = "PW MENS SHOES GREY";

    HashMap<String, Integer> prods = new HashMap<>();
    TextView addtocart;
    TextView main;
    TextView taketocart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_view_full);

        addtocart = findViewById(R.id.addtocart);
        main = findViewById(R.id.shoeinfo);
        taketocart = findViewById(R.id.taketocart);



        addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(prods.containsKey(info)){

                    prods.put(info,prods.get(info) + price);

                }else{

                    prods.put(info,price);
                }

                Toast.makeText(productViewActivity.this, "Added to cart! ", Toast.LENGTH_SHORT).show();


            }
        });


        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(productViewActivity.this,MainActivity2.class);
                startActivity(i1);

            }
        });


        taketocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(productViewActivity.this, cartActivity.class);

                int prices = prods.get(info);

                i3.putExtra("price", prices);


                startActivity(i3);

            }
        });

    }
}