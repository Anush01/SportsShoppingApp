package com.example.anushmp.decathlonapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SportAdapter extends RecyclerView.Adapter<SportViewHolder> {

    private ArrayList<SportModel> sportModelList;

    public SportAdapter(ArrayList<SportModel> sportModelList){
        this.sportModelList = sportModelList;
    }


    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_sports,parent,false);
        return new SportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {
        SportModel sportModel = sportModelList.get(position);
        holder.setData(sportModel);
    }

    @Override
    public int getItemCount() {
        return sportModelList.size();
    }
}
