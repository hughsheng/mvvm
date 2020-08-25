package com.example.mvvmdemo.base;

import com.example.mvvmdemo.base.app.AppApplication;

import retrofit2.Retrofit;

/**
 * created by tl
 * created at 2020/8/25
 */
public class BaseModule {
    public Retrofit retrofit = AppApplication.getInstance().getRetrofit();

}
