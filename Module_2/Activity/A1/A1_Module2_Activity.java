package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class A1_Module2_Activity extends AppCompatActivity {

    EditText edt1,edt2,edt3,edt4,edt5;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1__module2_);
        edt1 = findViewById(R.id.fname);
        edt2 = findViewById(R.id.lname);
        edt3 = findViewById(R.id.mail);
        edt4 = findViewById(R.id.monum);
        edt5 = findViewById(R.id.dob);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String fname = edt1.getText().toString();
                String lname = edt2.getText().toString();
                String mail = edt3.getText().toString();
                String number = edt4.getText().toString();
                String dob = edt5.getText().toString();
                send(fname,lname,mail,number,dob);
            }
        });
    }

    private void send(String fname, String lname, String mail, String number,String dob){

        Intent i = new Intent(A1_Module2_Activity.this, Pass_Data.class);
        i.putExtra("firstName",fname);
        i.putExtra("lastName",lname);
        i.putExtra("mail",mail);
        i.putExtra("num",number);
        i.putExtra("dob",dob);
        startActivity(i);
    }
}