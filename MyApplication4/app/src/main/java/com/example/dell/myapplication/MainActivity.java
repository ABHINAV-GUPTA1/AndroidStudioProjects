package com.example.dell.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText uname, email, pass;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = findViewById(R.id.uname);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        register=findViewById(R.id.register);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
       // if (id == R.id.register) {
            Toast.makeText(this, "Registration in progress.....", Toast.LENGTH_LONG).show();
            String un = uname.getText().toString();
            String em = email.getText().toString();
            String pas = pass.getText().toString();
            if (un.equals("Admin") && em.equals("ABC@GMAIL.COM") && pas.equals("pass")) {
                Toast.makeText(this, "details verified", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "wrong details", Toast.LENGTH_LONG).show();
            }


    }
    public void login(View v) {
        int id = v.getId();
        if (id == R.id.login) {
            Intent i = new Intent(this, register.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "Error occured.....", Toast.LENGTH_LONG).show();
        }

    }
}
