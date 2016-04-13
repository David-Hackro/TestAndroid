package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Link {
  @SerializedName("attributes")
  @Expose
  private Attributes___ attributes;

  /**
   * No args constructor for use in serialization
   *
   */
  public Link() {
  }

  /**
   *
   * @param attributes
   */
  public Link(Attributes___ attributes) {
    this.attributes = attributes;
  }

  /**
   *
   * @return
   * The attributes
   */
  public Attributes___ getAttributes() {
    return attributes;
  }

  /**
   *
   * @param attributes
   * The attributes
   */
  public void setAttributes(Attributes___ attributes) {
    this.attributes = attributes;
  }

  public Link withAttributes(Attributes___ attributes) {
    this.attributes = attributes;
    return this;
  }
}
