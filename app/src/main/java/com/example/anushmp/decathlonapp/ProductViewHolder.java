package com.example.anushmp.decathlonapp;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    public View itemView;
    public Button add;
    public  Button remove;
    public ProductViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
        add = itemView.findViewById(R.id.btnAdd);
        remove = itemView.findViewById(R.id.btnRemove);
    }

    public void setData(String name,int price,boolean isAdded,String imageUrl){

        Log.d("cartdebug","inside setdata");
        TextView tvName = itemView.findViewById(R.id.tvProductName);
        TextView tvPrice = itemView.findViewById(R.id.tvPrice);
        ImageView ivImg = itemView.findViewById(R.id.ivImg);

        tvName.setText(name);
        tvPrice.setText(String.valueOf(price));
        Picasso.get().load(imageUrl).into(ivImg);

        if (isAdded){
            add.setVisibility(View.INVISIBLE);
            remove.setVisibility(View.VISIBLE);
        }
        else{
            remove.setVisibility(View.INVISIBLE);
            add.setVisibility(View.VISIBLE);
        }
    }
}
