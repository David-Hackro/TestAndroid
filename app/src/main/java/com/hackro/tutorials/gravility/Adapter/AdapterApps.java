package com.hackro.tutorials.gravility.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hackro.tutorials.gravility.Activities.DetailsApp;
import com.hackro.tutorials.gravility.Entities.Aplicacion;
import com.hackro.tutorials.gravility.R;

import java.util.List;

/**
 * Created by david on 14/04/16.
 */
public class AdapterApps extends RecyclerView.Adapter<AdapterApps.AppsViewHolder> {


    private List<Aplicacion> appstList;
    private Context context;

    public AdapterApps() {
    }

    public AdapterApps(List<Aplicacion> appstList,Context c) {

        this.appstList = appstList;
        this.context = c;
    }


    @Override
    public AppsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_app, viewGroup, false);
        return new AppsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final AppsViewHolder holder, int i) {

        Aplicacion ci = appstList.get(i);

        holder.txtTitle.setText(ci.getTitle());
        holder.txtPrice.setText(ci.getPriceAmount());

        //holder.iconApp.set(ci.getTwitter());

        final Aplicacion app = appstList.get(i);


        holder.card_view_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("app  ", app.getTitle());
                context.startActivity(new Intent(context, DetailsApp.class));
            }
        });

    }

    public static class AppsViewHolder extends RecyclerView.ViewHolder {

        protected TextView txtTitle;
        protected TextView txtPrice;
        protected ImageView iconApp;
        protected CardView card_view_app;

        public AppsViewHolder(View v) {
            super(v);
            txtTitle = (TextView) v.findViewById(R.id.TitleCardView);
            txtPrice = (TextView) v.findViewById(R.id.PriceAmountCardView);
            iconApp = (ImageView) v.findViewById(R.id.imageView);
            card_view_app = (CardView) v.findViewById(R.id.card_view_app);
        }
    }

    @Override
    public int getItemCount() {
        return appstList.size();
    }
}
