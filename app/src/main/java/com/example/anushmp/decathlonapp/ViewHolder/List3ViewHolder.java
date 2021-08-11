package com.example.anushmp.decathlonapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.ModelClass.List3Model;
import com.example.anushmp.decathlonapp.R;

public class List3ViewHolder extends RecyclerView.ViewHolder {
    private ImageView mtvimageView;
    private TextView mtvPrice;
    private TextView mtvDiscription;
    private TextView mtvMRP;
    private TextView mtvRating;


    public List3ViewHolder(@NonNull  View itemView) {
        super(itemView);
        initView();
    }


    private void initView() {
        mtvimageView=itemView.findViewById(R.id.ivShoe2);
        mtvDiscription=itemView.findViewById(R.id.tvDescrition2);
        mtvMRP=itemView.findViewById(R.id.tvMrpPrice2);
        mtvRating=itemView.findViewById(R.id.tvRating2);
        mtvPrice=itemView.findViewById(R.id.tvPrice2);
    }

    public void setData(List3Model list3Model){
        mtvimageView.setImageResource(list3Model.getMimgid());
        mtvPrice.setText(list3Model.getMprice());
        mtvMRP.setText(list3Model.getMmrap());
        mtvDiscription.setText(list3Model.getMdiscription());
        mtvRating.setText(list3Model.getMrating());
    }
}
