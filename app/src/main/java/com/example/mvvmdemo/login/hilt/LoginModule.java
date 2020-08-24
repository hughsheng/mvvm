package com.example.mvvmdemo.login.hilt;

import androidx.hilt.lifecycle.ViewModelInject;

import com.example.mvvmdemo.login.data.LoginRepository;
import com.example.mvvmlibrary.base.BaseRepository;
import com.example.mvvmlibrary.base.BaseViewModel;

import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

/**
 * created by tl
 * created at 2020/8/24
 */
@Module
@InstallIn(ActivityComponent.class)
public class LoginModule extends BaseViewModel {

    private LoginRepository loginRepository;

    @ViewModelInject
    public LoginModule(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }


}
