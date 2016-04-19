package com.hackro.tutorials.gravility.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.hackro.tutorials.gravility.Adapter.AdapterApps;
import com.hackro.tutorials.gravility.DataBase.MethodsDataBase;
import com.hackro.tutorials.gravility.Entities.Aplicacion;
import com.hackro.tutorials.gravility.R;
import com.hackro.tutorials.gravility.Utilidades.SwipeableRecyclerViewTouchListener;

import java.util.ArrayList;
import java.util.List;

import io.realm.RealmConfiguration;

public class ListApps extends AppCompatActivity {

    private MethodsDataBase methodsDataBase;
    private String imId;
    private AdapterApps ca;
    private List<Aplicacion> apps, apps2;
    private RealmConfiguration realmConfiguration;
    private int posicion;
    private boolean opcion;
    private RecyclerView recList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_apps);
        opcion = true;
        getSupportActionBar().hide();
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            imId = bundle.getString("imId");
        }

        recList = (RecyclerView) findViewById(R.id.cardListApps);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        realmConfiguration = new RealmConfiguration.Builder(ListApps.this).build();
        methodsDataBase = new MethodsDataBase(realmConfiguration);
        apps2 = new ArrayList<Aplicacion>();
        apps = (List<Aplicacion>) methodsDataBase.getAllAplicationsCategory(imId);
        apps2.addAll((List<Aplicacion>) apps);

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
                                startActivity(new Intent(ListApps.this,Categories.class));


                            }

                            @Override
                            public void onDismissedBySwipeRight(RecyclerView recyclerView, int[] reverseSortedPositions) {
                                InformationApp(reverseSortedPositions[0]);
                            }
                        },opcion);

        recList.addOnItemTouchListener(swipeTouchListener);
    }

    public void InformationApp(int posicion) {
        Intent intent = new Intent(ListApps.this, DetailsApp.class);

        intent.putExtra("Title", apps2.get(posicion).getTitle());
        intent.putExtra("ImageLabel", apps2.get(posicion).getImageLabel());
        intent.putExtra("Category", apps2.get(posicion).getCategory());
        intent.putExtra("SummaryLabel", apps2.get(posicion).getSummaryLabel());
        intent.putExtra("ImReleaseDateLabel", apps2.get(posicion).getImReleaseDateLabel());
        intent.putExtra("LinkHref", apps2.get(posicion).getLinkHref());
        intent.putExtra("RightsLabel", apps2.get(posicion).getRightsLabel());
        startActivity(intent);


    }

    @Override
    protected void onRestart() {

        recList.setAdapter(ca);


        super.onRestart();
    }

}
