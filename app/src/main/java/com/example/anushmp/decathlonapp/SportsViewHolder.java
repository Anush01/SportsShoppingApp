package com.example.anushmp.decathlonapp;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SportsViewHolder extends RecyclerView.ViewHolder {
    private ImageView mtvImageView;

    public SportsViewHolder(@NonNull View itemView) {
        super(itemView);
        intitView();
    }

    public void SetData( SportsModel sportsModel) {
        mtvImageView.setImageResource(sportsModel.getImageView());
    }

    private void intitView() {
        mtvImageView = this.itemView.findViewById(R.id.sp1);

    }
}
