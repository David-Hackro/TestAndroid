package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Author {
  @SerializedName("name")
  @Expose
  private Name name;
  @SerializedName("uri")
  @Expose
  private Uri uri;

  /**
   * No args constructor for use in serialization
   *
   */
  public Author() {
  }

  /**
   *
   * @param name
   * @param uri
   */
  public Author(Name name, Uri uri) {
    this.name = name;
    this.uri = uri;
  }

  /**
   *
   * @return
   * The name
   */
  public Name getName() {
    return name;
  }

  /**
   *
   * @param name
   * The name
   */
  public void setName(Name name) {
    this.name = name;
  }

  public Author withName(Name name) {
    this.name = name;
    return this;
  }

  /**
   *
   * @return
   * The uri
   */
  public Uri getUri() {
    return uri;
  }

  /**
   *
   * @param uri
   * The uri
   */
  public void setUri(Uri uri) {
    this.uri = uri;
  }

  public Author withUri(Uri uri) {
    this.uri = uri;
    return this;
  }

}
