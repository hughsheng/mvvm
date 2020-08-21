package com.example.mvvmlibrary.app;

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * created by tl
 * created at 2020/8/20
 */
public class BaseApplication extends Application {
    private static BaseApplication application;//把application设置为静态对象
    private int width = 0, height = 0;
    public static BaseApplication getInstance() {
        return application;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
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
