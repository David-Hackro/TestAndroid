package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Attributes_______ {
  @SerializedName("label")
  @Expose
  private String label;

  /**
   * No args constructor for use in serialization
   *
   */
  public Attributes_______() {
  }

  /**
   *
   * @param label
   */
  public Attributes_______(String label) {
    this.label = label;
  }

  /**
   *
   * @return
   * The label
   */
  public String getLabel() {
    return label;
  }

  /**
   *
   * @param label
   * The label
   */
  public void setLabel(String label) {
    this.label = label;
  }

  public Attributes_______ withLabel(String label) {
    this.label = label;
    return this;
  }

}
