package com.example.mvvmdemo;

import com.example.mvvmdemo.base.BaseActivity;
import com.example.mvvmdemo.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        UserBean userBean = new UserBean("韩梅梅", "18");
        binding.setUser(userBean);

    }
}