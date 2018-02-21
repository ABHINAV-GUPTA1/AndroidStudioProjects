package com.example.dell.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class listsearch2 extends AppCompatActivity {

    EditText et1;

    ListView lv1;

    ArrayList<String> al1;

    ArrayAdapter<String> aa;

    String arr[]={"Padmaavat", "Maze Runner: The Death Cure", "Den of Thieves","Pad Mam","Tiger Zinda Hai"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listsearch2);

        et1 = findViewById(R.id.et1);

        lv1 = findViewById(R.id.ls11);

        initialize();

        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("")) {
                    initialize();
                } else {
                    search(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void search(String s) {
        for (String s1 : arr) {
            String s2 = s1.toLowerCase();
            s = s.toLowerCase();
            if (!s2.contains(s)) {
                al1.remove(s1);
            }
        }
        aa.notifyDataSetChanged();
    }

    public void initialize() {
        al1 = new ArrayList<String>(Arrays.asList(arr));
        aa = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, al1);
//        aa = new ArrayAdapter<String>(getApplicationContext(), R.layout.layout, R.id.tv1, al1);
        lv1.setAdapter(aa);
    }
}
