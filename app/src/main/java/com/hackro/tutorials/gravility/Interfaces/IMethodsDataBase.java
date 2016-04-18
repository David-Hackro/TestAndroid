package com.hackro.tutorials.gravility.Interfaces;

import com.hackro.tutorials.gravility.Entities.Aplicacion;
import com.hackro.tutorials.gravility.Entities.Categoria;

import java.util.List;

/**
 * Created by hackro on 13/04/16.
 */
public interface IMethodsDataBase {

    void InsertCategory(Categoria categoria);
    void InsertAplication(Aplicacion aplicacion);
    List<Categoria> getAllCategories();
    List<Aplicacion> getAllAplications();
    Aplicacion getApplication(String idApp);
    Categoria ExisteCategoria(Categoria c);


}
