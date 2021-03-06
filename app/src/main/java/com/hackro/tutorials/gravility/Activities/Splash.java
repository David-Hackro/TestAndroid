package com.hackro.tutorials.gravility.Activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hackro.tutorials.gravility.Entities.Categoria;
import com.hackro.tutorials.gravility.R;
import com.hackro.tutorials.gravility.Services.Services;
import com.hackro.tutorials.gravility.Utilidades.Utilidades;

import io.realm.RealmConfiguration;

public class Splash extends AppCompatActivity {

    private ProgressDialog progress;
    private Services service;
    private RealmConfiguration realmConfiguration;
    private Utilidades utilidades;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        utilidades = new Utilidades(Splash.this);

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }


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

            service = new Services(realmConfiguration);
            if (utilidades.isNetworkAvailable()) {
                if (service.getAllData()) {
                    runOnUiThread(new Runnable() {
                        public void run() {
                            Toast.makeText(Splash.this, getResources().getString(R.string.Online), Toast.LENGTH_SHORT).show();
                        }
                    });

                } else {
                    runOnUiThread(new Runnable() {
                        public void run() {
                            Toast.makeText(Splash.this, getResources().getString(R.string.Offline), Toast.LENGTH_SHORT).show();
                        }
                    });
                }

            } else {
                runOnUiThread(new Runnable() {
                    public void run() {
                        Toast.makeText(Splash.this, getResources().getString(R.string.Offline), Toast.LENGTH_SHORT).show();
                    }
                });

            }
            return null;

        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);

            progress.dismiss();

            startActivity(new Intent(Splash.this, Categories.class));
            finish();

        }
    }

    public RealmConfiguration getRealmConfiguration() {
        return realmConfiguration;
    }

    public void setRealmConfiguration(RealmConfiguration realmConfiguration) {
        this.realmConfiguration = realmConfiguration;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}
