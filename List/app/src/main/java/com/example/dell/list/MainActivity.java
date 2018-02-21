package com.example.dell.list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button l1, l2, l3, l4, l5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1 = findViewById(R.id.l1);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), l1.class);
                startActivity(i);
            }
        });

        l2 = findViewById(R.id.l2);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), l2.class);
                startActivity(i);
            }
        });

        l3 = findViewById(R.id.l3);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), l3.class);
                startActivity(i);
            }
        });

        l4 = findViewById(R.id.bookmyshow);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), list2.class);
                startActivity(i);
            }
        });

        l5 = findViewById(R.id.s1);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ListSearch.class);
                startActivity(i);
            }
        });
        Button l6 = findViewById(R.id.s12);
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), listsearch2.class);
                startActivity(i);
            }
        });
        findViewById(R.id.s6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ListSearch3.class);
                startActivity(i);
            }
        });
        findViewById(R.id.s7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ActivityLife.class);
                startActivity(i);
            }
        });
        findViewById(R.id.s8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CameraApp.class);
                startActivity(i);
            }
        });
        findViewById(R.id.s9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SurfaceViewExample.class);
                startActivity(i);
            }
        });
    }
}
