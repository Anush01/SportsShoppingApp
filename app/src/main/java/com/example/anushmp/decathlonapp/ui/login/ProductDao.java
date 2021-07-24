package com.example.anushmp.decathlonapp.ui.login;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.anushmp.decathlonapp.CartItem;
import com.example.anushmp.decathlonapp.data.model.Product;

import java.util.List;
@Dao
public interface ProductDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Product product);

    @Query("SELECT * FROM Product")
    LiveData<List<Product>> getProducts();
}
