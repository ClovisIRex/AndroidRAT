package dev.tal.androidrat.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by tal on 9/12/17.
 */

public class NetworkUtils {

    public static Boolean checkNetworkConnection(Context context) {

        Boolean isConnected;

        ConnectivityManager conMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

        isConnected = (netInfo != null) ? true : false;

        return isConnected;
    }
}
