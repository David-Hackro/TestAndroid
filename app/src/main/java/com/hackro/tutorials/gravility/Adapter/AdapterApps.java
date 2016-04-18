package com.hackro.tutorials.gravility.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
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
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.hackro.tutorials.gravility.Activities.DetailsApp;
import com.hackro.tutorials.gravility.Entities.Aplicacion;
import com.hackro.tutorials.gravility.R;

import java.io.Serializable;
import java.util.List;

/**
 * Created by david on 14/04/16.
 */
public class AdapterApps extends RecyclerView.Adapter<AdapterApps.AppsViewHolder> {


    private List<Aplicacion> appstList;
    private Context context;
    private Aplicacion ci;
    private Gson gson;
    private String myJson;
    private int lastPosition;
    private Animation animation;

    public AdapterApps() {
    }

    public AdapterApps(List<Aplicacion> appstList,Context c) {

        this.appstList = appstList;
        this.context = c;
        gson = new Gson();
        lastPosition = appstList.size()-1;
        animation = AnimationUtils.loadAnimation(context, R.anim.recycler_effect);
        animation.setDuration(600);

    }


    @Override
    public AppsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_app, viewGroup, false);
        return new AppsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final AppsViewHolder holder, int i) {

        ci = appstList.get(i);
        holder.txtTitle.setText(ci.getTitle());
        holder.txtPrice.setText(ci.getImReleaseDateLabel());
        //Glide.with(context).load(url).into(holder.iconApp);


        final Aplicacion app = appstList.get(i);

        Glide.with(holder.iconApp.getContext())
                .load(ci.getImageLabel())
                .into(holder.iconApp);

        holder.contentCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("app  ", app.getTitle());
                Intent intent = new Intent(context, DetailsApp.class);

                intent.putExtra("Title",app.getTitle());
                intent.putExtra("ImageLabel",app.getImageLabel());
                intent.putExtra("Category",app.getCategory());
                intent.putExtra("SummaryLabel",app.getSummaryLabel());
                intent.putExtra("ImReleaseDateLabel",app.getImReleaseDateLabel());
                intent.putExtra("LinkHref",app.getLinkHref());
                intent.putExtra("RightsLabel",app.getRightsLabel());


                context.startActivity(intent);
            }
        });



        setAnimation(holder.card_view_app, i);


    }

    public static class AppsViewHolder extends RecyclerView.ViewHolder {

        protected TextView txtTitle;
        protected TextView txtPrice;
        protected ImageView iconApp;
        protected CardView card_view_app;
        protected RelativeLayout contentCard;
        public AppsViewHolder(View v) {
            super(v);
            txtTitle = (TextView) v.findViewById(R.id.TitleCardView);
            txtPrice = (TextView) v.findViewById(R.id.PriceAmountCardView);
            iconApp = (ImageView) v.findViewById(R.id.IconApp);
            card_view_app = (CardView) v.findViewById(R.id.card_view_app);
            contentCard = (RelativeLayout)v.findViewById(R.id.CardApp);
        }
    }



    /**
     * Here is the key method to apply the animation
     */
    private void setAnimation(View viewToAnimate, int position)
    {
            Animation animation = AnimationUtils.loadAnimation(context, R.anim.recycler_effect);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
    }


    @Override
    public int getItemCount() {
        return appstList.size();
    }
}

