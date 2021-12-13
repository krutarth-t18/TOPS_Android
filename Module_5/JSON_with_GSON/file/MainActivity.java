package com.example.json_with_gson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestQueue queue = Volley.newRequestQueue(this);

        String url = "https://jsonplaceholder.typicode.com/users";

        StringRequest stringRequest = new StringRequest(Request.Method.GET,url,
                new Response.Listener<String>(){

                    @Override
                    public void onResponse(String response) {
                        Type type = new TypeToken<ArrayList<ModelClass>>(){}.getType();

                        ArrayList<ModelClass> list = new Gson().fromJson(response,type);

                        RecyclerView recyclerView = findViewById(R.id.recyclerview);
                        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                        recyclerView.setAdapter(new Adapter(list));
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        queue.add(stringRequest);
    }
}