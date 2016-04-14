package com.hackro.tutorials.gravility.DataBase;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.hackro.tutorials.gravility.Entities.Aplicacion;
import com.hackro.tutorials.gravility.Entities.Categoria;
import com.hackro.tutorials.gravility.Interfaces.IMethodsDataBase;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

/**
 * Created by hackro on 13/04/16.
 */
public class MethodsDataBase implements IMethodsDataBase {

    private Realm realm;
    private RealmConfiguration realmConfig;
    private Categoria category;
    private Aplicacion aplication;

    public MethodsDataBase(RealmConfiguration realmConfiguration) {
        //realmConfig = realmConfiguration;//= new RealmConfiguration.Builder(c).build();
        realm = Realm.getInstance(realmConfiguration);
    }

    @Override
    public void InsertCategory(Categoria c) {
        try {
            realm.beginTransaction();
            category = realm.createObject(Categoria.class);

            category.setImId(c.getImId());
            category.setLabel(c.getLabel());
            category.setScheme(c.getScheme());
            category.setTerm(c.getTerm());

        } catch (Exception e) {
            Log.e("Existe", "");

        } finally {
            realm.commitTransaction();
        }
    }

    @Override
    public void InsertAplication(Aplicacion app) {

        try {
            realm.beginTransaction();

            aplication = realm.createObject(Aplicacion.class);

            aplication.setImId(app.getImId());
            aplication.setArtistHref(app.getArtistHref());
            aplication.setIdLabel(app.getIdLabel());
            aplication.setImageLabel(app.getImageLabel());
            aplication.setImBundleId(app.getImBundleId());
            aplication.setImReleaseDateLabel(app.getImReleaseDateLabel());
            aplication.setLinkHref(app.getLinkHref());
            aplication.setLinkType(app.getLinkType());
            aplication.setPriceAmount(app.getPriceAmount());
            aplication.setPriceCurrency(app.getPriceCurrency());
            aplication.setRightsLabel(app.getRightsLabel());
            aplication.setTitle(app.getTitle());
            aplication.setSummaryLabel(app.getSummaryLabel());


        } catch (Exception e) {
            Log.e("Error", "");

        } finally {
            realm.commitTransaction();
        }
    }

    @Override
    public List<Categoria> getAllCategories() {
        RealmResults<Categoria> result = realm.where(Categoria.class).findAll();
        return result;
    }

    @Override
    public List<Aplicacion> getAllAplications() {
        RealmResults<Aplicacion> result = realm.where(Aplicacion.class).findAll();
        return result;
    }

    @Override
    public Aplicacion getApplication(String idApp) {
        return realm.where(Aplicacion.class).equalTo("idApp", idApp).findFirst();
    }
}
