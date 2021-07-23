package com.example.anushmp.decathlonapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class List5Adapter extends RecyclerView.Adapter<List5ViewHolder> {
    private ArrayList<List5Model> list5Models;

    public List5Adapter(ArrayList<List5Model> list5Models, MainActivity2 mainActivity2) {
        this.list5Models = list5Models;
    }

    @NonNull
    @Override
    public List5ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list5, parent, false);
        return new List5ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  List5ViewHolder holder, int position) {
        List5Model list5Model=list5Models.get(position);
        holder.setData(list5Model);
    }

    @Override
    public int getItemCount() {
        return list5Models.size();
    }
}
