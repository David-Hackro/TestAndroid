package com.hackro.tutorials.gravility.Activities;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.hackro.tutorials.gravility.Entities.ResponseServer;
import com.hackro.tutorials.gravility.Interfaces.IRepoData;
import com.hackro.tutorials.gravility.R;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Splash extends AppCompatActivity {

    private ProgressBar ProgressSplash;
    private TextView MensajeSplash;
    protected IRepoData services;
    protected Retrofit retrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        getSupportActionBar().hide();
        ProgressSplash = (ProgressBar) findViewById(R.id.ProgressSplash);
        MensajeSplash = (TextView) findViewById(R.id.MensajeSplash);
        MensajeSplash.setVisibility(View.VISIBLE);
        retrofit = new Retrofit.Builder()
                .baseUrl("https://itunes.apple.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        services = retrofit.create(IRepoData.class);


        Call<ResponseServer> call = services.getAlldata();
        try {
            Response<ResponseServer> tasks = call.execute();
            Log.e("ddd",tasks.body().getFeed().getEntry().getCategory().getAttributes().getLabel());

            Log.e("-----------",tasks.body().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
