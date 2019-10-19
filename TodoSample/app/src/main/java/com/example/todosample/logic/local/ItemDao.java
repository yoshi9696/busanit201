package com.example.todosample.logic.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.todosample.model.Item;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;
@Dao
public interface ItemDao {

    @Query("select * from item order by no desc")
    Flowable<List<Item>> fetchItems();

    // Update
    @Query("select * from item where no = :no")
    Flowable<Item> fetchItem(int no);

    // Insert
    @Insert
    Single<Long> saveItem(Item item);
}
