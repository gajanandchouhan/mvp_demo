package com.mymvpdemo.netcom;

/**
 * Created by gajanandchouhan on 11/5/17.
 */
public interface ResponeListner {

    void onResponseSuccess(Object response, byte reqType);

    void onError(String message);
}
