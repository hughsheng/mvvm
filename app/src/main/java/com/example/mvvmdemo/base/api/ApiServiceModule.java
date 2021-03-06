package com.example.mvvmdemo.base.api;

import android.content.Context;
import com.example.httplibrary.BaseApiServiceModule;
import com.example.httplibrary.BuildConfig;
import com.example.httplibrary.HttpSettingImpl;
import com.example.httplibrary.interceptor.CacheInterceptor;
import com.example.httplibrary.interceptor.HeadInterceptor;
import com.example.httplibrary.interceptor.ParamsInterceptor;
import com.example.httplibrary.interceptor.ResponseInterceptor;
import com.example.httplibrary.interceptor.VerificationInterceptor;
import java.security.KeyStore;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

/**
 * created by tl
 * created at 2020/8/24
 * http参数设置
 */
@Module
@InstallIn(ApplicationComponent.class)
public class ApiServiceModule extends BaseApiServiceModule implements HttpSettingImpl {

    @Override
    @Singleton
    @Provides
    public Cache getCache(@ApplicationContext Context mContext) {
        return providesCache(mContext);
    }

    @Override
    @Singleton
    @Provides
    public HttpLoggingInterceptor getHttpLoggingInterceptor() {
        return providesHttpLoggingInterceptor();
    }

    @Override
    @Singleton
    @Provides
    public HeadInterceptor getHeadInterceptor() {
        return providesHeadInterceptor();
    }

    @Override
    @Singleton
    @Provides
    public ParamsInterceptor getParamsInterceptor() {
        return providesParamsInterceptor();
    }

    @Override
    @Singleton
    @Provides
    public CacheInterceptor getCacheInterceptor() {
        return providesCacheInterceptor();
    }

    @Override
    @Singleton
    @Provides
    public VerificationInterceptor getVerificationInterceptor() {
        return providesVerificationInterceptor();
    }

    @Override
    @Singleton
    @Provides
    public ResponseInterceptor getResponseInterceptor() {
        return providesResponseInterceptor();
    }

    @Override
    @Singleton
    @Provides
    public X509TrustManager getX509TrustManager(TrustManagerFactory trustManagerFactory) {
        return providesTrustManagerForCertificates(trustManagerFactory);
    }

    @Override
    @Singleton
    @Provides
    public SSLSocketFactory getSSLSocketFactory(TrustManagerFactory trustManagerFactory) {
        return providesSSLSocketFactory(trustManagerFactory);
    }

    @Override
    @Singleton
    @Provides
    @Named(BuildConfig.BUILD_TYPE)
    public SSLSocketFactory getDebugSSLSocketFactory(TrustManagerFactory trustManagerFactory) {
        return providesDebugSSLSocketFactory(trustManagerFactory);
    }

    @Override
    @Singleton
    @Provides
    public TrustManagerFactory getTrustManagerFactory(KeyStore keyStore) {
        return providesTrustManagerFactory(keyStore);
    }

    @Override
    @Singleton
    @Provides
    public KeyStore getKeyStore(@ApplicationContext Context context) {
        return providesNewEmptyKeyStore(context);
    }

    @Override
    @Singleton
    @Provides
    public HostnameVerifier getHostnameVerifier() {
        return providesHostNameVerifier();
    }

    @Override
    @Singleton
    @Provides
    public OkHttpClient getOkHttpClient(SSLSocketFactory sslSocketFactory,
                                        X509TrustManager x509TrustManager,
                                        HttpLoggingInterceptor loggingInterceptor,
                                        HeadInterceptor headInterceptor,
                                        ParamsInterceptor paramsInterceptor,
                                        CacheInterceptor cacheInterceptor,
                                        ResponseInterceptor responseInterceptor,
                                        VerificationInterceptor verificationInterceptor,
                                        HostnameVerifier homeNameVerifier,
                                        Cache cache) {
        return providesOkHttpClient(sslSocketFactory, x509TrustManager, loggingInterceptor,
                headInterceptor, paramsInterceptor, cacheInterceptor, responseInterceptor,
                verificationInterceptor, homeNameVerifier, cache);
    }

    @Override
    @Singleton
    @Provides
    @Named(BuildConfig.BUILD_TYPE)
    public OkHttpClient getDebugOkHttpClient(@Named(BuildConfig.BUILD_TYPE) SSLSocketFactory sslSocketFactory,
                                             X509TrustManager x509TrustManager,
                                             HttpLoggingInterceptor loggingInterceptor,
                                             HeadInterceptor headInterceptor,
                                             ParamsInterceptor paramsInterceptor,
                                             CacheInterceptor cacheInterceptor,
                                             ResponseInterceptor responseInterceptor,
                                             VerificationInterceptor verificationInterceptor,
                                             HostnameVerifier homeNameVerifier,
                                             Cache cache) {
        return providesDebugOkHttpClient(sslSocketFactory, x509TrustManager, loggingInterceptor,
                headInterceptor, paramsInterceptor, cacheInterceptor, responseInterceptor,
                verificationInterceptor, homeNameVerifier, cache);
    }

    @Override
    @Singleton
    @Provides
    public Retrofit getRetrofit(OkHttpClient okHttpClient) {
        return providesRetrofit(okHttpClient);
    }

    @Override
    @Singleton
    @Provides
    @Named(BuildConfig.BUILD_TYPE)
    public Retrofit getDebugRetrofit(@Named(BuildConfig.BUILD_TYPE) OkHttpClient okHttpClient) {
        return providesDebugRetrofit(okHttpClient);
    }
}
