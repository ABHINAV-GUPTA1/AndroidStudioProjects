package com.example.dell.list;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.BackgroundColorSpan;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSearch extends AppCompatActivity {

    EditText et1;

    ListView lv1;

    ArrayList<String> al1;
    ArrayList<String> al2;

    ArrayAdapter<String> aa;

    String arr[]={"hi", "bye", "abcd", "defh", "Padmaavat", "Maze Runner: The Death Cure", "Den of Thieves","Pad Mam","Tiger Zinda Hai"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_search);
        initialize();
        update();
        et1.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                al2.clear();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str = s.toString();
                if (str.equals("")) {
                    update();
                } else {
//                    Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
                    search(str);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (et1.getText().toString().equals("")){
                    update();
                } else {
                    modified();
                }
            }
        });
//        update();
    }
    private void modified() {
        aa = new ArrayAdapter<String>(getApplicationContext(), R.layout.layout, R.id.tv1, al2);
        lv1.setAdapter(aa);
    }
    private void search(String str) {
        for (String s1 : arr) {
            String s2 = s1.toLowerCase();
            String s = str.toLowerCase();
            if (s2.contains(s)) {
                al2.add(s1);
//                Toast.makeText(getApplicationContext(), s1, Toast.LENGTH_LONG).show();

//                int start = s2.indexOf(s);
//                int end = s2.indexOf(s)+1;
//                SpannableString str1 = new SpannableString(str);
//                str1.setSpan(new BackgroundColorSpan(Color.YELLOW), start, end, 0);
//                et1.setText(str1);
            }
        }
//        aa = new ArrayAdapter<String>(getApplicationContext(), R.layout.layout, R.id.tv1, al1);
//        lv1.setAdapter(aa);
        aa.notifyDataSetChanged();
    }
    private void update() {
        al1 = new ArrayList<String>(Arrays.asList(arr));
        al2 = new ArrayList<>();
        aa = new ArrayAdapter<String>(getApplicationContext(), R.layout.layout, R.id.tv1, al1);
        lv1.setAdapter(aa);
    }
    private void initialize() {

        et1 = (EditText) findViewById(R.id.s2);
        lv1 = (ListView)findViewById(R.id.slv);

    }

}
