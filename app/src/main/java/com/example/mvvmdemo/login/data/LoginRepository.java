package com.example.mvvmdemo.login.data;

import com.example.httplibrary.bean.ErrorResultBean;
import com.example.httplibrary.bean.ResultBean;
import com.example.httplibrary.rx.SchedulersCompat;
import com.example.mvvmdemo.login.api.LoginApiService;
import com.example.mvvmlibrary.base.BaseRepository;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import okhttp3.RequestBody;

/**
 * created by tl
 * created at 2020/8/24
 */
public class LoginRepository extends BaseRepository {
    private LoginApiService loginApiService;

    @Inject
    public LoginRepository(LoginApiService loginApiService) {
        this.loginApiService = loginApiService;
    }

    public Observable<ResultBean<LoginBean>> getLoginData(RequestBody body) {
        return loginApiService.getLoginInfo(body);
    }


}
