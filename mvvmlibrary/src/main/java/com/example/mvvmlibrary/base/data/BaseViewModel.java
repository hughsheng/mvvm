package com.example.mvvmlibrary.base.data;

import androidx.lifecycle.ViewModel;
import com.example.mvvmlibrary.data.SingleLiveEvent;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * created by tl
 * created at 2020/8/18
 */
public class BaseViewModel extends ViewModel {

    private CompositeDisposable mCompositeSubscription;

    private SingleLiveEvent<String> showLoading;//显示加载框
    private SingleLiveEvent<Void> hideLoading;//隐藏加载框
    private SingleLiveEvent<String> netWorkError; //网络或接口报错

    public SingleLiveEvent<String> getShowLoading() {
        showLoading=createLiveData(showLoading);
        return showLoading;
    }

    public SingleLiveEvent<Void> getHideLoading() {
        hideLoading=createLiveData(hideLoading);
        return hideLoading;
    }

    public SingleLiveEvent<String> getNetWorkError() {
        netWorkError=createLiveData(netWorkError);
        return netWorkError;
    }

    private <T> SingleLiveEvent<T> createLiveData(SingleLiveEvent<T> liveData) {
        if (liveData == null) {
            liveData = new SingleLiveEvent<T>();
        }
        return liveData;
    }

    protected void addSubscription(Disposable disposable) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeDisposable();
        }
        mCompositeSubscription.add(disposable);
    }

    /**
     * RxJava取消注册，以避免内存泄露
     */
    protected void onUnSubscribe() {
        if (mCompositeSubscription != null && mCompositeSubscription.size() > 0) {
            mCompositeSubscription.dispose();
        }
    }
}
