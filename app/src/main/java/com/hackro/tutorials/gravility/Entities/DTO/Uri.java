package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Uri {

  @SerializedName("label") @Expose private String label;

  /**
   * No args constructor for use in serialization
   */
  public Uri() {
  }

  /**
   *
   * @param label
   */
  public Uri(String label) {
    this.label = label;
  }

  /**
   * @return The label
   */
  public String getLabel() {
    return label;
  }

  /**
   * @param label The label
   */
  public void setLabel(String label) {
    this.label = label;
  }

  public Uri withLabel(String label) {
    this.label = label;
    return this;
  }
}
