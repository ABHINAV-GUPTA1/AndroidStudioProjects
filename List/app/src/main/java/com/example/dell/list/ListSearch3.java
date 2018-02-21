package com.example.dell.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSearch3 extends AppCompatActivity {

    EditText et1;

    ListView lv1;

    ArrayList<String> al1;
    ArrayList<String> al2;
    ArrayList<Integer> al3;
    SearchAndroid aa;

    String arr[] = {"Er. ABHINAV GUPTA", "ABCD EFGH", "DEFGhikj", "dhfhjf", "fjffjf", "ABCD EFGH"};
    String con[] = {"+91-7696244723", "+91-8678123723", "+91-9878244456", "+91-9112293756", "+91-9769693354", "+91-9878244456"};
    Integer img[] = {R.drawable.profile1, R.drawable.profil2, R.drawable.profile3, R.drawable.profil4, R.drawable.profile5, R.drawable.profil6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_search3);
        initialize();
        update();
//        et1.setText("ABHINAV");
        et1.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                al1.clear();
                al2.clear();
                al3.clear();
                aa.setSearch("");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str = s.toString();
                if (str.equals("")) {
                    update();
                } else {
                    search(str);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (et1.getText().toString().equals("")){
                    update();
                } else {
                    modified(et1.getText().toString());
                }
            }
        });


    }

    private void modified(String srch) {
        String t_arr[] = al1.toArray(new String[al1.size()]);
        String t_con[] = al2.toArray(new String[al1.size()]);
        Integer t_img[] = al3.toArray(new Integer[al1.size()]);
        aa = new SearchAndroid(getApplicationContext(), t_arr, t_con, t_img);
        aa.setSearch(srch);
        lv1.setAdapter(aa);
    }
    private void search(String str) {
        for (int i = 0 ; i < arr.length; i++) {
            String s1 = arr[i];
            String s2 = s1.toLowerCase();
            String s = str.toLowerCase();
            if (s2.contains(s)) {
                Log.i("info :", s1);
//                Toast.makeText(getApplicationContext(), s1, Toast.LENGTH_LONG).show();
                al1.add(s1);
                al2.add(con[i]);
                al3.add(img[i]);
            }
        }
//        modified();
//        aa.notifyDataSetChanged();
        modified(str);
//        aa = new SearchAndroid(getApplicationContext(), arr, con, img);
//        lv1.setAdapter(aa);
    }

    private void update() {
        al1 = new ArrayList<String>();
        al2 = new ArrayList<String>();
        al3 = new ArrayList<Integer>();
        aa = new SearchAndroid(getApplicationContext(), arr, con, img);
        aa.setSearch("123");
        lv1.setAdapter(aa);
    }

    private void initialize() {
        et1 = (EditText) findViewById(R.id.search_per);
        lv1 = (ListView)findViewById(R.id.listview3);
    }
}
class ArrayVal{
    String names[];
    String phone_num[];
    Integer img[];
    ArrayVal(String names[], String []phone_num, Integer[] img) {
        this.img = img;
        this.phone_num = phone_num;
        this.names = names;
    }

    public void setVals(String names[], String []phone_num, Integer[] img) {
        this.img = img;
        this.phone_num = phone_num;
        this.names = names;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String[] getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String[] phone_num) {
        this.phone_num = phone_num;
    }

    public Integer[] getImg() {
        return img;
    }

    public void setImg(Integer[] img) {
        this.img = img;
    }
}