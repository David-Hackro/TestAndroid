package com.hackro.tutorials.gravility.Utilidades;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by hackro on 18/04/16.
 */
public class Utilidades
{
    private Context context;

    public Utilidades() {
    }

    public Utilidades(Context context) {
        this.context = context;
    }

    public boolean isNetworkAvailable() {
            ConnectivityManager connectivityManager
                    = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
}
