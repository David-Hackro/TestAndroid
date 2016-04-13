package com.hackro.tutorials.gravility.Services;

import android.util.Log;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hackro.tutorials.gravility.Entities.DTO.Entry;
import com.hackro.tutorials.gravility.Entities.ResponseServer;
import com.hackro.tutorials.gravility.Interfaces.IRepoData;
import com.hackro.tutorials.gravility.Interfaces.IService;

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
    private RealmConfiguration realmConfiguration;

    public Services() {
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
        //repositoryPhotos.readPostAll();

    }


    @Override
    public boolean getAllData() {
        try {
            Call<ResponseServer> call = services.getAlldata();
            Response<ResponseServer> tasks = call.execute();


            for (Entry temp:tasks.body().getFeed().getEntry()) {
                Log.e("Apps: ",temp.getCategory().getAttributes().getLabel());
            }
            return true;
        } catch (IOException e) {
            return false;
        } catch (java.io.IOException e) {
            return false;
        }
    }


    public void setRealmConfiguration(RealmConfiguration realmConfiguration) {

        this.realmConfiguration = realmConfiguration;
    }
}
