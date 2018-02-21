package com.example.dell.list;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityLife extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Info", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Info", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Info", "onDestroy");
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Log.d("Info", "OnBackPressed");
        AlertDialog.Builder a1 = new AlertDialog.Builder(this);
        a1.setMessage("QUIT");
        a1.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        a1.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog a11 = a1.create();
        a1.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Info", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Info", "OnResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Info", "onRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);
    }
}
