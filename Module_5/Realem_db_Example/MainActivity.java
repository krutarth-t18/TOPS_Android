package com.example.realem_db_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button btn1,btn2;
    Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.edt1);
        editText2 = findViewById(R.id.edt2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        realm = Realm.getInstance(Realm.getDefaultConfiguration());

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                String name = editText1.getText().toString();
                String pass = editText2.getText().toString();
                realm.beginTransaction();
                Model_Class m = realm.createObject(Model_Class.class);
                m.setName(name);
                m.setPass(pass);
                realm.commitTransaction();
                Toast.makeText(getApplicationContext(),"Inserted", Toast.LENGTH_SHORT).show();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,ShowActivity.class));
            }
        });
    }
}