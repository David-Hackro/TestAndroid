package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alice on 4/2/16.
 */
public class Feed {
  @SerializedName("author")
  @Expose
  private Author author;

  @SerializedName("entry")
  @Expose
  private List<Entry> entry = new ArrayList<Entry>();

  @SerializedName("updated")
  @Expose
  private Updated updated;

  @SerializedName("rights")
  @Expose
  private Rights_ rights;

  @SerializedName("title")
  @Expose
  private Title_ title;

  @SerializedName("icon")
  @Expose
  private Icon icon;

  @SerializedName("link")
  @Expose
  private List<Link_> link = new ArrayList<Link_>();
  @SerializedName("id")
  @Expose
  private Id_ id;

  /**
   * No args constructor for use in serialization
   *
   */
  public Feed() {
  }

  /**
   *
   * @param id
   * @param icon
   * @param author
   * @param title
   * @param updated
   * @param link
   * @param entry
   * @param rights
   */
  public Feed(Author author, List<Entry> entry, Updated updated, Rights_ rights, Title_ title, Icon icon, List<Link_> link, Id_ id) {
    this.author = author;
    this.entry = entry;
    this.updated = updated;
    this.rights = rights;
    this.title = title;
    this.icon = icon;
    this.link = link;
    this.id = id;
  }

  /**
   *
   * @return
   * The author
   */
  public Author getAuthor() {
    return author;
  }

  /**
   *
   * @param author
   * The author
   */
  public void setAuthor(Author author) {
    this.author = author;
  }

  public Feed withAuthor(Author author) {
    this.author = author;
    return this;
  }

  /**
   *
   * @return
   * The entry
   */
  public List<Entry> getEntry() {
    return entry;
  }

  /**
   *
   * @param entry
   * The entry
   */
  public void setEntry(List<Entry> entry) {
    this.entry = entry;
  }

  public Feed withEntry(List<Entry> entry) {
    this.entry = entry;
    return this;
  }

  /**
   *
   * @return
   * The updated
   */
  public Updated getUpdated() {
    return updated;
  }

  /**
   *
   * @param updated
   * The updated
   */
  public void setUpdated(Updated updated) {
    this.updated = updated;
  }

  public Feed withUpdated(Updated updated) {
    this.updated = updated;
    return this;
  }

  /**
   *
   * @return
   * The rights
   */
  public Rights_ getRights() {
    return rights;
  }

  /**
   *
   * @param rights
   * The rights
   */
  public void setRights(Rights_ rights) {
    this.rights = rights;
  }

  public Feed withRights(Rights_ rights) {
    this.rights = rights;
    return this;
  }

  /**
   *
   * @return
   * The title
   */
  public Title_ getTitle() {
    return title;
  }

  /**
   *
   * @param title
   * The title
   */
  public void setTitle(Title_ title) {
    this.title = title;
  }

  public Feed withTitle(Title_ title) {
    this.title = title;
    return this;
  }

  /**
   *
   * @return
   * The icon
   */
  public Icon getIcon() {
    return icon;
  }

  /**
   *
   * @param icon
   * The icon
   */
  public void setIcon(Icon icon) {
    this.icon = icon;
  }

  public Feed withIcon(Icon icon) {
    this.icon = icon;
    return this;
  }

  /**
   *
   * @return
   * The link
   */
  public List<Link_> getLink() {
    return link;
  }

  /**
   *
   * @param link
   * The link
   */
  public void setLink(List<Link_> link) {
    this.link = link;
  }

  public Feed withLink(List<Link_> link) {
    this.link = link;
    return this;
  }

  /**
   *
   * @return
   * The id
   */
  public Id_ getId() {
    return id;
  }

  /**
   *
   * @param id
   * The id
   */
  public void setId(Id_ id) {
    this.id = id;
  }

  public Feed withId(Id_ id) {
    this.id = id;
    return this;
  }

}
