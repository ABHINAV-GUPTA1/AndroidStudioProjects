package com.example.dell.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class abc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc);
        findViewById(R.id.p1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Punjab.class);
                startActivity(i);
            }
        });
        findViewById(R.id.p2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(), Haryana.class);
//                startActivity(i);
                Intent i = new Intent(getApplicationContext(), Punjab.class);
                startActivity(i);
            }
        });
        findViewById(R.id.p3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(), Himachal.class);
//                startActivity(i);
                Intent i = new Intent(getApplicationContext(), Punjab.class);
                startActivity(i);
            }
        });
    }
}
