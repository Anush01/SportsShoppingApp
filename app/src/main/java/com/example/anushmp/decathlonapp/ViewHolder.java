package com.example.anushmp.decathlonapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView mtvInfo;
    private ImageView mivShoe;
    private TextView mtvPrice;
    private TextView mtvMrpPrice;
    private TextView mtvDescription;
    private TextView mtvRating;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mtvInfo = itemView.findViewById(R.id.tvLowest);
        mivShoe = itemView.findViewById(R.id.ivShoe);
        mtvPrice = itemView.findViewById(R.id.tvPrice);
        mtvMrpPrice = itemView.findViewById(R.id.tvMrpPrice);
        mtvDescription = itemView.findViewById(R.id.tvDescrition);
        mtvRating = itemView.findViewById(R.id.tvRating);

    }

    public void setData(Model model){
        mtvInfo.setText(model.getInfo());
        mivShoe.setImageResource(model.getImageId());
        mtvPrice.setText( model.getPrice()+"");
        mtvMrpPrice.setText(model.getMrpPrice()+"");
        mtvDescription.setText(model.getDescription());
        mtvRating.setText(model.getRating()+"");

    }

}