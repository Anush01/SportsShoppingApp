package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

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


        ShoppingDatabase db = ShoppingDatabase.getDatabase(this);

        productDao = db.productDao();

        productDao.insert(new Product(2, 500, "Puma", "https://firebasestorage.googleapis.com/v0/b/decathlon-69573.appspot.com/o/shoes%2FWhatsApp%20Image%202021-07-23%20at%201.05.36%20PM.jpeg?alt=media&token=7076fa02-40a3-4bc7-b0ea-52e3963a2cb7"));
        productDao.insert(new Product(3, 500, "xyz", "https://firebasestorage.googleapis.com/v0/b/decathlon-69573.appspot.com/o/shoes%2FWhatsApp%20Image%202021-07-23%20at%201.05.37%20PM%20(1).jpeg?alt=media&token=3fd5d8a9-8506-49e6-82d2-c43e23a8fb90"));
        productDao.insert(new Product(4, 400, "Adidas2", "https://firebasestorage.googleapis.com/v0/b/decathlon-69573.appspot.com/o/shoes%2FWhatsApp%20Image%202021-07-23%20at%201.05.37%20PM.jpeg?alt=media&token=1fe77d52-a287-4633-845d-027fb9bd3234"));
        productDao.insert(new Product(5, 100, "Adidas3", "https://firebasestorage.googleapis.com/v0/b/decathlon-69573.appspot.com/o/shoes%2FWhatsApp%20Image%202021-07-23%20at%201.05.38%20PM%20(1).jpeg?alt=media&token=714f06f4-3a02-46a3-96e9-7afb587e2338"));
        productDao.insert(new Product(6, 200, "Adidas4", "https://firebasestorage.googleapis.com/v0/b/decathlon-69573.appspot.com/o/shoes%2FWhatsApp%20Image%202021-07-23%20at%201.05.38%20PM.jpeg?alt=media&token=0522eb6d-28ba-4bbb-b11b-c21c113c7815"));
        productDao.insert(new Product(1, 500, "Adidas", "https://firebasestorage.googleapis.com/v0/b/decathlon-69573.appspot.com/o/shoes%2Fapa1.png?alt=media&token=785f851b-7f36-405b-ab38-fab83f85e33e"));

        products = productDao.getProducts();

        RecyclerView recyclerView
                = (RecyclerView) findViewById(
                R.id.products);


        products.observe(this, new Observer<List<Product>>() {
            @Override
            public void onChanged(List<Product> products) {
                ProductAdapter adapter = new ProductAdapter(products,getApplicationContext());
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
            }
        });


    }
}