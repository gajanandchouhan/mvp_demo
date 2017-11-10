package com.mymvpdemo.netcom;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**999
 * Created by gajanandchouhan on 4/1/17.
 */

public class ApiClient {

    //private static final String BASE_URL = "http://m2.cdnsolutionsgroup.com/vellopay_ws/Service/";
   private static final String BASE_URL = "http://api.androidhive.info/";
   /*private static final String BASE_URL = "https://m2.cdnsolutionsgroup.com/vellopay_st/Webservice/Service/";*/
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {

        if (retrofit == null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}
