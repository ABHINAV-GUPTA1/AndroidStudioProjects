package com.example.dell.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    TextView tv1;
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv);
        et1 = findViewById(R.id.et);
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et1.getText().toString();
                try {
                    int i = Integer.parseInt(str);
                    tv1.setText((i*0.75)+"");
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Enter only Integer value", Toast.LENGTH_LONG).show();
                    tv1.setText("");
                    et1.setText("");
                }
            }
        });
        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ex1.class);
                startActivity(i);
            }
        });
        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ex2.class);
                startActivity(i);
            }
        });
        Button b4 = findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ex3.class);
                startActivity(i);
            }
        });

        Button b5 = findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ConnectGame.class);
                startActivity(i);
            }
        });
    }
}
