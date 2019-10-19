package com.example.todosample.logic.remote;

import com.example.todosample.logic.DataSource;
import com.example.todosample.logic.Repository;
import com.example.todosample.model.Item;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

public class RemoteDataSourceImpl implements DataSource {
    @Override
    public void setRepository(Repository repository) {

    }

    @Override
    public Single<Long> save(Item item) {

        return null;
    }

    @Override
    public Flowable<List<Item>> fetchItems() {
        return null;
    }

    @Override
    public Single<Item> fetchItem(int no) {
        return null;
    }
}
