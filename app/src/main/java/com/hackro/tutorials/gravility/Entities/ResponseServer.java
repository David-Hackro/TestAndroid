package com.hackro.tutorials.gravility.Entities;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hackro.tutorials.gravility.Entities.DTO.Feed;

/**
 * Created by david on 13/04/16.
 */
public class ResponseServer {

    @SerializedName("feed")
    @Expose
    private Feed feed;

    public ResponseServer() {
    }

    public ResponseServer(Feed feed) {
        this.feed = feed;
    }

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

}
