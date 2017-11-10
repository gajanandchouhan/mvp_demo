package com.mymvpdemo.activity;

import android.content.Intent;
import android.os.Bundle;

import com.mymvpdemo.presenter.SplashPersenter;
import com.mymvpdemo.view.SplashView;

public class SplashActivity extends BaseActivity implements SplashView {
    SplashPersenter mSplashPersenterl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSplashPersenterl = new SplashPersenter(this);
        mSplashPersenterl.delaySplash();
    }

    @Override
    public void navigateToNextScreen() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
