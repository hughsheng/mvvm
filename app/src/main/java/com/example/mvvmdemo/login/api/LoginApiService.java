package com.example.mvvmdemo.login.api;

import com.example.httplibrary.BaseApiService;
import com.example.httplibrary.bean.ResultBean;
import com.example.mvvmdemo.login.data.LoginBean;
import com.example.mvvmdemo.utils.HttpUtil;
import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface LoginApiService extends BaseApiService {

    @POST(HttpUtil.LOGIN)
    Observable<ResultBean<LoginBean>> getLoginInfo(@Body RequestBody loginBody);

}