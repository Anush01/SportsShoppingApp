package com.example.anushmp.decathlonapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class List1Adapter extends RecyclerView.Adapter<List1ViewHolder> {
    private ArrayList<List1Model> list1Models;

    public List1Adapter(ArrayList<List1Model> list1Models, MainActivity2 mainActivity) {
        this.list1Models = list1Models;
    }
    @NonNull
    @Override
    public List1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list1, parent, false);
        return new List1ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull List1ViewHolder holder, int position) {
        List1Model list1Model=list1Models.get(position);
        holder.setData(list1Model);
    }

    @Override
    public int getItemCount() {
        return list1Models.size();
    }
}
