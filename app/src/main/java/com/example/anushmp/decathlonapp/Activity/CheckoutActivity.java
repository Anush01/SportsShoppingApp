package com.example.anushmp.decathlonapp.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.anushmp.decathlonapp.R;
import com.example.anushmp.decathlonapp.ShoppingDatabase;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        Button checkout = findViewById(R.id.btnCheckout);

        checkout.setOnClickListener(v -> new AlertDialog.Builder(CheckoutActivity.this)
                .setTitle("Checkout confirmation")
                .setMessage("Please confirm the payment.")
                .setPositiveButton("Done", (dialog, which) -> {
                    Intent intent = new Intent(CheckoutActivity.this,MainActivity2.class);
                    startActivity(intent);
                    ShoppingDatabase db = ShoppingDatabase.getDatabase(getApplicationContext());
                    db.cartDao().deleteAll();
                    finish();
                })
                .setNegativeButton("Failed", (dialog, which) -> {


                })
                .show());
    }
}