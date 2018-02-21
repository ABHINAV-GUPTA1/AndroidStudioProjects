package com.example.dell.splash;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Punjab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab);
        getSupportActionBar().hide();
        findViewById(R.id.i11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Images.class);
                i.putExtra("Image", R.drawable.p1);
                String text = getResources().getString(R.string.p1);
                i.putExtra("Text", text);
                startActivity(i);
            }
        });
        findViewById(R.id.i12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int image = v.getId();
                Intent i = new Intent(getApplicationContext(), Images.class);
                i.putExtra("Image", R.drawable.p2);
                String text = getResources().getString(R.string.p2);
                i.putExtra("Text", text);

                startActivity(i);
            }
        });
        findViewById(R.id.i13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int image = v.getId();
                Intent i = new Intent(getApplicationContext(), Images.class);
                i.putExtra("Image", R.drawable.p3);
                String text = getResources().getString(R.string.p3);

                i.putExtra("Text", text);
                startActivity(i);
            }
        });
    }
}
