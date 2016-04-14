package com.hackro.tutorials.gravility.Activities;

import android.app.ProgressDialog;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.hackro.tutorials.gravility.R;
import com.hackro.tutorials.gravility.Services.Services;

import io.realm.RealmConfiguration;

public class Splash extends AppCompatActivity {

    private ProgressDialog progress;
    private Services service;
    private RealmConfiguration realmConfiguration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        getSupportActionBar().hide();

        service = new Services(Splash.this);

        progress = ProgressDialog.show(this, null, null, true);
        progress.setContentView(R.layout.elemento_progress_dialog);
        progress.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        new MyAsyncClass().execute();

    }

    private class MyAsyncClass extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progress.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            realmConfiguration = new RealmConfiguration.Builder(Splash.this).build();

            service.setRealmConfiguration(realmConfiguration);
            service.getAllData();
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);

            progress.dismiss();
        }
    }


}
