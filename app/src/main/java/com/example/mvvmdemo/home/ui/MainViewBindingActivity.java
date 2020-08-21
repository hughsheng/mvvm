package com.example.mvvmdemo.home.ui;

import androidx.databinding.ViewDataBinding;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.home.data.MainViewModel;
import com.example.mvvmdemo.home.data.UserBean;
import com.example.mvvmdemo.databinding.ActivityMainBinding;
import com.example.mvvmlibrary.base.BaseDataBindingActivity;
import com.example.mvvmlibrary.base.BaseViewBindingActivity;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainViewBindingActivity extends BaseViewBindingActivity<ActivityMainBinding> {

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        ActivityMainBinding.inflate(getLayoutInflater());
    }
}