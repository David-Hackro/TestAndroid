package com.hackro.tutorials.gravility.Services;

import android.content.Context;
import android.util.Log;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hackro.tutorials.gravility.DataBase.MethodsDataBase;
import com.hackro.tutorials.gravility.Entities.Aplicacion;
import com.hackro.tutorials.gravility.Entities.Categoria;
import com.hackro.tutorials.gravility.Entities.DTO.Entry;
import com.hackro.tutorials.gravility.Entities.ResponseServer;
import com.hackro.tutorials.gravility.Interfaces.IRepoData;
import com.hackro.tutorials.gravility.Interfaces.IService;

import java.util.ArrayList;
import java.util.List;

import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.internal.IOException;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by david on 13/04/16.
 */
public class Services implements IService {

    private Retrofit retrofit;
    private IRepoData services;
    private MethodsDataBase methodsDataBase;

    public Services(RealmConfiguration realmConfig) {

        methodsDataBase = new MethodsDataBase(realmConfig);
        Gson gson = new GsonBuilder()
                .setExclusionStrategies(new ExclusionStrategy() {
                    @Override
                    public boolean shouldSkipField(FieldAttributes f) {
                        return f.getDeclaringClass().equals(RealmObject.class);
                    }

                    @Override
                    public boolean shouldSkipClass(Class<?> clazz) {
                        return false;
                    }
                })
                .create();


        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://itunes.apple.com/")//
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        services = retrofit.create(IRepoData.class);

    }


    @Override
    public boolean getAllData() {
        try {
            Call<ResponseServer> call = services.getAlldata();
            Response<ResponseServer> tasks = call.execute();

            List<Aplicacion> apps = new ArrayList<Aplicacion>();
            List<Categoria> categorias = new ArrayList<Categoria>();

            Aplicacion app;
            Categoria categoria;
            for (Entry entry : tasks.body().getFeed().getEntry()) {

                app = new Aplicacion();
                categoria  = new Categoria();

                app.setIdLabel(entry.getId().getLabel().toString());
                app.setImId(entry.getId().getAttributes().getImId());
                Log.e("XDXDXDXD  ",entry.getId().getAttributes().getImId());
                app.setImBundleId(entry.getId().getAttributes().getImBundleId());
                app.setImageLabel(entry.getImImage().get(0).getLabel());
                app.setTitle(entry.getTitle().getLabel());
                app.setLinkHref(entry.getLink().getAttributes().getHref());
                app.setLinkRel(entry.getLink().getAttributes().getRel());
                app.setLinkType(entry.getLink().getAttributes().getType());
                app.setPriceAmount(entry.getImPrice().getAttributes().getAmount());
                app.setPriceCurrency(entry.getImPrice().getAttributes().getCurrency());
                app.setArtistHref(entry.getImArtist().getAttributes().getHref());
                app.setImReleaseDateLabel(entry.getImReleaseDate().getAttributes().getLabel());
                app.setRightsLabel(entry.getRights().getLabel());
                app.setSummaryLabel(entry.getSummary().getLabel());
                categoria.setImId(entry.getCategory().getAttributes().getImId());
                categoria.setLabel(entry.getCategory().getAttributes().getLabel());
                categoria.setScheme( entry.getCategory().getAttributes().getScheme());
                categoria.setTerm(entry.getCategory().getAttributes().getTerm());
                apps.add(app);
                categorias.add(categoria);
              //  Log.e(entry.getCategory().getAttributes().getImId() +" | ",entry.getCategory().getAttributes().getLabel());

            }

            for (Aplicacion a:apps )
            methodsDataBase.InsertAplication(a);

            for (Categoria c:categorias)
            methodsDataBase.InsertCategory(c);


            return true;
        } catch (IOException e) {
            return false;
        } catch (java.io.IOException e) {
            return false;
        }
    }


}
