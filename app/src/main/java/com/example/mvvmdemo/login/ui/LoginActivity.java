package com.example.mvvmdemo.login.ui;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.databinding.ActivityContainerNotoolbarBinding;
import com.example.mvvmdemo.login.data.LoginViewModel;
import com.example.mvvmdemo.utils.ActivityUtils;
import com.example.mvvmlibrary.base.activity.BaseActivity;
import com.example.mvvmlibrary.base.activity.BaseDataBindingActivity;
import com.example.mvvmlibrary.base.data.BaseViewModel;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

/**
 * created by tl
 * created at 2020/8/24
 */
@AndroidEntryPoint
public class LoginActivity extends BaseDataBindingActivity<ActivityContainerNotoolbarBinding, LoginViewModel> {

    @Override
    protected int getLayoutID() {
        return R.layout.activity_container_notoolbar;
    }

    @Override
    protected void initData() {
        LoginFragment loginFragment = LoginFragment.newInstance();
        ActivityUtils.addFragmentToActivity(fragmentManager, loginFragment, R.id.container, LoginFragment.TAG);
    }

    @Override
    public LoginViewModel getViewModel() {
        return viewModel;
    }


}
