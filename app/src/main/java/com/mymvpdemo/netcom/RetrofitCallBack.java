package com.mymvpdemo.netcom;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by gajanandchouhan on 11/5/17.
 */

public class RetrofitCallBack<T> implements Callback<T> {
    private final ResponeListner responseListner;
    private final byte reqType;

    public RetrofitCallBack(ResponeListner responeListner, byte reqType) {
        this.responseListner = responeListner;
        this.reqType = reqType;
    }

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        responseListner.onResponseSuccess(response.body(), reqType);
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        responseListner.onError("Some thing worng");
    }
}
