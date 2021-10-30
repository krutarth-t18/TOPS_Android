package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SMSActivity extends AppCompatActivity {

    private static final int My_permission_request = 0;
    Button button;
    EditText msg,num;
    String number,message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_m_s);

        msg = findViewById(R.id.txtsms);
        num = findViewById(R.id.numsms);
        button = findViewById(R.id.btnsms);


        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

               Send_Msg();

            }
        });
    }
    protected void Send_Msg(){
        number = num.getText().toString();
        message = msg.getText().toString();
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED)
        {

            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.SEND_SMS)){

            }
            else{
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS},My_permission_request);

            }

        }
    }

    public void onRequestPermissionsResult(int requestCode,String permissions[],int[] grantResults){
        super.onRequestPermissionsResult(requestCode,permissions,grantResults);
        switch(requestCode){
            case My_permission_request:
                if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number,null,message,null,null);
                    Toast.makeText(getApplicationContext(),"Sent",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Failed to send",Toast.LENGTH_LONG).show();
                    return;
                }
        }

    }
}