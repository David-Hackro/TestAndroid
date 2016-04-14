package com.hackro.tutorials.gravility.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hackro.tutorials.gravility.Adapter.AdapterApps;
import com.hackro.tutorials.gravility.DataBase.MethodsDataBase;
import com.hackro.tutorials.gravility.Entities.Aplicacion;
import com.hackro.tutorials.gravility.R;

import java.util.ArrayList;
import java.util.List;

import io.realm.RealmConfiguration;

public class ListApps extends AppCompatActivity {

    private MethodsDataBase methodsDataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_apps);


        RecyclerView recList = (RecyclerView) findViewById(R.id.cardListApps);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(ListApps.this).build();
        methodsDataBase = new MethodsDataBase(realmConfiguration);

        List<Aplicacion> apps = methodsDataBase.getAllAplications();//new ArrayList<Aplicacion>();

        AdapterApps ca = new AdapterApps(apps,ListApps.this);
        recList.setAdapter(ca);
    }
}
