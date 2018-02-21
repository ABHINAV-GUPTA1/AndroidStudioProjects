package com.example.dell.navigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class opt2 extends AppCompatActivity {

    ExpandableListAdapter ela;
    ExpandableListView elv;
    List<String> list;//header
    HashMap<String, List<String>> hm;
    String arr[] = {"INDIA", "USA", "CHINA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opt2);
        elv = findViewById(R.id.elv);
        initialize();
        ela = new ExpandableListAdapter(getApplicationContext(), list, hm);
        elv.setAdapter(ela);
    }
    public void initialize() {
        list = new ArrayList<String>();
        hm = new HashMap<>();
        list.add("TOP CHARTS");
        list.add("LATEST");
        list.add("Coming Soon..");
        ArrayList<String> al = new ArrayList<>();
        al.add("AAB");
        al.add("AABc");
        al.add("AABD");
        al.add("AABE");
        al.add("AABF");
        al.add("AABG");

        hm.put(list.get(0), al);
        hm.put(list.get(1), al);
        hm.put(list.get(2), al);
    }
}
