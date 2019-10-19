package com.example.todosample.main;

import com.example.todosample.base.BasePresenter;
import com.example.todosample.base.BaseView;
import com.example.todosample.model.Item;

import java.util.List;

public class MainContract {
    public interface View
            extends BaseView {
        void fetchItemsDone(List<Item> items);
        void showDetail(int pos);
    }

    public interface Presenter
            extends BasePresenter<View> {
        //TODO fetch Items
        void fetchItems();
        void fetchItemsDone(List<Item> items);
        void showDetail(int no);
    }
}
