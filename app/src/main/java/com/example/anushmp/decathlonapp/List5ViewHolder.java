package com.example.anushmp.decathlonapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class List5ViewHolder extends RecyclerView.ViewHolder {
    private ImageView mtvimageView;
    private TextView mtvPrice;
    private TextView mtvDiscription;
    private TextView mtvMRP;
    private TextView mtvRating;
    public List5ViewHolder(@NonNull  View itemView) {
        super(itemView);
        initView();
    }
    private void initView() {
        mtvimageView=itemView.findViewById(R.id.ivShoe5);
        mtvDiscription=itemView.findViewById(R.id.tvDescrition5);
        mtvMRP=itemView.findViewById(R.id.tvMrpPrice5);
        mtvRating=itemView.findViewById(R.id.tvRating5);
        mtvPrice=itemView.findViewById(R.id.tvPrice5);
    }
    public void setData(List5Model list5Model){
        mtvimageView.setImageResource(list5Model.getMimgid());
        mtvPrice.setText(list5Model.getMprice());
        mtvMRP.setText(list5Model.getMmrap());
        mtvDiscription.setText(list5Model.getMdiscription());
        mtvRating.setText(list5Model.getMrating());
    }
}
