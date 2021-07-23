package com.example.anushmp.decathlonapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SportsAdapter2 extends RecyclerView.Adapter<SportsViewHolder2> {
    private ArrayList<SportsModel2> sportsModels2;



    public SportsAdapter2(ArrayList<SportsModel2> sportsModels, SportsPage sportsPage) {
        this.sportsModels2=sportsModels;
    }


    @NonNull
    @Override
    public SportsViewHolder2 onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sports_item2,parent, false);
        return new SportsViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder2 holder, int position) {
        SportsModel2 model2=sportsModels2.get(position);
        holder.SetData2(model2);
    }

    @Override
    public int getItemCount() {
        return sportsModels2.size();
    }
}
