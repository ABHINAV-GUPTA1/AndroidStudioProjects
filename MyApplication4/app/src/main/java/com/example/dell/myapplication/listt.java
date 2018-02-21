package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class listt extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listt);
        l1 = findViewById(R.id.lv1);
        l1.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView t1 = (TextView) view;
        Toast.makeText(this,t1.getText()+" and position = "+position,Toast.LENGTH_LONG).show();

    }
}
