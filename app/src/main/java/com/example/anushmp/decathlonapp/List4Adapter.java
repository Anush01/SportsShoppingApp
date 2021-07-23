package com.example.anushmp.decathlonapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class List4Adapter extends RecyclerView.Adapter<List4ViewHolder> {
    private ArrayList<List4Model> list4Models;

    public List4Adapter(ArrayList<List4Model> list4Models, MainActivity2 mainActivity2) {
        this.list4Models = list4Models;
    }

    @NonNull
    @Override
    public List4ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list4, parent, false);
        return new List4ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull List4ViewHolder holder, int position) {
        List4Model list4Model=list4Models.get(position);
        holder.setData(list4Model);
    }

    @Override
    public int getItemCount() {
        return list4Models.size();
    }
}
