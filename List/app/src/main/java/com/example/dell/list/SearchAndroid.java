package com.example.dell.list;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;

/**
 * Created by DELL on 2/11/2018.
 */

public class SearchAndroid extends ArrayAdapter<String> {
    Context context;
    String names[];
    String num[];
    Integer img[];
    String search11;

    public SearchAndroid(Context context, String names[], String[] num, Integer img[]) {
        super(context, R.layout.mynewlayout, R.id.name, names);
        this.context = context;
        this.img = img;
        this.num = num;
        this.names = names;
        this.search11 = "";
    }
    public void setSearch(String search11) {
        this.search11 = search11;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater l1 = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = l1.inflate(R.layout.mynewlayout, parent, false);
        View v2 = l1.inflate(R.layout.activity_list_search3, parent, false);
        TextView t = v.findViewById(R.id.name);
        EditText search = v2.findViewById(R.id.search_per);
        /*
        String f = "";
        String val = names[position];
//        if (search != null) {
//        f = search.getText().toString();
//        } else {
//            f="ABHI";
//        }
        f = "ABHI";
        int start = val.indexOf(f);
        Log.i("info : ", f+"1211");
//        SpannableString str1 = new SpannableString(names[position]);
//        str1.setSpan(new BackgroundColorSpan(Color.YELLOW), start, end, 0);
//        t.setText(str1);
        if (start != -1 && !f.equals("")) {
            int end = start+f.length();
//            String sub = val.substring(0, start);val.substring(start, end)
            SpannableString str1 = new SpannableString(val);
//            String sub2 = val.substring(end, val.length());
            str1.setSpan(new StyleSpan(Typeface.BOLD), start, end, 0);
            Log.i("info : ", val.substring(start, end)+"12131 "+start+"-> "+end);
            t.setText(str1);
        } else {
            String sub = val;
            t.setText(val+" 123");
        }

        */
        search11 = search11.toLowerCase();
        String val = names[position].toLowerCase();
        String se1 = names[position];
        int start = val.indexOf(search11);
        int end = start+search11.length();
        if (!search11.equals("") && start!=-1) {

            SpannableString str1 = new SpannableString(se1);
            str1.setSpan(new StyleSpan(Typeface.BOLD), start, end, 0);
            t.setText(str1);
            Log.i("info : ", val.substring(start, end)+" 12131 "+start+"-> "+end);
        } else {
            t.setText(se1);
        }
        ImageView iv = v.findViewById(R.id.img);
        iv.setImageResource(img[position]);

        TextView t1 = v.findViewById(R.id.phone_num);
        t1.setText(num[position]);


        return v;
    }

}
