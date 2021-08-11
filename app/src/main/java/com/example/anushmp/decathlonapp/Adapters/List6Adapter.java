package com.example.anushmp.decathlonapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.Activity.MainActivity2;
import com.example.anushmp.decathlonapp.ModelClass.List6Model;
import com.example.anushmp.decathlonapp.R;
import com.example.anushmp.decathlonapp.ViewHolder.List6ViewHolder;

import java.util.ArrayList;

public class List6Adapter extends RecyclerView.Adapter<List6ViewHolder> {
    ArrayList<List6Model> list6Models;
    MainActivity2 mainActivity2;

    public List6Adapter(ArrayList<List6Model> list6Models, MainActivity2 mainActivity2) {
        this.list6Models = list6Models;
        this.mainActivity2 = mainActivity2;
    }

    @NonNull
    @Override
    public List6ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list6, parent, false);
        return new List6ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull List6ViewHolder holder, int position) {
        List6Model list6Model = list6Models.get(position);
        holder.setData(list6Model);
    }

    @Override
    public int getItemCount() {
        return list6Models.size();
    }
}
