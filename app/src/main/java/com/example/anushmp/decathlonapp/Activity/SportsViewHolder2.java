package com.example.anushmp.decathlonapp.Activity;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.ModelClass.SportsModel2;
import com.example.anushmp.decathlonapp.R;


public class SportsViewHolder2 extends RecyclerView.ViewHolder {
    private ImageView mtvImage2;

    public SportsViewHolder2(@NonNull View itemView) {
        super(itemView);
        intitView();
    }

    public void SetData(SportsModel2 sportsModel2) {
        mtvImage2.setImageResource(sportsModel2.getImageView1());
    }

    private void intitView() {
        mtvImage2 = this.itemView.findViewById(R.id.sp2);
    }
}
