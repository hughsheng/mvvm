package com.example.mvvmdemo.login.ui;

import android.util.Log;
import android.widget.Toast;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.utils.ActivityUtils;
import com.example.mvvmlibrary.base.BaseActivity;

/**
 * created by tl
 * created at 2020/8/24
 */
public class LoginActivity extends BaseActivity {
    @Override
    protected int getLayoutID() {
        return R.layout.activity_container_notoolbar;
    }

    @Override
    protected void init() {
        LoginFragment loginFragment = LoginFragment.newInstance();
        ActivityUtils.addFragmentToActivity(fragmentManager, loginFragment, R.id.container, LoginFragment.TAG);
    }
}
