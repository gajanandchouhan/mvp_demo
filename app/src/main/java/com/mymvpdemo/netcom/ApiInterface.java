package com.mymvpdemo.netcom;


import com.mymvpdemo.model.BaseResponse;
import com.mymvpdemo.model.ContactResponseModel;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by gajanandchouhan on 4/1/17.
 */

public interface ApiInterface {
  @GET("contacts/")
  Call<BaseResponse> getContact();
}
