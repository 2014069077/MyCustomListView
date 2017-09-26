package com.uy.mycustomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.uy.mycustomlistview.R.id.lv_AndroidVersions;

public class MainActivity extends AppCompatActivity {
    ListView lvAndroidVersions;
    int [] logos;
    String [] codeName, versions, apis, dates;
    ArrayList<AndroidVersion> arrayList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvAndroidVersions = (ListView) findViewById(lv_AndroidVersions);
        logos = new int []{R.drawable.cupcake, R.drawable.donut, R.drawable.eclaire, R.drawable.froyo,
        R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.icecreamsandwich, R.drawable.jellybean,
        R.drawable.kitkat, R.drawable.lollipop, R.drawable.marshmallow, R.drawable.nougat, R.drawable.oreo};
        codeName = getResources().getStringArray(R.array.codename);
        versions = getResources().getStringArray(R.array.version);
        apis = getResources().getStringArray(R.array.api_level);
        dates = getResources().getStringArray(R.array.release_date);

        arrayList = new ArrayList<AndroidVersion>();

        for (int i=0; i < codeName.length; i++) {
            AndroidVersion android = new AndroidVersion(logos[i], codeName[i], versions[i], apis[i], dates[i]);
            arrayList.add(android);
        }

        adapter = new CustomAdapter(arrayList, this);
        lvAndroidVersions.setAdapter(adapter);

        lvAndroidVersions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String msg ="You clicked " + codeName[i];
                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();
            }
        });

    }
    }

