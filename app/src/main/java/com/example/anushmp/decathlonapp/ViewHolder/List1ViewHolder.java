package com.example.anushmp.decathlonapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.ModelClass.List1Model;
import com.example.anushmp.decathlonapp.R;

public class List1ViewHolder extends RecyclerView.ViewHolder {
    private ImageView mtvimageView;
    private TextView mtvPrice;
    private TextView mtvDiscription;
    private TextView mtvMRP;
    private TextView mtvRating;

    public List1ViewHolder(@NonNull View itemView) {
        super(itemView);
        initView();

    }
    public void setData(List1Model list1Model){
        mtvimageView.setImageResource(list1Model.getMimgid());
        mtvPrice.setText(list1Model.getMprice());
        mtvMRP.setText(list1Model.getMmrap());
        mtvDiscription.setText(list1Model.getMdiscription());
        mtvRating.setText(list1Model.getMrating());
    }

    private void initView() {
        mtvimageView=itemView.findViewById(R.id.ivShoe);
        mtvDiscription=itemView.findViewById(R.id.tvDescrition);
        mtvMRP=itemView.findViewById(R.id.tvMrpPrice);
        mtvRating=itemView.findViewById(R.id.tvRating);
        mtvPrice=itemView.findViewById(R.id.tvPrice);
    }
}
