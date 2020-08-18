package com.example.mvvmdemo.base;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.mvvmdemo.home.data.MainViewModel;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * created by tl
 * created at 2020/8/12
 */
public abstract class BaseDataBindingActivity<V extends ViewDataBinding, VM extends BaseViewModel> extends BaseActivity {
    protected V binding;
    protected VM viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, getLayoutID());

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
        init();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (binding != null) {
            binding.unbind();
        }
    }
}
