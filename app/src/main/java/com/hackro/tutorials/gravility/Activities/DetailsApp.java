package com.hackro.tutorials.gravility.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.hackro.tutorials.gravility.Entities.Aplicacion;
import com.hackro.tutorials.gravility.R;

public class DetailsApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_app);
        ImageView imageView = (ImageView) findViewById(R.id.IconApp);

        Glide.with(DetailsApp.this)
                .load(getIntent().getStringExtra("title"))
                .into(imageView);




    }
}
