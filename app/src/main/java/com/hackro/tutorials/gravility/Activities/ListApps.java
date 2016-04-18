package com.hackro.tutorials.gravility.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
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

import com.github.brnunes.swipeablerecyclerview.SwipeableRecyclerViewTouchListener;
import com.hackro.tutorials.gravility.Adapter.AdapterApps;
import com.hackro.tutorials.gravility.DataBase.MethodsDataBase;
import com.hackro.tutorials.gravility.Entities.Aplicacion;
import com.hackro.tutorials.gravility.Entities.Categoria;
import com.hackro.tutorials.gravility.R;

import java.util.ArrayList;
import java.util.List;

import io.realm.RealmConfiguration;

public class ListApps extends AppCompatActivity {

    private MethodsDataBase methodsDataBase;
    private String imId;
    private AdapterApps ca;
    private List<Aplicacion> apps,apps2;
    private RealmConfiguration realmConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_apps);

        getSupportActionBar().hide();
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            imId = bundle.getString("imId");
        }

        RecyclerView recList = (RecyclerView) findViewById(R.id.cardListApps);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        realmConfiguration = new RealmConfiguration.Builder(ListApps.this).build();
        methodsDataBase = new MethodsDataBase(realmConfiguration);
        apps2 = new ArrayList<Aplicacion>();
        apps = (List<Aplicacion>) methodsDataBase.getAllAplicationsCategory(imId);
        apps2.addAll((List<Aplicacion> )apps);

        ca = new AdapterApps(apps2, ListApps.this);
        recList.setAdapter(ca);

            SwipeableRecyclerViewTouchListener swipeTouchListener =
                    new SwipeableRecyclerViewTouchListener(recList,
                            new SwipeableRecyclerViewTouchListener.SwipeListener() {

                                @Override
                                public boolean canSwipeLeft(int position) {
                                    return true;
                                }

                                @Override
                                public boolean canSwipeRight(int position) {
                                    return true;
                                }

                                @Override
                                public void onDismissedBySwipeLeft(RecyclerView recyclerView, int[] reverseSortedPositions) {
                                    for (int position : reverseSortedPositions) {
                                        apps2.remove(position);
                                        ca.notifyItemRemoved(position);

                                    }
                                    ca.notifyDataSetChanged();
                                }

                                @Override
                                public void onDismissedBySwipeRight(RecyclerView recyclerView, int[] reverseSortedPositions) {
                                    for (int position : reverseSortedPositions) {
                                        apps2.remove(position);
                                        ca.notifyItemRemoved(position);
                                    }
                                    ca.notifyDataSetChanged();
                                }
                            });

            recList.addOnItemTouchListener(swipeTouchListener);
        }
}
