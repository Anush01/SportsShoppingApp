package com.example.anushmp.decathlonapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.Activity.MainActivity2;
import com.example.anushmp.decathlonapp.ModelClass.List2Model;
import com.example.anushmp.decathlonapp.R;
import com.example.anushmp.decathlonapp.ViewHolder.List2ViewHolder;

import java.util.ArrayList;

public class List2Adapter extends RecyclerView.Adapter<List2ViewHolder> {
    ArrayList<List2Model> list2Models;
     MainActivity2 mainActivity2;

    public List2Adapter(ArrayList<List2Model> list2Models, MainActivity2 mainActivity2) {
        this.list2Models = list2Models;
        this.mainActivity2 = mainActivity2;
    }


    @NonNull
    @Override
    public List2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list2, parent, false);
        return new List2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  List2ViewHolder holder, int position) {
        List2Model list2Model=list2Models.get(position);
        holder.setData(list2Model);
    }

    @Override
    public int getItemCount() {
        return list2Models.size();
    }
}
