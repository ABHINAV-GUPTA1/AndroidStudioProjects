package com.example.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {

    EditText em, pas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        em = findViewById(R.id.email);
        pas = findViewById(R.id.pass);
    }
    public void login(View v) {
        int id = v.getId();
        if (id == R.id.login) {
            Toast.makeText(this, "Logged in progress.....", Toast.LENGTH_LONG).show();
            String email = em.getText().toString();
            String pass = pas.getText().toString();
            if (email.equals("ab@gmail.com") && pass.equals("pass")) {
                Toast.makeText(this, "Logged in", Toast.LENGTH_LONG).show();
                Intent i = new Intent(this, listt.class);
                startActivity(i);
            } else {
                Toast.makeText(this, "wrong details", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this, "Error occured.....", Toast.LENGTH_LONG).show();
        }
    }
}
