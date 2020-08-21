package com.example.mvvmdemo.home.data;

import androidx.lifecycle.ViewModel;

/**
 * created by tl
 * created at 2020/8/12
 * 获取原始数据仓库
 */
public class MainRepository  {
    private UserBean userBean;

    public UserBean getUserBean() {
        userBean=new UserBean("张三","26");
        return userBean;
    }

    
}
