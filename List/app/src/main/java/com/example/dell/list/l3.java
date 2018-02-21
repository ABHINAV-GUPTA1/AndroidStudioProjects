package com.example.dell.list;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class l3 extends AppCompatActivity {


    String arr[] = {"WA1", "WA2", "WA3","WA4","WA5"};
    Integer imag[] = {R.drawable.i1, R.drawable.i2, R.drawable.i3, R.drawable.i4, R.drawable.i5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l3);
        ListView lv = findViewById(R.id.l13);
        CustomList cl = new CustomList(getApplicationContext(), arr, imag);
        lv.setAdapter(cl);
    }

}

