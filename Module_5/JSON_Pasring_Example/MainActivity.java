package com.example.json_parsing_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String JSON_URL = "https://simplifiedcoding.net/demos/view-flipper/heroes.php";

    ListView listView;

    List<Heros> herolist;

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        herolist = new ArrayList<>();

        loadHerolist();
    }

    private void loadHerolist(){
        progressBar = findViewById(R.id.progressbar);

        progressBar.setVisibility(View.VISIBLE);

        StringRequest stringRequest = new StringRequest(Request.Method.GET,JSON_URL,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        progressBar.setVisibility(View.INVISIBLE);

                        try {
                            JSONObject obj = new JSONObject(response);

                            JSONArray heroArray = obj.getJSONArray("heroes");

                            for (int i = 0; i < heroArray.length(); i++) {
                                JSONObject heroObject = heroArray.getJSONObject(i);

                                Heros hero = new Heros(heroObject.getString("name"), heroObject.getString("imageurl"));

                                herolist.add(hero);
                            }

                            LIistViewAdapter adapter = new LIistViewAdapter(herolist, getApplicationContext());

                            listView.setAdapter(adapter);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                },new Response.ErrorListener(){

            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_LONG).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);


    }
}