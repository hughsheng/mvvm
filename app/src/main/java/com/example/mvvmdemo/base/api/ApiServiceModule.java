package com.example.mvvmdemo.base.api;
import android.content.Context;
import com.example.httplibrary.BaseApiServiceModule;
import com.example.mvvmdemo.base.app.AppApplication;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

/**
 * created by tl
 * created at 2020/8/24
 * http参数设置
 */
@Module
@InstallIn(ApplicationComponent.class)
public class ApiServiceModule extends BaseApiServiceModule {


    @Override
    public int getCatchTime() {
        return 24 * 60 * 60;
    }

    @Override
    public int getReadTime() {
        return 180;
    }

    @Override
    public int getWriteTime() {
        return 180;
    }

    @Override
    public int getConnectTime() {
        return 5;
    }

    @Override
    public int getCacheSize() {
        return 1024 * 1024 * 50;
    }

    @Override
    public String getBaseUrl() {
        return "https://106.52.80.126:8010/";
    }

    @Override
    public Context getContext() {
        return AppApplication.getInstance();
    }

    @Override
    public String getCacheFileName() {
        return "mCache";
    }

    @Override
    public String getReleaseCertificate() {
        return "cer/certificate.cer";
    }

    @Override
    public String getDebugCertificate() {
        return "cer/certificate.cer";
    }
}
