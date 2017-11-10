package com.mymvpdemo.presenter;

import android.os.Handler;

import com.mymvpdemo.view.SplashView;

/**
 * Created by gajanandchouhan on 22/4/17.
 */

public class SplashPersenter {
    int SPLASH_TIMEOUT = 3000;

    private SplashView mSplashView;

    public SplashPersenter(SplashView splashView) {
        this.mSplashView = splashView;
    }


    public void delaySplash() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mSplashView.navigateToNextScreen();
            }
        }, SPLASH_TIMEOUT);
    }
}
