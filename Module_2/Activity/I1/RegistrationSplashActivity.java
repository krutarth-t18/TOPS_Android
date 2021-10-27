package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;

public class RegistrationSplashActivity extends AppCompatActivity {

    ImageView imageView;
    Animation am;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_splesh);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent I = new Intent(RegistrationSplashActivity.this, HomeActivity.class);
                startActivity(I);
            }
        },3000);


    }
}