package com.example.mvvmdemo.login.ui;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.databinding.FragmentLoginBinding;
import com.example.mvvmdemo.login.data.LoginViewModel;
import com.example.mvvmlibrary.base.BaseDataBindingFragment;
import com.example.mvvmlibrary.data.SingleLiveEvent;

/**
 * created by tl
 * created at 2020/8/24
 */
public class LoginFragment extends BaseDataBindingFragment<FragmentLoginBinding, LoginViewModel> {

    public static final String TAG = "LoginFragment";

    public static LoginFragment newInstance() {

        Bundle args = new Bundle();

        LoginFragment fragment = new LoginFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_login;
    }

    @Override
    protected void init() {
        SingleLiveEvent<String> sss=viewModel.getShowLoading();
        sss.setValue("121212121");
        String str=viewModel.getShowLoading().getValue();
        Toast.makeText(getContext(), str, Toast.LENGTH_SHORT).show();
    }
}
