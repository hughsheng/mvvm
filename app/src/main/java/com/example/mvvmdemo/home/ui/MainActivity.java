package com.example.mvvmdemo.home.ui;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.home.data.MainViewModel;
import com.example.mvvmdemo.home.data.MainViewModuleFactory;
import com.example.mvvmdemo.home.data.UserBean;
import com.example.mvvmdemo.base.BaseActivity;
import com.example.mvvmdemo.databinding.ActivityMainBinding;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends BaseActivity<ActivityMainBinding> {

    public MainViewModuleFactory mainViewModuleFactory;

    private MainViewModel mainViewModel;

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        mainViewModel = mainViewModuleFactory.create(MainViewModel.class);
        UserBean userBean = mainViewModel.getUserBean();
        binding.setUser(userBean);
    }
}