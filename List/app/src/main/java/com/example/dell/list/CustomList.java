package com.example.dell.list;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by DELL on 1/29/2018.
 */

public class CustomList extends ArrayAdapter<String> {
    Context context;
    String str[];
    Integer arr[];


    public CustomList(@NonNull Context context, String str[], Integer arr[]) {
        super(context, R.layout.layout, R.id.tv1, str);
        this.str = str;
        this.arr = arr;
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater l1 = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = l1.inflate(R.layout.layout, parent, false);

        TextView t = v.findViewById(R.id.tv1);
        int start = 0;
        int end = 2;
//        SpannableString str1 = new SpannableString(str[position]);
//        str1.setSpan(new BackgroundColorSpan(Color.YELLOW), start, end, 0);
        t.setText(str[position]);

        ImageView iv = v.findViewById(R.id.iv11);
        iv.setImageResource(arr[position]);
        return v;
    }

}