package com.hackro.tutorials.gravility.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import com.hackro.tutorials.gravility.Adapter.AdapterCategories;
import com.hackro.tutorials.gravility.DataBase.MethodsDataBase;
import com.hackro.tutorials.gravility.Entities.Aplicacion;
import com.hackro.tutorials.gravility.Entities.Categoria;
import com.hackro.tutorials.gravility.R;

import java.util.List;

import io.realm.RealmConfiguration;

public class Categories extends AppCompatActivity {

    private MethodsDataBase methodsDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(Categories.this).build();
        methodsDataBase = new MethodsDataBase(realmConfiguration);

        List<Categoria> categorias = methodsDataBase.getAllCategories();

        RecyclerView recList = (RecyclerView) findViewById(R.id.ListCategories);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);


        AdapterCategories ca = new AdapterCategories(categorias,Categories.this);
        recList.setAdapter(ca);
    }
}
