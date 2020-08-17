package com.example.mvvmdemo.home.hilt;

import com.example.mvvmdemo.base.BaseActivity;
import com.example.mvvmdemo.home.data.MainRepository;
import com.example.mvvmdemo.home.ui.MainActivity;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import retrofit2.Retrofit;

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

//    @Provides
//    public static Retrofit providesRetrofit(Retrofit retrofit) {
//        return retrofit;
//    }

}
