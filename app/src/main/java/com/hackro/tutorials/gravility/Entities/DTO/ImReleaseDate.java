package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class ImReleaseDate {
  @SerializedName("label")
  @Expose
  private String label;
  @SerializedName("attributes")
  @Expose
  private Attributes_______ attributes;

  /**
   * No args constructor for use in serialization
   *
   */
  public ImReleaseDate() {
  }

  /**
   *
   * @param label
   * @param attributes
   */
  public ImReleaseDate(String label, Attributes_______ attributes) {
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

  public ImReleaseDate withLabel(String label) {
    this.label = label;
    return this;
  }

  /**
   *
   * @return
   * The attributes
   */
  public Attributes_______ getAttributes() {
    return attributes;
  }

  /**
   *
   * @param attributes
   * The attributes
   */
  public void setAttributes(Attributes_______ attributes) {
    this.attributes = attributes;
  }

  public ImReleaseDate withAttributes(Attributes_______ attributes) {
    this.attributes = attributes;
    return this;
  }

}
