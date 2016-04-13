package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Category {
  @SerializedName("attributes")
  @Expose
  private Attributes______ attributes;

  /**
   * No args constructor for use in serialization
   *
   */
  public Category() {
  }

  /**
   *
   * @param attributes
   */
  public Category(Attributes______ attributes) {
    this.attributes = attributes;
  }

  /**
   *
   * @return
   * The attributes
   */
  public Attributes______ getAttributes() {
    return attributes;
  }

  /**
   *
   * @param attributes
   * The attributes
   */
  public void setAttributes(Attributes______ attributes) {
    this.attributes = attributes;
  }

  public Category withAttributes(Attributes______ attributes) {
    this.attributes = attributes;
    return this;
  }
}
