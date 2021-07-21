package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    // Urls of our images.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Slideme();

    }
private void Slideme(){
    // we are creating array list for storing our image urls.
    ArrayList<slide_item> sliderDataArrayList = new ArrayList<>();

    // initializing the slider view.
    SliderView sliderView = findViewById(R.id.imageSlider);

    // adding the urls inside array list
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/ig1.png"));
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/slid2.png"));
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/sli3.png"));
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/slid3.png.jpeg"));
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/slide4.png.jpeg"));

    // passing this array list inside our adapter class.
    SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);

    // below method is used to set auto cycle direction in left to
    // right direction you can change according to requirement.
    sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);

    // below method is used to
    // setadapter to sliderview.
    sliderView.setSliderAdapter(adapter);

    // below method is use to set
    // scroll time in seconds.
    sliderView.setScrollTimeInSec(3);

    // to set it scrollable automatically
    // we use below method.
    sliderView.setAutoCycle(true);

    // to start autocycle below method is used.
    sliderView.startAutoCycle();
}
}