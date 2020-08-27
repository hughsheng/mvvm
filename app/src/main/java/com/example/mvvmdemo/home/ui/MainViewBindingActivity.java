package com.example.mvvmdemo.home.ui;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.databinding.ActivityMainBinding;
import com.example.mvvmdemo.home.data.MainViewModel;
import com.example.mvvmlibrary.base.activity.BaseDataBindingActivity;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainViewBindingActivity extends BaseDataBindingActivity<ActivityMainBinding, MainViewModel> {


    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {

    }

    @Override
    public MainViewModel getViewModel() {
        return null;
    }
}