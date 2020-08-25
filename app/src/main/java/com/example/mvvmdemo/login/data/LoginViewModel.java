package com.example.mvvmdemo.login.data;

import androidx.hilt.lifecycle.ViewModelInject;
import com.example.httplibrary.bean.ErrorResultBean;
import com.example.httplibrary.rx.SchedulersCompat;
import com.example.mvvmlibrary.base.BaseViewModel;
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
    private LoginRepository loginRepository;
    private LoginBean loginBean;

    public LoginViewModel() {

    }

    @ViewModelInject
    public LoginViewModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
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
