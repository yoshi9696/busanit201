package com.example.todosample.logic.local;

import com.example.todosample.logic.DataSource;
import com.example.todosample.logic.Repository;
import com.example.todosample.model.Item;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

public class LocalDataSourceImpl implements DataSource {
    Repository repository;
    AppDatabase appDatabase;

    public LocalDataSourceImpl() {
        try {
            appDatabase = AppDatabaseProvider.getINSTANCE();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Single<Long> save(final Item item) {
        //TODO SAVE
        return getItemDao().saveItem(item);
    }

    // Fetch Items
    @Override
    public Flowable<List<Item>> fetchItems() {
        return getItemDao().fetchItems();
    }

    @Override
    public Single<Item> fetchItem(int no) {
        // Item 내 title -> title + "_";
        return getItemDao().fetchItem(no)
                .firstOrError();

    }

    private ItemDao getItemDao() {
        return appDatabase.getItemDao();
    }
}
