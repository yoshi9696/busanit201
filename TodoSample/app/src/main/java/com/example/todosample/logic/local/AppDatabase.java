package com.example.todosample.logic.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.todosample.model.Item;

@Database(entities = {Item.class},
        version = 5)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ItemDao getItemDao();
}