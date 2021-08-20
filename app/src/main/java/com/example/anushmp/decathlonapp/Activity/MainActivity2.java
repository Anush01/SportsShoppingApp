package com.example.anushmp.decathlonapp.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anushmp.decathlonapp.Adapters.List1Adapter;
import com.example.anushmp.decathlonapp.Adapters.List2Adapter;
import com.example.anushmp.decathlonapp.Adapters.List3Adapter;
import com.example.anushmp.decathlonapp.Adapters.List4Adapter;
import com.example.anushmp.decathlonapp.Adapters.List5Adapter;
import com.example.anushmp.decathlonapp.Adapters.List6Adapter;
import com.example.anushmp.decathlonapp.Adapters.SlideAdapter;
import com.example.anushmp.decathlonapp.ModelClass.List1Model;
import com.example.anushmp.decathlonapp.ModelClass.List2Model;
import com.example.anushmp.decathlonapp.ModelClass.List3Model;
import com.example.anushmp.decathlonapp.ModelClass.List4Model;
import com.example.anushmp.decathlonapp.ModelClass.List5Model;
import com.example.anushmp.decathlonapp.ModelClass.List6Model;
import com.example.anushmp.decathlonapp.ModelClass.slide_item;
import com.example.anushmp.decathlonapp.R;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity  {
    ImageView runningChallenge;
    ImageView cyclingChallenge;
    ImageView runningEvents;
    ImageView cyclingEvents;
    ImageView blogPost1;
    ImageView blogPost2;
    ImageView blogPost3;
    ImageView imgProduct;
    View navIconSports;
    View navIconAccount;
    Button goToProductList;
    Button fitnessAndCardio;
    Button tennis;
    Button cycling;
    private RecyclerView recyclerView;
    private RecyclerView recyclerView1;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;
    private RecyclerView recyclerView4;
    private RecyclerView recyclerView5;
    ImageView goToCart;
    ArrayList<List1Model> list1ModelArrayList = new ArrayList<>();
    ArrayList<List2Model> list2ModelArrayList = new ArrayList<>();
    ArrayList<List3Model> list3ModelArrayList = new ArrayList<>();
    ArrayList<List4Model> list4ModelArrayList = new ArrayList<>();
    ArrayList<List5Model> list5ModelArrayList = new ArrayList<>();
    ArrayList<List6Model> list6ModelArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        SlideMe();
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
        nav();
        cart();
    }

    private void cart() {
        goToCart = findViewById(R.id.iv);
        goToCart.setOnClickListener(v -> {
            Intent i5 = new Intent(MainActivity2.this, CartActivity.class);
            startActivity(i5);

        });

    }

    private void openurl() {
        runningChallenge = findViewById(R.id.boxa);
        cyclingChallenge = findViewById(R.id.box14);
        runningEvents = findViewById(R.id.box15);
        cyclingEvents = findViewById(R.id.box16);
        blogPost1 = findViewById(R.id.boxb);
        blogPost2 = findViewById(R.id.boxc);
        blogPost3 = findViewById(R.id.boxd);
        runningChallenge.setOnClickListener(v -> {
            String url = "https://www.allforsport.in/event-details/physical-fitness-for-runners-with-patit-mahata-and-puneet-bhattacharya---sportsforall/cd547a5a-e149-11eb-8047-3fccd3bb25c8";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);

        });
        cyclingChallenge.setOnClickListener(v -> {
            String url = "https://www.allforsport.in/event-details/30km-cycling-challenge---sportsforall-sfa/676e3478-e52d-11eb-bb9b-1384bf45fe55";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        runningEvents.setOnClickListener(v -> {
            String url = "https://www.allforsport.in/event-details/my-journey-of-cycling-across-the-country-for-20,000km-:-bhagyashree---sportsforall/15399dee-e5cf-11eb-9300-6bb44d08881b";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        cyclingEvents.setOnClickListener(v -> {
            String url = "https://blog.decathlon.in/";

            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        blogPost1.setOnClickListener(v -> {
            String url = "https://blog.decathlon.in/search?query=How+to+maintain+a+marino+whool+garment%3F";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        blogPost2.setOnClickListener(v -> {
            String url = "https://blog.decathlon.in/search?query=Top5+monsoon+Accessories+you+need";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        blogPost3.setOnClickListener(v -> {
            String url = "https://blog.decathlon.in/search?query=Need+Guidance+for+your+sport%3F";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
    }

    private void buildStudentList() {

        list1ModelArrayList.add(new List1Model(R.drawable.ss18, "₹699", "men waterproof hiking pants,", "₹999", " 4.4/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss16, "₹799", " kelenji run 100", "₹999", " 4.4/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss17, "₹699", " slim - fitpolyester mens pant,", "₹1299", " 4.4/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss18, "₹699", "adult badmiminton racket", "₹999", " 3.9/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss10, "₹599", " mens cotton GYM pants", "₹699", " 4.3/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss9, "599", " trek 150 rain poncho,", "₹999", " 4/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss11, "₹699", "mens cricket striaghtfit pant", "₹899", " 4.6/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss23, "₹999", " mens footballshoes", "₹899", "4.5/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss21, "₹1499", "hex dumbell 5Kg", "₹2999", " 4.8/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss8, "₹599", "mens tennis t- shirt,", "₹999", " 4.6/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss20, "₹599", " mens rain jacket", "₹1299", " 4.4/5"));
    }

    private void buildStudentList1() {
        list2ModelArrayList.add(new List2Model(R.drawable.ss15, "₹1599", "comfort yoga mat,", "₹2000", " 4.5/5"));
        list2ModelArrayList.add(new List2Model(R.drawable.ss23, "₹999", " mens footballshoes,", "300", " 4.4/5"));
        list2ModelArrayList.add(new List2Model(R.drawable.ss21, "₹1499 ", "hex dumbell 5Kg", "₹2999", " 4.8/5"));
        list2ModelArrayList.add(new List2Model(R.drawable.ss22, "₹1999", "camping tent,", "₹2999", " 4.4/5"));
    }

    private void buildStudentList2() {
        list4ModelArrayList.add(new List4Model(R.drawable.l01, "₹1399", "Fitness 3kg dumbells", "1599", "4.7/5"));
        list4ModelArrayList.add(new List4Model(R.drawable.l02, "₹699", "Resistance Tube", "999", "4.7/5"));
        list4ModelArrayList.add(new List4Model(R.drawable.l03, "₹699", "Ankle weight", "1099", "4.6/5"));
        list4ModelArrayList.add(new List4Model(R.drawable.l04, "₹1699", "Pilates conmfort mat", "2199", "4.2/5"));
        list4ModelArrayList.add(new List4Model(R.drawable.l05, "₹1199", "Gym Ball", "1599", "4/5"));

    }

    private void buildStudentList3() {
        list3ModelArrayList.add(new List3Model(R.drawable.ss7, "₹999", " soft 140 mesh mens shoes", "₹1299", " 4.6/5"));
        list3ModelArrayList.add(new List3Model(R.drawable.ss2, "₹1099", "PW 160 slip walking shoes", "1300", " 4.6/5"));
        list3ModelArrayList.add(new List3Model(R.drawable.ss6, "₹1099", " HW 100 MENS active shoes", "₹1999", " 4.4/5"));
        list3ModelArrayList.add(new List3Model(R.drawable.ss3, "₹1099", "soft 180strap walking shoes", "₹2099", " 4.5/5"));
        list3ModelArrayList.add(new List3Model(R.drawable.ss4, "₹1099", "  PW 500 fresh women fitness shoes", "₹1999", "4.8/5"));
        list3ModelArrayList.add(new List3Model(R.drawable.ss5, "₹1099", "slip on women fitness shoes", "1009", " 4.6/5"));
    }

    private void buildStudentList4() {
        list5ModelArrayList.add(new List5Model(R.drawable.l12, "999", "machine", "1300", "4.5/5"));
        list5ModelArrayList.add(new List5Model(R.drawable.l11, "1100", "Tshirt", "1500", "4.5/5"));
        list5ModelArrayList.add(new List5Model(R.drawable.l13, "1300", "Flexible Pant", "2000", "4.5/5"));
        list5ModelArrayList.add(new List5Model(R.drawable.l14, "999", "Crop Top", "1999", "4.5/5"));
        list5ModelArrayList.add(new List5Model(R.drawable.l15, "1300", "Mens Shorts", "1099", "4.5/5"));
    }

    private void buildStudentList6() {
        list6ModelArrayList.add(new List6Model(R.drawable.ss20, "₹599", " mens rain jacket", "₹1299", " 4.4/5"));
        list6ModelArrayList.add(new List6Model(R.drawable.ss9, "₹599", " trek 150 rain poncho,", "₹999", " 4/5"));
        list6ModelArrayList.add(new List6Model(R.drawable.l15, "₹1300", "Mens Shorts", "1099", "4.5/5"));
    }


    private void SlideMe() {
        ArrayList<slide_item> sliderDataArrayList = new ArrayList<>();
        SliderView sliderView = findViewById(R.id.imageSlider);
        sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/ig1.png"));
        sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/slid2.png"));
        sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/sli3.png"));
        sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/slid3.png.jpeg"));
        sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/slide4.png.jpeg"));
        SlideAdapter adapter = new SlideAdapter(this, sliderDataArrayList);
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
        sliderView.setSliderAdapter(adapter);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();
    }


    private void initView() {
        recyclerView = findViewById(R.id.recyclerView5);
        recyclerView1 = findViewById(R.id.recyclerView2);
        recyclerView2 = findViewById(R.id.recyclerView3);
        recyclerView3 = findViewById(R.id.recyclerView4);
        recyclerView4 = findViewById(R.id.recyclerView6);
        recyclerView5 = findViewById(R.id.recyclerView1);


    }

    public void setRecyclerView() {
        List1Adapter list1Adapter = new List1Adapter(list1ModelArrayList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(list1Adapter);

    }

    public void setRecyclerView3() {
        List2Adapter list2Adapter = new List2Adapter(list2ModelArrayList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(linearLayoutManager);
        recyclerView1.setAdapter(list2Adapter);

    }

    public void setRecyclerView4() {
        List3Adapter list3Adapter = new List3Adapter(list3ModelArrayList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.setAdapter(list3Adapter);

    }

    public void setRecyclerView5() {
        List4Adapter list4Adapter = new List4Adapter(list4ModelArrayList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView3.setLayoutManager(linearLayoutManager);
        recyclerView3.setAdapter(list4Adapter);

    }

    public void setRecyclerView6() {
        List5Adapter list5Adapter = new List5Adapter(list5ModelArrayList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView4.setLayoutManager(linearLayoutManager);
        recyclerView4.setAdapter(list5Adapter);

    }

    public void setRecyclerView2() {
        List6Adapter list6Adapter = new List6Adapter(list6ModelArrayList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView5.setLayoutManager(linearLayoutManager);
        recyclerView5.setAdapter(list6Adapter);

    }


    public void openProduct() {
        imgProduct = findViewById(R.id.box6);
        imgProduct.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, ProductActivity.class);
            startActivity(intent);
        });
        goToProductList = findViewById(R.id.btn1);
        fitnessAndCardio=findViewById(R.id.btn2);
        tennis=findViewById(R.id.btn3);
        cycling=findViewById(R.id.btn4);
        tennis.setOnClickListener(v -> Toast.makeText(tennis.getContext(), "Tennis Products",Toast.LENGTH_SHORT).show());
        cycling.setOnClickListener(v -> Toast.makeText(cycling.getContext(), "Cycling Products",Toast.LENGTH_SHORT).show());
        fitnessAndCardio.setOnClickListener(v -> Toast.makeText(fitnessAndCardio.getContext(), "Fitness And Cardio Products",Toast.LENGTH_SHORT).show());
        goToProductList.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, ProductActivity.class);
            startActivity(intent);
        });
    }

    private void nav() {
        navIconSports = findViewById(R.id.sports);
        navIconSports.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, SportsPage.class);
            startActivity(intent);
        });
        navIconAccount = findViewById(R.id.account);
        navIconAccount.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, Account_Activity2.class);
            startActivity(intent);
        });
    }

}