package com.example.mvvmdemo.login.hilt;


import com.example.mvvmdemo.base.BaseModule;
import com.example.mvvmdemo.login.api.LoginApiService;
import com.example.mvvmdemo.login.data.LoginRepository;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;

/**
 * created by tl
 * created at 2020/8/24
 */
@Module
@InstallIn(ActivityComponent.class)
public class LoginModule extends BaseModule {

    @Provides
    public LoginApiService providesLoginApiService() {
        return retrofit.create(LoginApiService.class);
    }

    @Provides
    public LoginRepository providesLoginRepository(LoginApiService loginApiService) {
        return new LoginRepository(loginApiService);
    }
}
