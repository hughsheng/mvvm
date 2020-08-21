package com.example.mvvmlibrary.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * created by tl
 * created at 2020/8/18
 */
public abstract class BaseViewBindingActivity<VB extends ViewDataBinding> extends BaseActivity {

    private VB viewBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Class<VB> viewBindingClass;
        Type type = getClass().getGenericSuperclass();
        Type[] types = ((ParameterizedType) type).getActualTypeArguments();
        viewBindingClass = (Class<VB>) types[0];
    }
}
