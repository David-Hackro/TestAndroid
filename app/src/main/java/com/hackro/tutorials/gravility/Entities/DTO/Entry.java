package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alice on 4/2/16.
 */
public class Entry {

  @SerializedName("im:name")
  @Expose
  private ImName imName;

  @SerializedName("im:image")
  @Expose
  private List<ImImage> imImage = new ArrayList<ImImage>();

  @SerializedName("summary")
  @Expose
  private Summary summary;

  @SerializedName("im:price")
  @Expose
  private ImPrice imPrice;

  @SerializedName("im:contentType")
  @Expose
  private ImContentType imContentType;

  @SerializedName("rights")
  @Expose
  private Rights rights;

  @SerializedName("title")
  @Expose
  private Title title;

  @SerializedName("link")
  @Expose
  private Link link;

  @SerializedName("id")
  @Expose
  private Id id;

  @SerializedName("im:artist")
  @Expose
  private ImArtist imArtist;

  @SerializedName("category")
  @Expose
  private Category category;

  @SerializedName("im:releaseDate")
  @Expose
  private ImReleaseDate imReleaseDate;

  /**
   * No args constructor for use in serialization
   *
   */
  public Entry() {
  }

  /**
   *
   * @param id
   * @param summary
   * @param imContentType
   * @param category
   * @param title
   * @param imArtist
   * @param imReleaseDate
   * @param link
   * @param rights
   * @param imPrice
   * @param imImage
   * @param imName
   */
  public Entry(ImName imName, List<ImImage> imImage, Summary summary, ImPrice imPrice, ImContentType imContentType, Rights rights, Title title, Link link, Id id, ImArtist imArtist, Category category, ImReleaseDate imReleaseDate) {
    this.imName = imName;
    this.imImage = imImage;
    this.summary = summary;
    this.imPrice = imPrice;
    this.imContentType = imContentType;
    this.rights = rights;
    this.title = title;
    this.link = link;
    this.id = id;
    this.imArtist = imArtist;
    this.category = category;
    this.imReleaseDate = imReleaseDate;
  }

  /**
   *
   * @return
   * The imName
   */
  public ImName getImName() {
    return imName;
  }

  /**
   *
   * @param imName
   * The im:name
   */
  public void setImName(ImName imName) {
    this.imName = imName;
  }

  public Entry withImName(ImName imName) {
    this.imName = imName;
    return this;
  }

  /**
   *
   * @return
   * The imImage
   */
  public List<ImImage> getImImage() {
    return imImage;
  }

  /**
   *
   * @param imImage
   * The im:image
   */
  public void setImImage(List<ImImage> imImage) {
    this.imImage = imImage;
  }

  public Entry withImImage(List<ImImage> imImage) {
    this.imImage = imImage;
    return this;
  }

  /**
   *
   * @return
   * The summary
   */
  public Summary getSummary() {
    return summary;
  }

  /**
   *
   * @param summary
   * The summary
   */
  public void setSummary(Summary summary) {
    this.summary = summary;
  }

  public Entry withSummary(Summary summary) {
    this.summary = summary;
    return this;
  }

  /**
   *
   * @return
   * The imPrice
   */
  public ImPrice getImPrice() {
    return imPrice;
  }

  /**
   *
   * @param imPrice
   * The im:price
   */
  public void setImPrice(ImPrice imPrice) {
    this.imPrice = imPrice;
  }

  public Entry withImPrice(ImPrice imPrice) {
    this.imPrice = imPrice;
    return this;
  }

  /**
   *
   * @return
   * The imContentType
   */
  public ImContentType getImContentType() {
    return imContentType;
  }

  /**
   *
   * @param imContentType
   * The im:contentType
   */
  public void setImContentType(ImContentType imContentType) {
    this.imContentType = imContentType;
  }

  public Entry withImContentType(ImContentType imContentType) {
    this.imContentType = imContentType;
    return this;
  }

  /**
   *
   * @return
   * The rights
   */
  public Rights getRights() {
    return rights;
  }

  /**
   *
   * @param rights
   * The rights
   */
  public void setRights(Rights rights) {
    this.rights = rights;
  }

  public Entry withRights(Rights rights) {
    this.rights = rights;
    return this;
  }

  /**
   *
   * @return
   * The title
   */
  public Title getTitle() {
    return title;
  }

  /**
   *
   * @param title
   * The title
   */
  public void setTitle(Title title) {
    this.title = title;
  }

  public Entry withTitle(Title title) {
    this.title = title;
    return this;
  }

  /**
   *
   * @return
   * The link
   */
  public Link getLink() {
    return link;
  }

  /**
   *
   * @param link
   * The link
   */
  public void setLink(Link link) {
    this.link = link;
  }

  public Entry withLink(Link link) {
    this.link = link;
    return this;
  }

  /**
   *
   * @return
   * The id
   */
  public Id getId() {
    return id;
  }

  /**
   *
   * @param id
   * The id
   */
  public void setId(Id id) {
    this.id = id;
  }

  public Entry withId(Id id) {
    this.id = id;
    return this;
  }

  /**
   *
   * @return
   * The imArtist
   */
  public ImArtist getImArtist() {
    return imArtist;
  }

  /**
   *
   * @param imArtist
   * The im:artist
   */
  public void setImArtist(ImArtist imArtist) {
    this.imArtist = imArtist;
  }

  public Entry withImArtist(ImArtist imArtist) {
    this.imArtist = imArtist;
    return this;
  }

  /**
   *
   * @return
   * The category
   */
  public Category getCategory() {
    return category;
  }

  /**
   *
   * @param category
   * The category
   */
  public void setCategory(Category category) {
    this.category = category;
  }

  public Entry withCategory(Category category) {
    this.category = category;
    return this;
  }

  /**
   *
   * @return
   * The imReleaseDate
   */
  public ImReleaseDate getImReleaseDate() {
    return imReleaseDate;
  }

  /**
   *
   * @param imReleaseDate
   * The im:releaseDate
   */
  public void setImReleaseDate(ImReleaseDate imReleaseDate) {
    this.imReleaseDate = imReleaseDate;
  }

  public Entry withImReleaseDate(ImReleaseDate imReleaseDate) {
    this.imReleaseDate = imReleaseDate;
    return this;
  }
}
