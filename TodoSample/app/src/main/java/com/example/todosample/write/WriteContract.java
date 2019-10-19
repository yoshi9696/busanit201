package com.example.todosample.write;

import com.example.todosample.base.BasePresenter;
import com.example.todosample.base.BaseView;
import com.example.todosample.model.Item;

public class WriteContract {
    public interface View extends BaseView {
        // 작성완료 ( <= Presenter)
        void saveDone();
    }

    public interface Presenter
            extends BasePresenter<View> {
        // 저장
        void save(Item item);
        // 작성완료 ( <= Repository)
        void saveDone();
    }
}
