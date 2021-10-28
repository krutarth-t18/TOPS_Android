package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Pass_Data extends AppCompatActivity {

    TextView firstname,lastname,mail,number,dob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass__data);
        firstname = findViewById(R.id.fnameshow);
        lastname = findViewById(R.id.lnameshow);
        mail = findViewById(R.id.mailshow);
        number = findViewById(R.id.numbershow);
        dob = findViewById(R.id.dobshow);
        String fname = getIntent().getStringExtra("firstName");
        String lname = getIntent().getStringExtra("lastName");
        String mailshow = getIntent().getStringExtra("mail");
        String numbershow = getIntent().getStringExtra("num");
        String dobshow = getIntent().getStringExtra("dob");
        firstname.setText("First name: "+fname);
        lastname.setText("Last name: "+lname);
        mail.setText("Email: "+mailshow);
        number.setText("Mo. Number: "+numbershow);
        dob.setText("Birth Date: "+dobshow);
    }
}