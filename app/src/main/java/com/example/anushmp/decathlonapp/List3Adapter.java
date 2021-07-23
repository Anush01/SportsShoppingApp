package com.example.anushmp.decathlonapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class List3Adapter extends RecyclerView.Adapter<List3ViewHolder> {
    private ArrayList<List3Model> list3Models;

    public List3Adapter(ArrayList<List3Model> list3Models, MainActivity2 mainActivity2) {
        this.list3Models = list3Models;
    }

    @NonNull
    @Override
    public List3ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list3, parent, false);
        return new List3ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  List3ViewHolder holder, int position) {
        List3Model list3Model=list3Models.get(position);
        holder.setData(list3Model);
    }

    @Override
    public int getItemCount() {
        return list3Models.size();
    }
}
