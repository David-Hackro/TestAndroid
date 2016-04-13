package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class ImImage {
  @SerializedName("label")
  @Expose
  private String label;
  @SerializedName("attributes")
  @Expose
  private Attributes attributes;

  /**
   * No args constructor for use in serialization
   *
   */
  public ImImage() {
  }

  /**
   *
   * @param label
   * @param attributes
   */
  public ImImage(String label, Attributes attributes) {
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

  public ImImage withLabel(String label) {
    this.label = label;
    return this;
  }

  /**
   *
   * @return
   * The attributes
   */
  public Attributes getAttributes() {
    return attributes;
  }

  /**
   *
   * @param attributes
   * The attributes
   */
  public void setAttributes(Attributes attributes) {
    this.attributes = attributes;
  }

  public ImImage withAttributes(Attributes attributes) {
    this.attributes = attributes;
    return this;
  }

}
