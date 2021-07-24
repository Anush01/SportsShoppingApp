package com.example.anushmp.decathlonapp;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.anushmp.decathlonapp.data.model.Product;
import com.example.anushmp.decathlonapp.ui.login.CartDao;
import com.example.anushmp.decathlonapp.ui.login.ProductDao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {CartItem.class, Product.class}, version = 3, exportSchema = false)
public abstract class ShoppingDatabase extends RoomDatabase {

    public abstract CartDao cartDao();
    public abstract ProductDao productDao();
    private static volatile ShoppingDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static ShoppingDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ShoppingDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ShoppingDatabase.class, "word_database").allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}

