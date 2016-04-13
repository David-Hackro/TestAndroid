package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Attributes______ {
  @SerializedName("im:id")
  @Expose
  private String imId;
  @SerializedName("term")
  @Expose
  private String term;
  @SerializedName("scheme")
  @Expose
  private String scheme;
  @SerializedName("label")
  @Expose
  private String label;

  /**
   * No args constructor for use in serialization
   *
   */
  public Attributes______() {
  }

  /**
   *
   * @param imId
   * @param scheme
   * @param term
   * @param label
   */
  public Attributes______(String imId, String term, String scheme, String label) {
    this.imId = imId;
    this.term = term;
    this.scheme = scheme;
    this.label = label;
  }

  /**
   *
   * @return
   * The imId
   */
  public String getImId() {
    return imId;
  }

  /**
   *
   * @param imId
   * The im:id
   */
  public void setImId(String imId) {
    this.imId = imId;
  }

  public Attributes______ withImId(String imId) {
    this.imId = imId;
    return this;
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

  public Attributes______ withTerm(String term) {
    this.term = term;
    return this;
  }

  /**
   *
   * @return
   * The scheme
   */
  public String getScheme() {
    return scheme;
  }

  /**
   *
   * @param scheme
   * The scheme
   */
  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  public Attributes______ withScheme(String scheme) {
    this.scheme = scheme;
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

  public Attributes______ withLabel(String label) {
    this.label = label;
    return this;
  }
}
