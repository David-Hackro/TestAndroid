package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Attributes__ {
  @SerializedName("term")
  @Expose
  private String term;
  @SerializedName("label")
  @Expose
  private String label;

  /**
   * No args constructor for use in serialization
   *
   */
  public Attributes__() {
  }

  /**
   *
   * @param term
   * @param label
   */
  public Attributes__(String term, String label) {
    this.term = term;
    this.label = label;
  }

  /**
   *
   * @return
   * The term
   */
  public String getTerm() {
    return term;
  }

  /**
   *
   * @param term
   * The term
   */
  public void setTerm(String term) {
    this.term = term;
  }

  public Attributes__ withTerm(String term) {
    this.term = term;
    return this;
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

  public Attributes__ withLabel(String label) {
    this.label = label;
    return this;
  }

}
