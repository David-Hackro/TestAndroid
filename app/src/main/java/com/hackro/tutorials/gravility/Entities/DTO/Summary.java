package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Summary {
  @SerializedName("label")
  @Expose
  private String label;

  /**
   * No args constructor for use in serialization
   *
   */
  public Summary() {
  }

  /**
   *
   * @param label
   */
  public Summary(String label) {
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

  public Summary withLabel(String label) {
    this.label = label;
    return this;
  }

  @Override public String toString() {
    return "Summary{" +
        "label='" + label + '\'' +
        '}';
  }
}
