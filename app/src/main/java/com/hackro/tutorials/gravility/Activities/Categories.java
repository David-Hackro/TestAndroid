package com.hackro.tutorials.gravility.Activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.hackro.tutorials.gravility.DataBase.MethodsDataBase;
import com.hackro.tutorials.gravility.Entities.Categoria;
import com.hackro.tutorials.gravility.R;

import java.util.List;
import java.util.Random;

import io.realm.RealmConfiguration;


public class Categories extends Activity {
    private MethodsDataBase methodsDataBase;

    private AbsListView absListView;
    private List<Categoria> categorias;

    static String[] listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);


        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(Categories.this).build();
        methodsDataBase = new MethodsDataBase(realmConfiguration);

        categorias = methodsDataBase.getAllCategories();
        listItems = new String[categorias.size()];
        int i = 0;
        for (Categoria cc : categorias) {
            listItems[i] = cc.getLabel();
            i++;
        }

        absListView = (AbsListView) findViewById(R.id.listView1);

        absListView.setAdapter(new MyArrayAdapter(this, R.layout.row, listItems));
    }


    private class MyArrayAdapter extends ArrayAdapter<String> {

        public MyArrayAdapter(Context context, int resource,
                              String[] values) {
            super(context, resource, values);
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.row, parent, false);
            TextView textView = (TextView) view.findViewById(R.id.textView1);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView1);

            textView.setText(getItem(position));

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ///Toast.makeText(Categories.this, "posicion " + position, Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Categories.this, ListApps.class);
                    intent.putExtra("imId", categorias.get(position).getImId());
                    startActivity(intent);
                }
            });


            return view;
        }
    }
}