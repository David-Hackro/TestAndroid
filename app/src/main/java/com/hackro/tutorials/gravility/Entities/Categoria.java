package com.hackro.tutorials.gravility.Entities;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by david on 13/04/16.
 */
public class Categoria extends RealmObject {

    @PrimaryKey
    private String ImId;
    private String Label;
    private String Scheme;
    private String Term;

    public Categoria() {
    }

    public Categoria(String imId, String label, String scheme, String term) {
        ImId = imId;
        Label = label;
        Scheme = scheme;
        Term = term;
    }

    public String getImId() {
        return ImId;
    }

    public void setImId(String imId) {
        ImId = imId;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public String getScheme() {
        return Scheme;
    }

    public void setScheme(String scheme) {
        Scheme = scheme;
    }

    public String getTerm() {
        return Term;
    }

    public void setTerm(String term) {
        Term = term;
    }
}
