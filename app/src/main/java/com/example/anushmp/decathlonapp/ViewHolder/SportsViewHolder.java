package com.example.anushmp.decathlonapp.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.ModelClass.SportsModel;
import com.example.anushmp.decathlonapp.R;

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
