package com.example.anushmp.decathlonapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SportsAdapter extends RecyclerView.Adapter<SportsViewHolder> {
    private ArrayList<SportsModel> sportsModels1;

    public SportsAdapter(ArrayList<SportsModel> sportsModels1, SportsPage sportsPage) {
        this.sportsModels1 = sportsModels1;
    }


    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sports_item,parent, false);
        return new SportsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        SportsModel model=sportsModels1.get(position);
        holder.SetData(model);
    }

    @Override
    public int getItemCount() {
        return sportsModels1.size();
    }
}
