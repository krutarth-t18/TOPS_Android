package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SumActivity extends AppCompatActivity {

    EditText addition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        addition = findViewById(R.id.edtsum);
        String add = getIntent().getStringExtra("Sum");
        addition.setText("Sum is:   "+add);
    }
}
