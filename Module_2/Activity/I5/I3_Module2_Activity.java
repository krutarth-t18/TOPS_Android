package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class I3_Module2_Activity extends AppCompatActivity {

    EditText edt1,edt2;
    Button sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i3__module2_);
        edt1 = findViewById(R.id.val1);
        edt2 = findViewById(R.id.val2);
        sum = findViewById(R.id.sumbtn);

        sum.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                    String value1 = edt1.getText().toString();
                    String value2 = edt2.getText().toString();
                    Sum(value1,value2);

            }
        });
    }

    private void Sum(String value1, String value2){
        int a = Integer.valueOf(value1);
        int b = Integer.valueOf(value2);
        int sum = a+b;

        Intent i = new Intent(I3_Module2_Activity.this,SumActivity.class);
        i.putExtra("Sum",String.valueOf(sum));
        startActivity(i);
    }
}
