package com.example.room_db_example.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.room_db_example.R;
import com.example.room_db_example.adapter.UserAdapter;
import com.example.room_db_example.database.Database_class;
import com.example.room_db_example.entity.User;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Database_class db;
    private RecyclerView mRecyclerView;
    public UserAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = (RecyclerView) findViewById(R.id.recycleviw);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(MainActivity.this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        db = Room.databaseBuilder(getApplicationContext(),Database_class.class,"myDatabase").allowMainThreadQueries().build();
        getalldata();
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddUserActivity.class));

            }
        });
    }
    private void getalldata(){
        List<User> userList = new ArrayList<>();
        userList = db.daoInterface().getUsers();

        if(userList.size()>0){
            mAdapter = new UserAdapter(userList);
            mRecyclerView.setAdapter(mAdapter);
        }
        else{
            Toast.makeText(this,"No data", Toast.LENGTH_SHORT).show();
        }
    }
}

