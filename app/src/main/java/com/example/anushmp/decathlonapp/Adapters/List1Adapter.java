package com.example.anushmp.decathlonapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.Activity.MainActivity2;
import com.example.anushmp.decathlonapp.ModelClass.List1Model;
import com.example.anushmp.decathlonapp.R;
import com.example.anushmp.decathlonapp.ViewHolder.List1ViewHolder;
import com.example.anushmp.decathlonapp.item_listener;

import java.util.ArrayList;

public class List1Adapter extends RecyclerView.Adapter<List1ViewHolder> {
    ArrayList<List1Model> list1Models;
    private item_listener itemClickListener;

    public List1Adapter(ArrayList<List1Model> list1Models,item_listener item_listener) {
        this.list1Models = list1Models;
        this.itemClickListener=item_listener;
    }

    @NonNull
    @Override
    public List1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list1, parent, false);
        return new List1ViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull List1ViewHolder holder, int position) {
        List1Model list1Model = list1Models.get(position);
        holder.setData(list1Model);
    }

    @Override
    public int getItemCount() {
        return list1Models.size();
    }
}
