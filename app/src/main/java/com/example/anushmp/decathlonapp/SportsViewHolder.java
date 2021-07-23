package com.example.anushmp.decathlonapp;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SportsViewHolder extends RecyclerView.ViewHolder {
    private ImageView mtvImageView;

    public SportsViewHolder(@NonNull View itemView) {
        super(itemView);
        intitView(itemView);
    }

    public void SetData( SportsModel model) {
        mtvImageView.setImageResource(model.getImageView());
    }

    private void intitView(View itemView) {
        mtvImageView = this.itemView.findViewById(R.id.sp1);

    }
}
