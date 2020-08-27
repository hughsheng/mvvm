package com.example.mvvmdemo.login.data;

import androidx.hilt.lifecycle.ViewModelInject;

import com.example.httplibrary.bean.ErrorResultBean;
import com.example.httplibrary.rx.SchedulersCompat;
import com.example.mvvmlibrary.base.data.BaseViewModel;
import com.google.gson.Gson;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import okhttp3.RequestBody;

/**
 * created by tl
 * created at 2020/8/25
 */

public class LoginViewModel extends BaseViewModel {

    public LoginRepository loginRepository;
    private LoginBean loginBean;

    @ViewModelInject
    public LoginViewModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public void checkLogin(String name, String pwd) {
        if (!name.equals("") && !pwd.equals("")) {
            LoginBody loginBody = new LoginBody();
            loginBody.setAccount(name);
            loginBody.setPassword(pwd);
            loginBody.setDeviceId("android");
            String str = new Gson().toJson(loginBody);
            RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; " +
                    "charset=utf-8"), str);
            login(body);
        } else {
            getNetWorkError().setValue("请输入完整信息");
        }
    }


    public void login(RequestBody requestBody) {
        Disposable disposable = loginRepository.getLoginData(requestBody)
                .compose(SchedulersCompat.applyIoSchedulers())  //以第一个订阅的线程为准
                .doOnSubscribe(new Consumer<Object>() {
                    @Override
                    public void accept(Object o) throws Exception {
                        getShowLoading().setValue("数据加载中...");
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .doOnTerminate(new Action() {
                    @Override
                    public void run() throws Exception {
                        getHideLoading().call();
                    }
                })
                .subscribe(new Consumer<Object>() {
                    @Override
                    public void accept(Object o) throws Exception {
                        loginBean = (LoginBean) o;
                        getNetWorkError().setValue("登录成功");
                    }
                }, new ErrorResultBean() {
                    @Override
                    protected void onError(ErrorResultBean.ErrorBean errorBean) {
                        getNetWorkError().setValue(errorBean.getErrorResult());
                    }
                });
        addSubscription(disposable);
    }
}
