package com.example.mvvmdemo.home.ui;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.home.data.MainViewModel;
import com.example.mvvmdemo.home.data.MainViewModuleFactory;
import com.example.mvvmdemo.home.data.UserBean;
import com.example.mvvmdemo.base.BaseDataBindingActivity;
import com.example.mvvmdemo.databinding.ActivityMainBinding;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainDataBindingActivity extends BaseDataBindingActivity<ActivityMainBinding,MainViewModel> {



    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        UserBean userBean = viewModel.getUserBean();
        binding.setUser(userBean);

    }
}