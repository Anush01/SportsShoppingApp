package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ImageView click1;
    private ImageView click2;
    private ImageView Box6;
    private Button mbtn1;
    private RecyclerView recyclerView;
    private RecyclerView recyclerView1;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;
    private RecyclerView recyclerView4;
    private RecyclerView recyclerView5;
    private ArrayList<List1Model> list1ModelArrayList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Slideme();
        initView();
        buildStudentList();
        buildStudentList1();
        buildStudentList2();
        buildStudentList3();
        buildStudentList4();
        buildStudentList6();
        setRecyclerView();
        setRecyclerView2();
        setRecyclerView3();
        setRecyclerView4();
        setRecyclerView5();
        setRecyclerView6();
        openProduct();
        openurl();
    }
    private void openurl(){
        click2=findViewById(R.id.boxa);
        click1=findViewById(R.id.box14);
        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://daaz.com/make/offer/domains/AllSports.in";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });
        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://blog.decathlon.in/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
    private void buildStudentList() {
        for(int i=0;i<5;i++) {
            list1ModelArrayList.add(new List1Model(R.drawable.shoe1, "234", "good shoe", "789", "4.5/5"));
        }
    }
    private void buildStudentList1() {
        for(int i=0;i<5;i++) {
            list1ModelArrayList.add(new List1Model(R.drawable.shoe1, "234", "good shoe", "789", "4.5/5"));
        }
    }
    private void buildStudentList2() {
        for(int i=0;i<5;i++) {
            list1ModelArrayList.add(new List1Model(R.drawable.shoe1, "234", "good shoe", "789", "4.5/5"));
        }
    }
    private void buildStudentList3() {
        for(int i=0;i<5;i++) {
            list1ModelArrayList.add(new List1Model(R.drawable.shoe1, "234", "good shoe", "789", "4.5/5"));
        }
    }
    private void buildStudentList4() {
        for(int i=0;i<5;i++) {
            list1ModelArrayList.add(new List1Model(R.drawable.shoe1, "234", "good shoe", "789", "4.5/5"));
        }
    }
    private void buildStudentList6() {
        for(int i=0;i<5;i++) {
            list1ModelArrayList.add(new List1Model(R.drawable.shoe1, "234", "good shoe", "789", "4.5/5"));
        }
    }
private void Slideme(){
    ArrayList<slide_item> sliderDataArrayList = new ArrayList<>();
    SliderView sliderView = findViewById(R.id.imageSlider);
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/ig1.png"));
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/slid2.png"));
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/sli3.png"));
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/slid3.png.jpeg"));
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/slide4.png.jpeg"));
    SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);
    sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
    sliderView.setSliderAdapter(adapter);
    sliderView.setScrollTimeInSec(3);
    sliderView.setAutoCycle(true);
    sliderView.startAutoCycle();
}
    private void initView() {
        recyclerView = findViewById(R.id.recyclerView5);
        recyclerView1=findViewById(R.id.recyclerView2);
        recyclerView2=findViewById(R.id.recyclerView3);
        recyclerView3=findViewById(R.id.recyclerView4);
        recyclerView4=findViewById(R.id.recyclerView6);
        recyclerView5=findViewById(R.id.recyclerView1);

    }
    public void setRecyclerView() {
        List1Adapter list1Adapter= new List1Adapter(list1ModelArrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(list1Adapter);

    }
    public void setRecyclerView3() {
        List1Adapter list1Adapter= new List1Adapter(list1ModelArrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView1.setLayoutManager(linearLayoutManager);
        recyclerView1.setAdapter(list1Adapter);

    }
    public void setRecyclerView4() {
        List1Adapter list1Adapter= new List1Adapter(list1ModelArrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.setAdapter(list1Adapter);

    }
    public void setRecyclerView5() {
        List1Adapter list1Adapter= new List1Adapter(list1ModelArrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView3.setLayoutManager(linearLayoutManager);
        recyclerView3.setAdapter(list1Adapter);

    }
    public void setRecyclerView6() {
        List1Adapter list1Adapter= new List1Adapter(list1ModelArrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView4.setLayoutManager(linearLayoutManager);
        recyclerView4.setAdapter(list1Adapter);

    }
    public void setRecyclerView2() {
        List1Adapter list1Adapter= new List1Adapter(list1ModelArrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView5.setLayoutManager(linearLayoutManager);
        recyclerView5.setAdapter(list1Adapter);

    }
    public void openProduct(){
        Box6=findViewById(R.id.box6);
        Box6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,All_productActivity.class);
                startActivity(intent);
            }
        });
        mbtn1=findViewById(R.id.btn1);
        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,All_productActivity.class);
                startActivity(intent);
            }
        });

    }
}