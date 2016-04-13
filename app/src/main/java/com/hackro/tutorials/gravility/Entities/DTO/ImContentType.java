package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class ImContentType {
  @SerializedName("attributes")
  @Expose
  private Attributes__ attributes;

  /**
   * No args constructor for use in serialization
   *
   */
  public ImContentType() {
  }

  /**
   *
   * @param attributes
   */
  public ImContentType(Attributes__ attributes) {
    this.attributes = attributes;
  }

  /**
   *
   * @return
   * The attributes
   */
  public Attributes__ getAttributes() {
    return attributes;
  }

  /**
   *
   * @param attributes
   * The attributes
   */
  public void setAttributes(Attributes__ attributes) {
    this.attributes = attributes;
  }

  public ImContentType withAttributes(Attributes__ attributes) {
    this.attributes = attributes;
    return this;
  }
}
