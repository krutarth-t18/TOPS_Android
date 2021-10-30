package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallingActivity extends AppCompatActivity {

    Button button;
    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling);

        button = findViewById(R.id.btncall);
        txt = findViewById(R.id.txtcall);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String num = txt.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",num,null));
                startActivity(intent);


            }


        });
    }
}