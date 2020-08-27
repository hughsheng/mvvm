package com.example.mvvmdemo.login.data;

import com.example.httplibrary.bean.ResultBean;
import com.example.mvvmdemo.base.BaseModule;
import com.example.mvvmdemo.login.api.LoginApiService;

import javax.inject.Inject;

import io.reactivex.Observable;
import okhttp3.RequestBody;

/**
 * created by tl
 * created at 2020/8/24
 */
public class LoginRepository  {
    private LoginApiService loginApiService ;

    public LoginRepository(LoginApiService loginApiService) {
        this.loginApiService = loginApiService;
    }

    public Observable<ResultBean<LoginBean>> getLoginData(RequestBody body) {
        return loginApiService.getLoginInfo(body);
    }

}
