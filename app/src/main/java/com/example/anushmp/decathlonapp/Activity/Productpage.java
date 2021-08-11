package com.example.anushmp.decathlonapp.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.anushmp.decathlonapp.CartItem;
import com.example.anushmp.decathlonapp.R;
import com.example.anushmp.decathlonapp.ShoppingDatabase;
import com.squareup.picasso.Picasso;

public class Productpage extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productpage);

        Intent i = getIntent();
        ShoppingDatabase db = ShoppingDatabase.getDatabase(this);

        int id = i.getIntExtra("id", 1);
        String name = i.getStringExtra("name");
        String imageUrl = i.getStringExtra("imageUrl");
        int price = i.getIntExtra("price", 0);

        ImageView ivImage = findViewById(R.id.ivImage);
        TextView tvName = findViewById(R.id.tvName);
        TextView tvId = findViewById(R.id.tvId);
        TextView tvPrice = findViewById(R.id.tvPrice);
        Button btnAddToBag = findViewById(R.id.btnAddToBag);

        Picasso.get().load(imageUrl).into(ivImage);
        tvName.setText(name);
        tvPrice.setText("₹ " + price);
        tvId.setText("ID: " + id);

        btnAddToBag.setOnClickListener(v -> {
            CartItem item = new CartItem(id, price, name, imageUrl);
            db.cartDao().insert(item);

            new AlertDialog.Builder(Productpage.this)
                    .setTitle("Product Added!")
                    .setMessage("Product has been added successfully to the Cart. Click on view cart to see the product.")
                    .setPositiveButton("OK", (dialog, which) -> {

                    })
                    .setNegativeButton("View Cart", (dialog, which) -> startActivity(new Intent(Productpage.this, CartActivity.class)))
                    .show();
        });
    }
}