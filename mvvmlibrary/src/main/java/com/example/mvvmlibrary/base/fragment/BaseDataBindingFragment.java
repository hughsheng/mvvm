package com.example.mvvmlibrary.base.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;

import com.example.mvvmlibrary.base.data.BaseViewModel;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import dagger.hilt.android.AndroidEntryPoint;

/**
 * created by tl
 * created at 2020/8/25
 */

public abstract class BaseDataBindingFragment<VB extends ViewDataBinding> extends BaseFragment {
    protected VB binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, getLayoutID(), container, false);
        return binding.getRoot();
    }

}
