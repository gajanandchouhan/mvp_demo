package com.mymvpdemo;

import android.app.Application;

import com.mymvpdemo.netcom.ApiClient;
import com.mymvpdemo.netcom.ApiInterface;

/**
 * Created by gajanandchouhan on 22/4/17.
 */

public class MyMvpDemo extends Application {
    private static ApiInterface apiInterface;
    @Override
    public void onCreate() {
        super.onCreate();
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
    }


    public static ApiInterface getApiInterface() {
        return apiInterface;
    }
}
