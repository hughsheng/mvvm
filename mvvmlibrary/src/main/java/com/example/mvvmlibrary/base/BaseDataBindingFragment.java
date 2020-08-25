package com.example.mvvmlibrary.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

/**
 * created by tl
 * created at 2020/8/25
 */

public abstract class BaseDataBindingFragment<VB extends ViewDataBinding, VM extends BaseViewModel> extends BaseFragment {
    protected VB binding;
    protected VM viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, getLayoutID(), container, false);
        try {
            Class modelClass;
            Type type = getClass().getGenericSuperclass();
            if (type instanceof ParameterizedType) {
                Type[] types = ((ParameterizedType) type).getActualTypeArguments();
                if (types.length > 1) {
                    modelClass = (Class<VM>) ((ParameterizedType) type).getActualTypeArguments()[1];
                } else {//如果没有指定viewmodel泛型,默认使用BaseViewModel
                    modelClass = BaseViewModel.class;
                }
            } else {
                //如果没有指定泛型参数，则默认使用BaseViewModel
                modelClass = BaseViewModel.class;
            }
            viewModel = (VM) getDefaultViewModelProviderFactory().create(modelClass);
        } catch (Exception e) {
            Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return binding.getRoot();
    }

}
