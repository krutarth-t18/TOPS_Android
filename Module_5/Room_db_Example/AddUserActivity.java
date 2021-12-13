package com.example.room_db_example.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.room_db_example.R;
import com.example.room_db_example.database.Database_class;
import com.example.room_db_example.entity.User;
import com.example.room_db_example.globalvariables.Global_variables;

public class AddUserActivity extends AppCompatActivity {

    private EditText mName, mEmail;
    private Button mAddUser;
    private String nameString, emailString;
    private Context mContext;
    Database_class db;

//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        mContext = AddUserActivity.this;
        mName = findViewById(R.id.edtxt1);
        mEmail = findViewById(R.id.edtxt2);
        mAddUser = findViewById(R.id.submit);

        if(Global_variables.updateflag.equals("update")){
            mName.setText(Global_variables.name);
            mEmail.setText(Global_variables.email);
        }
        db = Room.databaseBuilder(getApplicationContext(),Database_class.class,"myDatabase").allowMainThreadQueries().build();

        mAddUser.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                nameString = mName.getText().toString();
                emailString = mEmail.getText().toString();

                if(nameString.length()>0 && emailString.length()>0){
                    if(Global_variables.updateflag.equals("update")){
                        User user = new User();
                        user.setId(Global_variables.id);
                        user.setName(nameString);
                        user.setEmail(emailString);
                        db.daoInterface().updateuser(user);
                        Toast.makeText(mContext,"Updated Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(AddUserActivity.this, MainActivity.class));
                    }
                    else{
                        User user = new User();
                        user.setName(nameString);
                        user.setEmail(emailString);
                        db.daoInterface().adduser(user);
                        Toast.makeText(mContext,"Successful",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(AddUserActivity.this,MainActivity.class));
                    }
                }
            }
        });

    }
}