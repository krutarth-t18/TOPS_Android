package com.example.phpcurd.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.phpcurd.Api.URL;
import com.example.phpcurd.R;

import java.util.HashMap;
import java.util.Map;

public class Update_Activity extends AppCompatActivity {

    EditText text1,text2,text3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_);

        text1 = findViewById(R.id.edtxt4);
        text2 = findViewById(R.id.edtxt5);
        text3 = findViewById(R.id.edtxt6);
        btn = findViewById(R.id.btn3);

        Bundle bundle = getIntent().getExtras();

        final String idd = bundle.getString("id");
        text1.setText(bundle.getString("name"));
        text2.setText(bundle.getString("price"));
        text3.setText(bundle.getString("des"));

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                final String name = text1.getText().toString();
                final String price = text2.getText().toString();
                final String des = text3.getText().toString();

                StringRequest request = new StringRequest(Request.Method.POST, URL.Update_data, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        startActivity(new Intent(Update_Activity.this, View_Activity.class));

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Update_Activity.this,"No Internet", Toast.LENGTH_LONG).show();
                    }
                }){
                    protected Map<String, String> getParams() throws AuthFailureError {
                        HashMap map = new HashMap();
                        map.put("id",String.valueOf(idd));
                        map.put("mobile_name",name);
                        map.put("mobile_price",price);
                        map.put("mobile_description",des);

                        return map;
                    }
                };

                RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
                queue.add(request);
            }
        });
    }
}