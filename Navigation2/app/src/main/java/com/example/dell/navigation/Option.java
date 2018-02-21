package com.example.dell.navigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opt1) {
            Intent i = new Intent(getApplicationContext(), opy1.class);
            startActivity(i);
        } else if (id == R.id.opt1) {
            Intent i = new Intent(getApplicationContext(), opy1.class);
            startActivity(i);
        } else if (id == R.id.opt2) {
            Intent i = new Intent(this, opt2.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(), "Clicked opt2 : " +item.getTitle(), Toast.LENGTH_LONG).show();
        } else if (id == R.id.opt3) {
            Toast.makeText(getApplicationContext(), "Clicked opt3 : " +item.getTitle(), Toast.LENGTH_LONG).show();
        } else if (id == R.id.opt4) {
            Toast.makeText(getApplicationContext(), "Clicked opt4 : " +item.getTitle(), Toast.LENGTH_LONG).show();
        } else if (id == R.id.opt5) {
            Toast.makeText(getApplicationContext(), "Clicked opt5 : " +item.getTitle(), Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
