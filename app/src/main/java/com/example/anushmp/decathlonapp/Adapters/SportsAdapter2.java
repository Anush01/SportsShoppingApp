package com.example.anushmp.decathlonapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.Activity.SportsPage;
import com.example.anushmp.decathlonapp.Activity.SportsViewHolder2;
import com.example.anushmp.decathlonapp.ModelClass.SportsModel2;
import com.example.anushmp.decathlonapp.R;

import java.util.ArrayList;

public class SportsAdapter2 extends RecyclerView.Adapter<SportsViewHolder2> {
    ArrayList<SportsModel2> sportsModels2;
    SportsPage sportsPage;


    public SportsAdapter2(ArrayList<SportsModel2> sportsModels, SportsPage sportsPage) {
        this.sportsModels2 = sportsModels;
        this.sportsPage = sportsPage;
    }


    @NonNull
    @Override
    public SportsViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sports_item2, parent, false);
        return new SportsViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder2 holder, int position) {
        SportsModel2 model2 = sportsModels2.get(position);
        holder.SetData(model2);
    }

    @Override
    public int getItemCount() {
        return sportsModels2.size();
    }
}
