package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Attributes___ {
  @SerializedName("rel")
  @Expose
  private String rel;
  @SerializedName("type")
  @Expose
  private String type;
  @SerializedName("href")
  @Expose
  private String href;

  /**
   * No args constructor for use in serialization
   *
   */
  public Attributes___() {
  }

  /**
   *
   * @param rel
   * @param type
   * @param href
   */
  public Attributes___(String rel, String type, String href) {
    this.rel = rel;
    this.type = type;
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

  public Attributes___ withRel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   *
   * @return
   * The type
   */
  public String getType() {
    return type;
  }

  /**
   *
   * @param type
   * The type
   */
  public void setType(String type) {
    this.type = type;
  }

  public Attributes___ withType(String type) {
    this.type = type;
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

  public Attributes___ withHref(String href) {
    this.href = href;
    return this;
  }
}
