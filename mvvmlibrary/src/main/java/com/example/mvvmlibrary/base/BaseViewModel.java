package com.example.mvvmlibrary.base;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmlibrary.data.SingleLiveEvent;

/**
 * created by tl
 * created at 2020/8/18
 */
public class BaseViewModel extends ViewModel {

    public SingleLiveEvent<String> showLoading;//显示加载框
    public SingleLiveEvent<Void> hideLoading;//隐藏加载框

    public SingleLiveEvent<String> getShowLoading() {
        return createLiveData(showLoading);
    }

    public SingleLiveEvent<Void> getHideLoading() {
        return createLiveData(hideLoading);
    }


    private <T> SingleLiveEvent<T> createLiveData(SingleLiveEvent<T> liveData) {
        if (liveData == null) {
            liveData = new SingleLiveEvent<>();
        }
        return liveData;
    }
}
