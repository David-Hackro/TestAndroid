
package com.hackro.tutorials.gravility.Entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Link_ {

    @SerializedName("attributes")
    @Expose
    private Attributes________ attributes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Link_() {
    }

    /**
     * 
     * @param attributes
     */
    public Link_(Attributes________ attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * @return
     *     The attributes
     */
    public Attributes________ getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    public void setAttributes(Attributes________ attributes) {
        this.attributes = attributes;
    }

}
