package com.example.dell.list;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CameraApp extends AppCompatActivity {

    protected static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_app);

        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == RESULT_OK) {
            if (requestCode == CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE) {

                //use imageUri here to access the image

                Bundle extras = data.getExtras();

                //Log.e("URI",imageUri.toString());

                Bitmap bmp = (Bitmap) extras.get("data");

                // here you will get the image as bitmap
                ImageView iv = findViewById(R.id.imageView);
                iv.setImageBitmap(bmp);

            }
            else if (resultCode == RESULT_CANCELED) {
                Toast.makeText(this, "Picture was not taken", Toast.LENGTH_SHORT);
            }
        }


    }
}
