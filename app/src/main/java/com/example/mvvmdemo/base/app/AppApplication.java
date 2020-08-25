package com.example.mvvmdemo.base.app;

import com.example.mvvmdemo.BuildConfig;
import com.example.mvvmdemo.base.api.ApiServiceModule;
import com.example.mvvmlibrary.app.BaseApplication;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.HiltAndroidApp;
import retrofit2.Retrofit;

@HiltAndroidApp
public class AppApplication extends BaseApplication {

    @Inject
    Retrofit retrofit;
    @Inject
    Retrofit debugRetrofit;

    private static AppApplication application;//把application设置为静态对象

    public static AppApplication getInstance() {
        return application;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public Retrofit getRetrofit() {
        if (BuildConfig.BUILD_TYPE.equals("debug")) {
            return debugRetrofit;
        } else {
            return retrofit;
        }
    }

}
