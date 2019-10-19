package com.example.todosample.base;

public interface BasePresenter<T> {
    void setView(T view);
    void removeView();
}
