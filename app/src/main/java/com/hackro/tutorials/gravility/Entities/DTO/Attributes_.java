package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alice on 4/2/16.
 */
public class Attributes_ {
  @SerializedName("amount")
  @Expose
  private String amount;
  @SerializedName("currency")
  @Expose
  private String currency;

  /**
   * No args constructor for use in serialization
   *
   */
  public Attributes_() {
  }

  /**
   *
   * @param amount
   * @param currency
   */
  public Attributes_(String amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  /**
   *
   * @return
   * The amount
   */
  public String getAmount() {
    return amount;
  }

  /**
   *
   * @param amount
   * The amount
   */
  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Attributes_ withAmount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   *
   * @return
   * The currency
   */
  public String getCurrency() {
    return currency;
  }

  /**
   *
   * @param currency
   * The currency
   */
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Attributes_ withCurrency(String currency) {
    this.currency = currency;
    return this;
  }
}
