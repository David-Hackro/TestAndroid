package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Attributes____ {
  @SerializedName("im:id")
  @Expose
  private String imId;
  @SerializedName("im:bundleId")
  @Expose
  private String imBundleId;

  /**
   * No args constructor for use in serialization
   *
   */
  public Attributes____() {
  }

  /**
   *
   * @param imId
   * @param imBundleId
   */
  public Attributes____(String imId, String imBundleId) {
    this.imId = imId;
    this.imBundleId = imBundleId;
  }

  /**
   *
   * @return
   * The imId
   */
  public String getImId() {
    return imId;
  }

  /**
   *
   * @param imId
   * The im:id
   */
  public void setImId(String imId) {
    this.imId = imId;
  }

  public Attributes____ withImId(String imId) {
    this.imId = imId;
    return this;
  }

  /**
   *
   * @return
   * The imBundleId
   */
  public String getImBundleId() {
    return imBundleId;
  }

  /**
   *
   * @param imBundleId
   * The im:bundleId
   */
  public void setImBundleId(String imBundleId) {
    this.imBundleId = imBundleId;
  }

  public Attributes____ withImBundleId(String imBundleId) {
    this.imBundleId = imBundleId;
    return this;
  }
}
