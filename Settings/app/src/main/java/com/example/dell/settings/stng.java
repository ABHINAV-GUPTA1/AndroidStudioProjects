package com.example.dell.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class stng extends AppCompatActivity {

    String arr[] = {"Place Near Me", "Sound", "FeedBack"};

    Integer img[] = {R.drawable.i31, R.drawable.i2, R.drawable.i1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stng);

        ListView lv = findViewById(R.id.l1);
        MyAdapter ma = new MyAdapter(arr, img, getApplicationContext());
        lv.setAdapter(ma);
    }
}
class MyAdapter extends ArrayAdapter<String> {
    String[] arr;
    Integer[] img;
    Context context;
    MyAdapter(String arr[], Integer img[], Context context) {
        super(context, R.layout.row, arr);
        this.arr = arr;
        this.context = context;
        this.img = img;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater l1 = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = l1.inflate(R.layout.row, parent, false);

        final TextView tv = v.findViewById(R.id.tv);
        tv.setText(arr[position]);

        Switch sw = v.findViewById(R.id.sw);
        sw.setChecked(false);

        if (!tv.getText().toString().equals("Sound")) {
            sw.setVisibility(View.GONE);
        } else {
            sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @SuppressLint("ResourceAsColor")
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Toast.makeText(context, "Switch On..", Toast.LENGTH_LONG).show();
                        tv.setTextColor(Color.RED);
                    } else {
                        tv.setTextColor(Color.BLACK);
                    }
                }
            });
        }
        ImageView iv = v.findViewById(R.id.iv);
        iv.setImageResource(img[position]);

        return v;
    }
}