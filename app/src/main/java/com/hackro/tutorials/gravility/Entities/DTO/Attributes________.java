package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Attributes________ {
  @SerializedName("rel")
  @Expose
  private String rel;
  @SerializedName("href")
  @Expose
  private String href;

  /**
   * No args constructor for use in serialization
   *
   */
  public Attributes________() {
  }

  /**
   *
   * @param rel
   * @param href
   */
  public Attributes________(String rel, String href) {
    this.rel = rel;
    this.href = href;
  }

  /**
   *
   * @return
   * The rel
   */
  public String getRel() {
    return rel;
  }

  /**
   *
   * @param rel
   * The rel
   */
  public void setRel(String rel) {
    this.rel = rel;
  }

  public Attributes________ withRel(String rel) {
    this.rel = rel;
    return this;
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

  public Attributes________ withHref(String href) {
    this.href = href;
    return this;
  }
}
