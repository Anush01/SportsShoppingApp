package com.example.anushmp.decathlonapp.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class newProduct {
    @PrimaryKey
    @ColumnInfo(name = "productId")
    int productId;

    @ColumnInfo(name = "price")
    int price;

    @ColumnInfo(name = "productName")
    String productName;

    @ColumnInfo(name = "imageUrl")
    String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public newProduct(int productId, int price, String productName, String imageUrl) {
        this.productId = productId;
        this.price = price;
        this.productName = productName;
        this.imageUrl = imageUrl;
    }
}
