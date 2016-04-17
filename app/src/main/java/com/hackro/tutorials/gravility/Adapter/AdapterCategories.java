package com.hackro.tutorials.gravility.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.hackro.tutorials.gravility.Activities.DetailsApp;
import com.hackro.tutorials.gravility.Entities.Aplicacion;
import com.hackro.tutorials.gravility.Entities.Categoria;
import com.hackro.tutorials.gravility.R;

import java.util.List;
import java.util.Random;

/**
 * Created by david on 14/04/16.
 */
public class AdapterCategories extends RecyclerView.Adapter<AdapterCategories.AppsViewHolder> {


    private List<Categoria> categoriestList;
    private Context context;
    private Categoria ci;
    private Animation animation;
    private Random rnd;
    private int color;


    public AdapterCategories() {
    }

    public AdapterCategories(List<Categoria> categoriestList, Context c) {

        this.categoriestList = categoriestList;
        this.context = c;
        animation = AnimationUtils.loadAnimation(context, R.anim.recycler_effect);
        animation.setDuration(600);
        rnd = new Random();


    }


    @Override
    public AppsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_category, viewGroup, false);

        return new AppsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final AppsViewHolder holder, int i) {

        ci = categoriestList.get(i);
        color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

        holder.txtTitle.setText(ci.getLabel());
        holder.contentCard.setBackgroundColor(color);
        final Categoria app = categoriestList.get(i);


        holder.contentCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetailsApp.class);

                intent.putExtra("idCategory",app.getImId());

                context.startActivity(intent);
            }
        });


    }

    public static class AppsViewHolder extends RecyclerView.ViewHolder {

        protected TextView txtTitle;
        protected CardView card_view_app;
        protected RelativeLayout contentCard;

        public AppsViewHolder(View v) {
            super(v);
            txtTitle = (TextView) v.findViewById(R.id.TitleCardView);
            card_view_app = (CardView) v.findViewById(R.id.card_view_app);
            contentCard = (RelativeLayout)v.findViewById(R.id.CardCategory);
        }
    }


    @Override
    public int getItemCount() {
        return categoriestList.size();
    }
}

