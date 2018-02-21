package com.example.dell.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class l2 extends AppCompatActivity {

    ListView l1;

    String[] arr = {"shshs","shshs","sjshsh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l2);

        l1 = findViewById(R.id.newl);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(getApplicationContext(), R.layout.layout, R.id.tv1, arr);

//        aa = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, R.id.tv1, arr);

        l1.setAdapter(aa);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), position+" -> "+id,Toast.LENGTH_LONG ).show();
                view.animate().alpha(0.5f).setDuration(3000);
                Toast.makeText(getApplicationContext(), "value is "+arr[position],Toast.LENGTH_LONG ).show();
                TextView tv = (TextView)findViewById(R.id.tv1);
                Toast.makeText(getApplicationContext(), "Text value is "+tv.getText(),Toast.LENGTH_LONG ).show();
            }
        });

    }
}
