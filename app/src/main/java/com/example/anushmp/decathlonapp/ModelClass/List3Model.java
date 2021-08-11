package com.example.anushmp.decathlonapp.ModelClass;

public class List3Model {
     int mimgid;
     String mprice;
     String mdiscription;
    String mmrap;
     String mrating;

    public List3Model(int mimgid, String mprice, String mdiscription, String mmrap, String mrating) {
        this.mimgid = mimgid;
        this.mprice = mprice;
        this.mdiscription = mdiscription;
        this.mmrap = mmrap;
        this.mrating = mrating;
    }

    public int getMimgid() {
        return mimgid;
    }

    public String getMprice() {
        return mprice;
    }

    public String getMdiscription() {
        return mdiscription;
    }

    public String getMmrap() {
        return mmrap;
    }

    public String getMrating() {
        return mrating;
    }
}
