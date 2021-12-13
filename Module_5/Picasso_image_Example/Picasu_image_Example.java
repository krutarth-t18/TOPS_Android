package com.example.retrofit_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Picasu_image_Example extends AppCompatActivity {

    Button btn;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasu_image__example);

        btn = findViewById(R.id.loadbtn);
        image = findViewById(R.id.imgvw);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Picasso.get().load("https://www.kindpng.com/picc/m/148-1481404_clipart-small-size-image-download-hd-png-download.png").into(image);
            }
        });
    }
}