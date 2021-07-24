package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

import java.util.ArrayList;

public class SportsPage extends AppCompatActivity {
    private RecyclerView recyclerViews;
    private RecyclerView recyclerViews2;
    private ArrayList<SportsModel> sportsModelArrayList1 = new ArrayList<>();
    private ArrayList<SportsModel2> sportsModelArrayList=new ArrayList<>();
    private ImageView sp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_page);
        initView();
        initView1();
        buildStudentList7();
        setRecyclerViews();
        setRecyclerViews2();
        buildStudentList8();
    }
    private void buildStudentList7() {
            sportsModelArrayList1.add(new SportsModel(R.drawable.s1));
            sportsModelArrayList1.add(new SportsModel(R.drawable.s2));
            sportsModelArrayList1.add(new SportsModel(R.drawable.s3));
    }
    private void buildStudentList8() {
        sportsModelArrayList.add(new SportsModel2(R.drawable.s4));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s5));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s6));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s7));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s8));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s10));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s11));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s12));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s13));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s14));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s15));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s16));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s17));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s18));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s19));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s20));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s21));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s22));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s23));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s24));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s25));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s26));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s27));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s28));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s29));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s30));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s31));
        sportsModelArrayList.add(new SportsModel2(R.drawable.s32));
    }
    public void setRecyclerViews() {
        SportsAdapter sportsAdapter=new SportsAdapter(sportsModelArrayList1,this);
         LinearLayoutManager gridLayoutManager = new LinearLayoutManager(SportsPage.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViews.setLayoutManager(gridLayoutManager);
        recyclerViews.setAdapter(sportsAdapter);
    }
    public void setRecyclerViews2() {
        SportsAdapter2 sportsAdapter2=new SportsAdapter2(sportsModelArrayList,this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(SportsPage.this,2);
        recyclerViews2.setLayoutManager(gridLayoutManager);
        recyclerViews2.setAdapter(sportsAdapter2);
    }
    private void initView(){
        recyclerViews=findViewById(R.id.recyclerViews);
    }
    private void initView1(){
        recyclerViews2=findViewById(R.id.recyclerViews2);
    }
}