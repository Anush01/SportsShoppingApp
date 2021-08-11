package com.example.anushmp.decathlonapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class CartItem {
    @PrimaryKey
    @ColumnInfo(name = "itemId")
    private int itemId;

    @ColumnInfo(name = "price")
    private int price;

    @ColumnInfo(name = "productName")
    String productName;

    @ColumnInfo(name = "imageUrl")
    String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }


    public CartItem(int itemId, int price, String productName, String imageUrl) {
        this.itemId = itemId;
        this.price = price;
        this.productName = productName;
        this.imageUrl = imageUrl;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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


}
