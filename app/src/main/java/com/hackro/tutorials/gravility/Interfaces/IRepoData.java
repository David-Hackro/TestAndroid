package com.hackro.tutorials.gravility.Interfaces;

import com.hackro.tutorials.gravility.Entities.ResponseServer;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by david on 13/04/16.
 */
public interface IRepoData {

    //@FormUrlEncoded
    @POST("us/rss/topfreeapplications/limit=20/json")
    Call<ResponseServer> getAlldata();

}
