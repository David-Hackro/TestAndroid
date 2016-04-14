package com.hackro.tutorials.gravility.Activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.google.gson.Gson;
import com.hackro.tutorials.gravility.Entities.Aplicacion;
import com.hackro.tutorials.gravility.R;

public class DetailsApp extends AppCompatActivity {

        String ImageLabel,PriceAmount,SummaryLabel,ImReleaseDateLabel,LinkHref,RightsLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_app);
        final ImageView imageView = (ImageView) findViewById(R.id.IconApp);

        ImageLabel = getIntent().getStringExtra("ImageLabel");
        PriceAmount =getIntent().getStringExtra("PriceAmount");
        SummaryLabel = getIntent().getStringExtra("SummaryLabel");
        ImReleaseDateLabel = getIntent().getStringExtra("ImReleaseDateLabel");
        LinkHref = getIntent().getStringExtra("LinkHref");
        RightsLabel = getIntent().getStringExtra("RightsLabel");



        Glide.with(DetailsApp.this).load(getIntent().getStringExtra("ImageLabel")).asBitmap().fitCenter().into(new BitmapImageViewTarget(imageView) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable circularBitmapDrawable =
                        RoundedBitmapDrawableFactory.create(DetailsApp.this.getResources(), resource);
                circularBitmapDrawable.setCircular(true);
                imageView.setImageDrawable(circularBitmapDrawable);
            }
        });






    }


    public void download(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(LinkHref));
        startActivity(browserIntent);


    }



}
