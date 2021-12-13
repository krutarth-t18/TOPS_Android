package com.example.storageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    TextView txtvw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1); //Store Information
        btn2 = findViewById(R.id.btn2); //Show info
        txtvw = findViewById(R.id.txtvw);

        View.OnClickListener listener = new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                switch(view.getId()){
                    case R.id.btn1:
                        Intent intent = new Intent(MainActivity.this,PrefActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.btn2:
                        displaypreference();
                        break;
                }

            }
        };
        btn1.setOnClickListener(listener); //store info
        btn2.setOnClickListener(listener); //show info
    }

    private void displaypreference(){

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        String username = sharedPreferences.getString("Username","Default Name");
        String passwd = sharedPreferences.getString("Password","Default Password");
        boolean checkBox = sharedPreferences.getBoolean("checkbox",false);
        String listpref = sharedPreferences.getString("listPref","Default list prefs");
        StringBuilder sb = new StringBuilder();
        sb.append("Username: "+username+"\n");
        sb.append("Password: "+passwd+"\n");
        sb.append("CheckBox: "+String.valueOf(checkBox)+"\n");
        sb.append("List Preference: "+listpref+"\n");
        txtvw.setText(sb.toString());

    }
}