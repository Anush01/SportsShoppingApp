package com.example.anushmp.decathlonapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.Activity.MainActivity2;
import com.example.anushmp.decathlonapp.ModelClass.List5Model;
import com.example.anushmp.decathlonapp.R;
import com.example.anushmp.decathlonapp.ViewHolder.List5ViewHolder;

import java.util.ArrayList;

public class List5Adapter extends RecyclerView.Adapter<List5ViewHolder> {
     ArrayList<List5Model> list5Models;
     MainActivity2 mainActivity2;

    public List5Adapter(ArrayList<List5Model> list5Models, MainActivity2 mainActivity2) {
        this.list5Models = list5Models;
        this.mainActivity2 = mainActivity2;
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
