package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class ImPrice {
  @SerializedName("label")
  @Expose
  private String label;
  @SerializedName("attributes")
  @Expose
  private Attributes_ attributes;

  /**
   * No args constructor for use in serialization
   *
   */
  public ImPrice() {
  }

  /**
   *
   * @param label
   * @param attributes
   */
  public ImPrice(String label, Attributes_ attributes) {
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

  public ImPrice withLabel(String label) {
    this.label = label;
    return this;
  }

  /**
   *
   * @return
   * The attributes
   */
  public Attributes_ getAttributes() {
    return attributes;
  }

  /**
   *
   * @param attributes
   * The attributes
   */
  public void setAttributes(Attributes_ attributes) {
    this.attributes = attributes;
  }

  public ImPrice withAttributes(Attributes_ attributes) {
    this.attributes = attributes;
    return this;
  }

}
