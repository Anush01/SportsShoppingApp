package com.example.anushmp.decathlonapp;

public class List1Model {
    private int mimgid;
    private String mprice;
    private String mdiscription;
    private String mmrap;
    private String mrating;

    public List1Model(int mimgid, String mprice, String mdiscription, String mmrap, String mrating) {
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
