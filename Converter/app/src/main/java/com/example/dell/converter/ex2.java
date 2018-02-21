package com.example.dell.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ex2 extends AppCompatActivity {

    public void fade(View view) {
        ImageView i = findViewById(R.id.imageView);
        i.animate().alpha(0f).setDuration(2000);
        i = findViewById(R.id.imageView2);
        i.animate().alpha(1f).setDuration(2000);
    }
    public void fade2(View view) {
        ImageView i = findViewById(R.id.imageView2);
        i.animate().alpha(0f).setDuration(2000);
        i = findViewById(R.id.imageView);
        i.animate().alpha(1f).setDuration(2000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);
    }
}
