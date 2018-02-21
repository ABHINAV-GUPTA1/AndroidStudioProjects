package com.example.dell.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(4000);
                } catch (Exception e) {

                }
                Intent i = new Intent(getApplicationContext(), abc.class);
                startActivity(i);
                finish();
            }
        });
        t1.start();
    }
}
