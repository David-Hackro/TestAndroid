package com.hackro.tutorials.gravility.Entities;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by david on 13/04/16.
 */
public class Aplicacion extends RealmObject {

    @PrimaryKey
    private String IdLabel;

    private String ImId;
    private String ImBundleId;

    private String ImageLabel;

    private String Title;
    private String LinkHref;
    private String LinkRel;
    private String LinkType;

    private String PriceAmount;
    private String PriceCurrency;
    private String ArtistHref;
    private String ImReleaseDateLabel;
    private String RightsLabel;
    private String SummaryLabel;
    private String IdCategory;
    private String category;

    public Aplicacion() {
    }

    public String getIdLabel() {
        return IdLabel;
    }

    public void setIdLabel(String idLabel) {
        IdLabel = idLabel;
    }

    public String getImId() {
        return ImId;
    }

    public void setImId(String imId) {
        ImId = imId;
    }

    public String getImBundleId() {
        return ImBundleId;
    }

    public void setImBundleId(String imBundleId) {
        ImBundleId = imBundleId;
    }

    public String getImageLabel() {
        return ImageLabel;
    }

    public void setImageLabel(String imageLabel) {
        ImageLabel = imageLabel;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getLinkHref() {
        return LinkHref;
    }

    public void setLinkHref(String linkHref) {
        LinkHref = linkHref;
    }

    public String getLinkRel() {
        return LinkRel;
    }

    public void setLinkRel(String linkRel) {
        LinkRel = linkRel;
    }

    public String getLinkType() {
        return LinkType;
    }

    public void setLinkType(String linkType) {
        LinkType = linkType;
    }

    public String getPriceAmount() {
        return PriceAmount;
    }

    public void setPriceAmount(String priceAmount) {
        PriceAmount = priceAmount;
    }

    public String getPriceCurrency() {
        return PriceCurrency;
    }

    public void setPriceCurrency(String priceCurrency) {
        PriceCurrency = priceCurrency;
    }

    public String getArtistHref() {
        return ArtistHref;
    }

    public void setArtistHref(String artistHref) {
        ArtistHref = artistHref;
    }

    public String getImReleaseDateLabel() {
        return ImReleaseDateLabel;
    }

    public void setImReleaseDateLabel(String imReleaseDateLabel) {
        ImReleaseDateLabel = imReleaseDateLabel;
    }

    public String getRightsLabel() {
        return RightsLabel;
    }

    public void setRightsLabel(String rightsLabel) {
        RightsLabel = rightsLabel;
    }

    public String getSummaryLabel() {
        return SummaryLabel;
    }

    public void setSummaryLabel(String summaryLabel) {
        SummaryLabel = summaryLabel;
    }

    public String getIdCategory() {
        return IdCategory;
    }

    public void setIdCategory(String idCategory) {
        IdCategory = idCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
