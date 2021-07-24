package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Productpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productpage);

        Intent i = getIntent();
        ShoppingDatabase db = ShoppingDatabase.getDatabase(this);

        int id = i.getIntExtra("id",1);
        String name = i.getStringExtra("name");
        String imageUrl = i.getStringExtra("imageUrl");
        int price = i.getIntExtra("price",0);

        ImageView ivImage = findViewById(R.id.ivImage);
        TextView tvName = findViewById(R.id.tvName);
        TextView tvId = findViewById(R.id.tvId);
        TextView tvPrice = findViewById(R.id.tvPrice);
        Button btnAddToBag = findViewById(R.id.btnAddToBag);

        Picasso.get().load(imageUrl).into(ivImage);
        tvName.setText(name);
        tvPrice.setText("₹ "+price);
        tvId.setText("ID: "+id);

        btnAddToBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CartItem item = new CartItem(id, price, name, imageUrl);
                db.cartDao().insert(item);

                new AlertDialog.Builder(Productpage.this)
                        .setTitle("Product Added!")
                        .setMessage("Product has been added successfully to the Cart. Click on view cart to see the product.")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setNegativeButton("View Cart", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                startActivity(new Intent(Productpage.this,CartActivity.class));
                            }
                        })
                        .show();
            }
        });
    }
}