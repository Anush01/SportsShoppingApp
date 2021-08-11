package com.example.anushmp.decathlonapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.ModelClass.List6Model;
import com.example.anushmp.decathlonapp.R;

public class List6ViewHolder extends RecyclerView.ViewHolder {
    private ImageView mtvimageView;
    private TextView mtvPrice;
    private TextView mtvDiscription;
    private TextView mtvMRP;
    private TextView mtvRating;
    public List6ViewHolder(@NonNull  View itemView) {
        super(itemView);
        initView();
    }
    private void initView() {
        mtvimageView=itemView.findViewById(R.id.ivShoe6);
        mtvDiscription=itemView.findViewById(R.id.tvDescrition6);
        mtvMRP=itemView.findViewById(R.id.tvMrpPrice6);
        mtvRating=itemView.findViewById(R.id.tvRating6);
        mtvPrice=itemView.findViewById(R.id.tvPrice6);
    }
    public void setData(List6Model list6Model){
        mtvimageView.setImageResource(list6Model.getMimgid());
        mtvPrice.setText(list6Model.getMprice());
        mtvMRP.setText(list6Model.getMmrap());
        mtvDiscription.setText(list6Model.getMdiscription());
        mtvRating.setText(list6Model.getMrating());
    }
}
