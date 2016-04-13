package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Id {
  @SerializedName("label")
  @Expose
  private String label;
  @SerializedName("attributes")
  @Expose
  private Attributes____ attributes;

  /**
   * No args constructor for use in serialization
   *
   */
  public Id() {
  }

  /**
   *
   * @param label
   * @param attributes
   */
  public Id(String label, Attributes____ attributes) {
    this.label = label;
    this.attributes = attributes;
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

  public Id withLabel(String label) {
    this.label = label;
    return this;
  }

  /**
   *
   * @return
   * The attributes
   */
  public Attributes____ getAttributes() {
    return attributes;
  }

  /**
   *
   * @param attributes
   * The attributes
   */
  public void setAttributes(Attributes____ attributes) {
    this.attributes = attributes;
  }

  public Id withAttributes(Attributes____ attributes) {
    this.attributes = attributes;
    return this;
  }
}
