package com.example.anushmp.decathlonapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.CartItem;
import com.example.anushmp.decathlonapp.Activity.Productpage;
import com.example.anushmp.decathlonapp.R;
import com.example.anushmp.decathlonapp.ShoppingDatabase;
import com.example.anushmp.decathlonapp.ViewHolder.ProductViewHolder;
import com.example.anushmp.decathlonapp.data.model.Product;

import org.jetbrains.annotations.NotNull;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    List<Product> list;


    Context context;
    public ProductAdapter(List<Product> list, Context context) {
        this.list = list;
        this.context = context;

    }

    @NonNull
    @NotNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater
                = LayoutInflater.from(parent.getContext());

        // Inflate the layout

        View productView
                = inflater
                .inflate(R.layout.product_item,
                        parent, false);

        return new ProductViewHolder(productView);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ProductViewHolder holder, int position) {
        boolean isAdded = false;

        ShoppingDatabase db = ShoppingDatabase.getDatabase(context);
        Product currentProduct = list.get(position);

        List<CartItem> i = db.cartDao().searchItemInCart(currentProduct.getProductId());
        if (i.size() != 0)
            isAdded = true;

        holder.setData(currentProduct.getProductName(), currentProduct.getPrice(),isAdded, currentProduct.getImageUrl());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, Productpage.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("id",currentProduct.getProductId());
            intent.putExtra("name",currentProduct.getProductName());
            intent.putExtra("imageUrl",currentProduct.getImageUrl());
            intent.putExtra("price",currentProduct.getPrice());
            context.startActivity(intent);
        });

        holder.add.setOnClickListener(v -> {

            holder.add.setVisibility(View.INVISIBLE);
            holder.remove.setVisibility(View.VISIBLE);

            CartItem item = new CartItem(currentProduct.getProductId(), currentProduct.getPrice(), currentProduct.getProductName(), currentProduct.getImageUrl());
            db.cartDao().insert(item);
        });

        holder.remove.setOnClickListener(v -> {

            holder.add.setVisibility(View.VISIBLE);
            holder.remove.setVisibility(View.INVISIBLE);

            List<CartItem> item = db.cartDao().searchItemInCart(currentProduct.getProductId());

            if (item.size() != 0)
                db.cartDao().delete(item.get(0));
        });
    }

    @Override
    public int getItemCount() {
        if (list!=null)
            return list.size();
        return 0;
    }
    @Override
    public void onAttachedToRecyclerView(
            @NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
