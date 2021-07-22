package com.example.anushmp.decathlonapp;

public class Model {

    private String info;
    private int imageId;
    private double price;
    private double mrpPrice;
    private String description;
    private double rating;

    public Model(String info, int imageId, double price, double mrpPrice, String description, double rating) {
        this.info = info;
        this.imageId = imageId;
        this.price = price;
        this.mrpPrice = mrpPrice;
        this.description = description;
        this.rating = rating;
    }

    public String getInfo() {
        return info;
    }

    public int getImageId() {
        return imageId;
    }

    public double getPrice() {
        return price;
    }

    public double getMrpPrice() {
        return mrpPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getRating() {
        return rating;
    }
}