package com.example.anushmp.decathlonapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.Activity.SportsPage;
import com.example.anushmp.decathlonapp.ModelClass.SportsModel;
import com.example.anushmp.decathlonapp.R;
import com.example.anushmp.decathlonapp.ViewHolder.SportsViewHolder;

import java.util.ArrayList;

public class SportsAdapter extends RecyclerView.Adapter<SportsViewHolder> {
    ArrayList<SportsModel> sportsModels1;
    SportsPage sportsPage;

    public SportsAdapter(ArrayList<SportsModel> sportsModels1, SportsPage sportsPage) {
        this.sportsModels1 = sportsModels1;
        this.sportsPage = sportsPage;
    }


    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sports_item, parent, false);
        return new SportsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        SportsModel model = sportsModels1.get(position);
        holder.SetData(model);
    }

    @Override
    public int getItemCount() {
        return sportsModels1.size();
    }
}
