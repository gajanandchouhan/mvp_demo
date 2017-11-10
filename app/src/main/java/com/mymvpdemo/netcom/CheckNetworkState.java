package com.mymvpdemo.netcom;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class CheckNetworkState {

    /**
     * This method is use for check the network status.
     */
    public static boolean isOnline(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
       // connected to the internet
            return activeNetwork!=null&&((activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) || (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE));



    }
}
