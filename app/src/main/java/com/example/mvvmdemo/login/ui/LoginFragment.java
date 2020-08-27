package com.example.mvvmdemo.login.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.example.mvvmdemo.R;
import com.example.mvvmdemo.databinding.FragmentLoginBinding;
import com.example.mvvmdemo.login.data.LoginViewModel;
import com.example.mvvmlibrary.base.fragment.BaseDataBindingFragment;

/**
 * created by tl
 * created at 2020/8/24
 */

public class LoginFragment extends BaseDataBindingFragment<FragmentLoginBinding> {

    private LoginViewModel viewModel;

    public static final String TAG = "LoginFragment";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (getActivity() != null) {
            viewModel = ((LoginActivity) getActivity()).getViewModel();
        }
    }

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
        binding.loginTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.nameEt.getText().toString();
                String pwd = binding.pwdEt.getText().toString();
                viewModel.checkLogin(name, pwd);
            }
        });
    }

}
