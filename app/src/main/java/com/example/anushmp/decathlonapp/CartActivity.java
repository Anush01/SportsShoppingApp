package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.anushmp.decathlonapp.ui.login.CartAdapter;
import com.example.anushmp.decathlonapp.ui.login.CartDao;

import java.util.List;

public class CartActivity extends AppCompatActivity {

    LiveData<List<CartItem>> cartItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        TextView empty=findViewById(R.id.tvEmpty);
        TextView checkout = findViewById(R.id.tvCart);

        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartActivity.this,CheckoutActivity.class));
            }
        });

        ShoppingDatabase db = ShoppingDatabase.getDatabase(this);

        cartItems = db.cartDao().getCart();
        RecyclerView recyclerView
                = (RecyclerView)findViewById(
                R.id.products);




        cartItems.observe(this, new Observer<List<CartItem>>() {
            @Override
            public void onChanged(List<CartItem> cartItems) {

//                Log.d("cartdebug",cartItems.get(0).getProductName());
//
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
            }

        });
    }
}