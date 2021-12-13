package com.example.retrofit_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Glide_Example extends AppCompatActivity {


    Button button;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide__example);

        button = findViewById(R.id.loadbtn2);
        image = findViewById(R.id.imgvw2);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Glide.with(Glide_Example.this).load("https://goo.gl/gEgYUd").into(image);
            }
        });
    }
}