package com.hackro.tutorials.gravility.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.hackro.tutorials.gravility.Entities.Aplicacion;
import com.hackro.tutorials.gravility.R;

public class DetailsApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_app);
        Gson gson = new Gson();
        Aplicacion ob = gson.fromJson(getIntent().getStringExtra("app"), Aplicacion.class);
        Log.e("app: ",ob.getTitle());


    }
}
