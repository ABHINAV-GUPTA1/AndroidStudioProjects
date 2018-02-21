package com.example.dell.list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by DELL on 2/5/2018.
 */

public class bmsList extends ArrayAdapter<String> {
    Context context;
    String str[];
    Integer arr[];
    String lang[];

    public bmsList(@NonNull Context context, String str[], Integer arr[], String []lang) {
        super(context, R.layout.layout, R.id.tv1, str);
        this.str = str;
        this.arr = arr;
        this.context = context;
        this.lang = lang;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater l1 = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = l1.inflate(R.layout.bookmyshow, parent, false);

        TextView t = v.findViewById(R.id.film_name);
        t.setText(str[position]);

        TextView t1 = v.findViewById(R.id.lang);
        t1.setText(lang[position]);

        ImageView iv = v.findViewById(R.id.bms1);
        iv.setImageResource(arr[position]);

        Button b1 = v.findViewById(R.id.bookshow);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked for : "+str[position], Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }

}
