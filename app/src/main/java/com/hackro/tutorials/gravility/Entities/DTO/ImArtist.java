package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class ImArtist {
  @SerializedName("label")
  @Expose
  private String label;
  @SerializedName("attributes")
  @Expose
  private Attributes_____ attributes;

  /**
   * No args constructor for use in serialization
   *
   */
  public ImArtist() {
  }

  /**
   *
   * @param label
   * @param attributes
   */
  public ImArtist(String label, Attributes_____ attributes) {
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

  public ImArtist withLabel(String label) {
    this.label = label;
    return this;
  }

  /**
   *
   * @return
   * The attributes
   */
  public Attributes_____ getAttributes() {
    return attributes;
  }

  /**
   *
   * @param attributes
   * The attributes
   */
  public void setAttributes(Attributes_____ attributes) {
    this.attributes = attributes;
  }

  public ImArtist withAttributes(Attributes_____ attributes) {
    this.attributes = attributes;
    return this;
  }

}
