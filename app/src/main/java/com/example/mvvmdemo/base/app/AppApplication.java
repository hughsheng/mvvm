package com.example.mvvmdemo.base.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dagger.hilt.DefineComponent;
import dagger.hilt.android.HiltAndroidApp;
import retrofit2.Retrofit;

@HiltAndroidApp
public class AppApplication extends Application {
    private static AppApplication application;//把application设置为静态对象
    private int width = 0, height = 0;
    private String versionName;
    private int versionCode;
    //管理所有的Activity
    private HashMap<String, AppCompatActivity> mActivityHashMap = new HashMap<>();

    public static AppApplication getInstance() {
        return application;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        application = this;

    }




    public AppCompatActivity getActivity(String acString) {
        AppCompatActivity activity = null;
        if (!mActivityHashMap.isEmpty()) {
            activity = mActivityHashMap.get(acString);
        }
        return activity;
    }

    private void initProperty() {
        DisplayMetrics metric = new DisplayMetrics();
        WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        wm.getDefaultDisplay().getMetrics(metric);
        width = metric.widthPixels; // 屏幕宽度（像素）
        height = metric.heightPixels; // 屏幕高度（像素
    }

    public int getWindowWidth() {
        if (width == 0) {
            initProperty();
        }
        return this.width;
    }

    public int getWindowHeight() {
        if (height == 0) {
            initProperty();
        }
        return this.height;
    }
}
