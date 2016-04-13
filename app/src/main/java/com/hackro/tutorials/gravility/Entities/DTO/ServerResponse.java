package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class ServerResponse {
  @SerializedName("feed")
  @Expose
  private Feed feed;

  /**
   * No args constructor for use in serialization
   *
   */
  public ServerResponse() {
  }

  /**
   *
   * @param feed
   */
  public ServerResponse(Feed feed) {
    this.feed = feed;
  }

  /**
   *
   * @return
   * The feed
   */
  public Feed getFeed() {
    return feed;
  }

  /**
   *
   * @param feed
   * The feed
   */
  public void setFeed(Feed feed) {
    this.feed = feed;
  }

  public ServerResponse withFeed(Feed feed) {
    this.feed = feed;
    return this;
  }


}
