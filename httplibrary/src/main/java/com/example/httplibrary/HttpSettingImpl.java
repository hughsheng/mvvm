package com.example.httplibrary;

import android.content.Context;

/**
 * created by tl
 * created at 2020/8/24
 * okhttp参数设置接口
 */
interface HttpSettingImpl {

    int getCatchTime();//设置缓存时间

    int getReadTime();//设置读取时间

    int getWriteTime();//设置写时间

    int getConnectTime();//设置连接时间

    int getCacheSize();//设置缓存大小

    String getBaseUrl();//设置baseUrl

    Context getContext();

    String getCacheFileName();

    String getReleaseCertificate();//正式环境证书地址

    String getDebugCertificate();//测试环境证书地址

}
