package com.hackro.tutorials.gravility.Activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

       /* LayoutInflater inf = ((Activity) this).getLayoutInflater();
        View customView = inf.inflate(R.layout.toolbar, null);
        Toolbar tolbar = (Toolbar) customView.findViewById(R.id.toolbar);
        TextView txv = (TextView) customView.findViewById(R.id.txvTituloBarra);
        txv.setText("Listado Apps");

        setSupportActionBar(tolbar);*/

        getSupportActionBar().hide();

        RecyclerView recList = (RecyclerView) findViewById(R.id.cardListApps);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(ListApps.this).build();
        methodsDataBase = new MethodsDataBase(realmConfiguration);

        List<Aplicacion> apps = methodsDataBase.getAllAplications();

        AdapterApps ca = new AdapterApps(apps,ListApps.this);
        recList.setAdapter(ca);
    }

    public void Categories(View v)
    {
    }

    public void back(View v)
    {
    }

}
