package com.example.dell.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class list2 extends AppCompatActivity  {

    String arr[] = {"Padmaavat", "Maze Runner: The Death Cure", "Den of Thieves","Pad Mam","Tiger Zinda Hai"};
    Integer imag[] = {R.drawable.i11, R.drawable.i22, R.drawable.noimage, R.drawable.i44, R.drawable.noimage};
    String lang[] = {"Hindi", "English", "English", "Hindi", "Hindi"};
    Button b1;
    int i=0;

    @Override
    public void onBackPressed() {
        LayoutInflater layoutInflater= getLayoutInflater();
        View layout = layoutInflater.inflate(R.layout.back_pressed, (ViewGroup) findViewById(R.id.myToast));
        TextView tv = layout.findViewById(R.id.toast_text);
        tv.setText("Press again to exit");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.NO_GRAVITY, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        if (i == 0) {
            i++;
            toast.show();
        } else {
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        i = 0;
        ListView lv = findViewById(R.id.bms);
        bmsList cl = new bmsList(getApplicationContext(), arr, imag, lang);
        lv.setAdapter(cl);
//        b1 = (Button)findViewById(R.id.bookshow);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), " dshdh", Toast.LENGTH_LONG).show();
//            }
//        });
    }
}
