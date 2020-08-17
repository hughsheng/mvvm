package com.example.mvvmdemo.home.data;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

/**
 * created by tl
 * created at 2020/8/12
 * 从仓库获取数据并处理成界面展示需要的数据
 */

public class  MainViewModel extends ViewModel {

    private MainRepository mainRepository;

    @ViewModelInject
    public MainViewModel(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    public UserBean getUserBean() {
        return mainRepository.getUserBean();
    }
}
