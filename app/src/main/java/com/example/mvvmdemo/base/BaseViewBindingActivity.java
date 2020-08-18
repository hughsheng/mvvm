package com.example.mvvmdemo.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;

/**
 * created by tl
 * created at 2020/8/18
 */
public abstract class BaseViewBindingActivity<VB extends ViewDataBinding> extends BaseActivity {

    private VB viewBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
