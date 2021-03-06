package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Attributes_____ {
  @SerializedName("href")
  @Expose
  private String href;

  /**
   * No args constructor for use in serialization
   *
   */
  public Attributes_____() {
  }

  /**
   *
   * @param href
   */
  public Attributes_____(String href) {
    this.href = href;
  }

  /**
   *
   * @return
   * The href
   */
  public String getHref() {
    return href;
  }

  /**
   *
   * @param href
   * The href
   */
  public void setHref(String href) {
    this.href = href;
  }

  public Attributes_____ withHref(String href) {
    this.href = href;
    return this;
  }
}
