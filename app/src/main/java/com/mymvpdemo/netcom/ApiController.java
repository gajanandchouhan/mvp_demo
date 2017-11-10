package com.mymvpdemo.netcom;

import android.content.Context;

import com.mymvpdemo.MyMvpDemo;
import com.mymvpdemo.model.BaseResponse;
import com.mymvpdemo.model.ContactResponseModel;

import retrofit2.Call;

/**
 * Created by gajanandchouhan on 11/5/17.
 */

public class ApiController {
    private ApiInterface apiInterface;
    private Context mContext;
    private byte reqType;
    ResponeListner responeListner;

    public ApiController(Context mContext, byte reqType,ResponeListner responeListner) {
        this.mContext = mContext;
        this.reqType = reqType;
        this.responeListner=responeListner;
        apiInterface = MyMvpDemo.getApiInterface();
        getResponse();
    }

    private void getResponse() {
        Call<BaseResponse> contact = apiInterface.getContact();
        contact.enqueue(new RetrofitCallBack<BaseResponse>(responeListner,reqType));
    }
}
