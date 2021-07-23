package com.example.anushmp.decathlonapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SportsAdapter extends RecyclerView.Adapter<SportsViewHolder> {
    private ArrayList<SportsModel> sportsModels;


    public SportsAdapter(ArrayList<SportsModel> sportsModelArrayList, SportsPage sportsPage) {
        this.sportsModels=sportsModelArrayList;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sports_item,parent, false);
        return new SportsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        SportsModel model=sportsModels.get(position);
        holder.SetData(model);

    }

    @Override
    public int getItemCount() {
        return sportsModels.size();
    }
}
