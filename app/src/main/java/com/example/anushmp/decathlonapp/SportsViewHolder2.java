package com.example.anushmp.decathlonapp;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class SportsViewHolder2 extends RecyclerView.ViewHolder {
    private ImageView mtvImage2;

    public SportsViewHolder2(@NonNull View itemView) {
        super(itemView);
        intitView(itemView);
    }
    public void SetData2(SportsModel2 sportsModel2) {
        mtvImage2.setImageResource(sportsModel2.getImageView());
    }
    private void intitView(View itemView) {
        mtvImage2 = this.itemView.findViewById(R.id.sp2);
    }
}
