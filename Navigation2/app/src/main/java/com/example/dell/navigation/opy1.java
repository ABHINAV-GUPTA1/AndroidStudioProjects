package com.example.dell.navigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class opy1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String arr[] = {"INDIA", "USA", "CHINA","Select"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opy1);
        final Spinner spin = findViewById(R.id.spin);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, arr);
//        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
        spin.setSelection(3);
        Button b1 = findViewById(R.id.id1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spin.getSelectedItemId() == 3) {
                    Toast.makeText(getApplicationContext(), "Nothing selected", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position != 3)
        Toast.makeText(getApplicationContext(), arr[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(getApplicationContext(), "Nothing selected", Toast.LENGTH_LONG).show();
    }
}
