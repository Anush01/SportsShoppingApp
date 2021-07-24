package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.anushmp.decathlonapp.data.model.Product;
import com.example.anushmp.decathlonapp.ui.login.CartDao;
import com.example.anushmp.decathlonapp.ui.login.ProductDao;

import java.util.List;

public class ProductActivity extends AppCompatActivity {
    CartDao cartDao;
    ProductDao productDao;
    List<CartItem> cartItems;
    LiveData<List<Product>> products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
    }
    @Override
    protected void onStart() {
        super.onStart();


        TextView tvCart = findViewById(R.id.tvCart);

        tvCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductActivity.this,CartActivity.class));
            }
        });


        ShoppingDatabase db = ShoppingDatabase.getDatabase(this);
//        cartDao = db.cartDao();
//
//        cartDao.insert(new CartItem(1,200,"cart"));
//        cartItems = cartDao.getCart();
//
//        for (CartItem item:cartItems){
//            Log.d("productname1",item.getProductName());
//        }

        productDao = db.productDao();

        for (int i=1;i<=10;i++)
            productDao.insert(new Product(i,i*2+122,"product"+i));

        products = productDao.getProducts();

//        for (Product item:products){
//            Log.d("productname2",item.getProductName());
//        }

        RecyclerView recyclerView
                = (RecyclerView)findViewById(
                R.id.products);


        products.observe(this, new Observer<List<Product>>() {
            @Override
            public void onChanged(List<Product> products) {
                ProductAdapter adapter = new ProductAdapter(products,getApplicationContext());
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            }
        });


    }
}