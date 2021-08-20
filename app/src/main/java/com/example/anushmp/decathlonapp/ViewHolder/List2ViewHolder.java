package com.example.anushmp.decathlonapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.ModelClass.List2Model;
import com.example.anushmp.decathlonapp.R;

public class List2ViewHolder extends RecyclerView.ViewHolder {
    private ImageView mtvimageView;
    private TextView mtvPrice;
    private TextView mtvDiscription;
    private TextView mtvMRP;
    private TextView mtvRating;

    public List2ViewHolder(@NonNull  View itemView) {
        super(itemView);
        initView();
    }
    private void initView() {
        mtvimageView=itemView.findViewById(R.id.ivShoe1);
        mtvDiscription=itemView.findViewById(R.id.tvDescrition1);
        mtvMRP=itemView.findViewById(R.id.tvMrpPrice1);
        mtvRating=itemView.findViewById(R.id.tvRating1);
        mtvPrice=itemView.findViewById(R.id.tvPrice1);
        mtvimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), "Latest Products",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void setData(List2Model list2Model){
        mtvimageView.setImageResource(list2Model.getMimgid());
        mtvPrice.setText(list2Model.getMprice());
        mtvMRP.setText(list2Model.getMmrap());
        mtvDiscription.setText(list2Model.getMdiscription());
        mtvRating.setText(list2Model.getMrating());
    }
}
