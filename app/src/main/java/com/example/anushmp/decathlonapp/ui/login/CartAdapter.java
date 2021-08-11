package com.example.anushmp.decathlonapp.ui.login;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.CartItem;
import com.example.anushmp.decathlonapp.ViewHolder.ProductViewHolder;
import com.example.anushmp.decathlonapp.R;
import com.example.anushmp.decathlonapp.ShoppingDatabase;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    List<CartItem> list;

    Context context;
    //ClickListiner listiner;

    public CartAdapter(List<CartItem> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NotNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater
                = LayoutInflater.from(parent.getContext());

        // Inflate the layout

        View productView = inflater.inflate(R.layout.product_item, parent, false);

        return new ProductViewHolder(productView);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ProductViewHolder holder, int position) {

        ShoppingDatabase db = ShoppingDatabase.getDatabase(context);
        CartItem currentItem = list.get(position);

        Log.d("cartdebug","inside bindviewholder");

        holder.setData(currentItem.getProductName(), currentItem.getPrice(), true,currentItem.getImageUrl());
        holder.remove.setVisibility(View.VISIBLE);

        holder.remove.setOnClickListener(v -> {


            List<CartItem> item = db.cartDao().searchItemInCart(currentItem.getItemId());

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
}