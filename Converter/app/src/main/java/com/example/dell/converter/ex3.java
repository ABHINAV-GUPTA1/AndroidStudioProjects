package com.example.dell.converter;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ex3 extends AppCompatActivity {

    public void fade3(View v) {
        ImageView i = findViewById(R.id.iv3);
//        i.animate().translationY(1000f).setDuration(3000);
//        i.animate().rotationBy(900000f).setDuration(100000);
        i.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3000);
    }
    public void fade4(View v) {
        ImageView i = findViewById(R.id.iv4);
        i.animate().translationXBy(-1000f).setDuration(3000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3);
    }
}
