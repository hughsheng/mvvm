package com.example.mvvmdemo.home.hilt;

import com.example.mvvmdemo.home.data.MainRepository;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

/**
 * created by tl
 * created at 2020/8/17
 * 提供依赖注入需要的实例
 */
@Module
@InstallIn(ActivityComponent.class)
public class MainModule {

    @Provides
    public static MainRepository providesMainRepository() {
        return new MainRepository();
    }

}
