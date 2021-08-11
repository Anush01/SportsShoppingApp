package com.example.anushmp.decathlonapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import com.example.anushmp.decathlonapp.CartItem;
import com.example.anushmp.decathlonapp.R;
import com.example.anushmp.decathlonapp.ShoppingDatabase;
import com.example.anushmp.decathlonapp.ui.login.CartAdapter;


import java.util.List;

public class CartActivity extends AppCompatActivity {

    LiveData<List<CartItem>> cartItems;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        TextView empty=findViewById(R.id.tvEmpty);
        TextView checkout = findViewById(R.id.tvCart);

        checkout.setOnClickListener(v -> startActivity(new Intent(CartActivity.this,CheckoutActivity.class)));

        ShoppingDatabase db = ShoppingDatabase.getDatabase(this);

        cartItems = db.cartDao().getCart();
        RecyclerView recyclerView
                = (RecyclerView)findViewById(
                R.id.products);




        cartItems.observe(this, cartItems -> {



            CartAdapter adapter = new CartAdapter(cartItems,getApplicationContext());

            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

            int total =0;
            for(CartItem item:cartItems){
                total= total+ item.getPrice();
            }

            checkout.setText("Total: "+total+" --checkout");

            if(total==0){
                empty.setVisibility(View.VISIBLE);
                recyclerView.setVisibility(View.GONE);
                checkout.setVisibility(View.GONE);
            }else{
                empty.setVisibility(View.GONE);
                recyclerView.setVisibility(View.VISIBLE);
                checkout.setVisibility(View.VISIBLE);
            }
        });
    }
}