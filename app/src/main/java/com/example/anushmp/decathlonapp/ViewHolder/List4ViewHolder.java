package com.example.anushmp.decathlonapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.ModelClass.List4Model;
import com.example.anushmp.decathlonapp.R;

public class List4ViewHolder extends RecyclerView.ViewHolder {
    private ImageView mtvimageView;
    private TextView mtvPrice;
    private TextView mtvDiscription;
    private TextView mtvMRP;
    private TextView mtvRating;

    private void initView() {
        mtvimageView=itemView.findViewById(R.id.ivShoe4);
        mtvDiscription=itemView.findViewById(R.id.tvDescrition4);
        mtvMRP=itemView.findViewById(R.id.tvMrpPrice4);
        mtvRating=itemView.findViewById(R.id.tvRating4);
        mtvPrice=itemView.findViewById(R.id.tvPrice4);
    }
    public List4ViewHolder(@NonNull  View itemView) {
        super(itemView);
        initView();
    }
    public void setData(List4Model list4Model){
        mtvimageView.setImageResource(list4Model.getMimgid());
        mtvPrice.setText(list4Model.getMprice());
        mtvMRP.setText(list4Model.getMmrap());
        mtvDiscription.setText(list4Model.getMdiscription());
        mtvRating.setText(list4Model.getMrating());
    }
}
