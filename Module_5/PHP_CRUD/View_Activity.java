package com.example.phpcurd.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.phpcurd.Adapter.MyAdapter;
import com.example.phpcurd.Api.URL;
import com.example.phpcurd.Model.View_Model;
import com.example.phpcurd.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class View_Activity extends AppCompatActivity {

    ListView listView;
    List<View_Model> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_);

        listView = findViewById(R.id.listvw);

        list = new ArrayList<>();
        registerForContextMenu(listView);

        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL.View_data, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONArray jsonArray = new JSONArray(response);
                    for(int i=0;i<jsonArray.length();i++){
                        JSONObject jsonObject = jsonArray.getJSONObject(i);

                        int id = jsonObject.getInt("id");
                        String name = jsonObject.getString("mobile_name");
                        String price = jsonObject.getString("mobile_price");
                        String description = jsonObject.getString("mobile_description");

                        View_Model model = new View_Model();
                        model.setId(id);
                        model.setName(name);
                        model.setPrice(price);
                        model.setDescription(description);
                        list.add(model);
                    }
                }
                catch (JSONException e){
                    e.printStackTrace();
                }

                MyAdapter myAdapter = new MyAdapter(View_Activity.this,list);
                listView.setAdapter(myAdapter);
            }
        },new Response.ErrorListener(){

            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(View_Activity.this,"No Internet", Toast.LENGTH_SHORT).show();
            }
        });

        RequestQueue queue = Volley.newRequestQueue(View_Activity.this);
        queue.add(stringRequest);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){

        MenuItem m1 = menu.add(0,1,0,"update");
        MenuItem m2 = menu.add(0,2,0,"delete");

        super.onCreateContextMenu(menu,v,menuInfo);
    }

    public boolean onContextItemSelected(MenuItem item){

        AdapterView.AdapterContextMenuInfo acm = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        int id = acm.position;

        switch(item.getItemId()){
            case 1:
                View_Model model = list.get(id);
                Intent i = new Intent(View_Activity.this,Update_Activity.class);
                i.putExtra("id",String.valueOf(model.getId()));
                i.putExtra("price",model.getPrice());
                i.putExtra("name",model.getName());
                i.putExtra("des",model.getDescription());
                startActivity(i);
                break;

            case 2:
                View_Model model2 = list.get(id);

                final String Id = String.valueOf(model2.getId());

                AlertDialog.Builder alert = new AlertDialog.Builder(View_Activity.this);
                alert.setTitle("Are you sure you want to delete?");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL.Delete_data, new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                Toast.makeText(View_Activity.this, "deleted", Toast.LENGTH_SHORT).show();

                                startActivity(new Intent(View_Activity.this, View_Activity.class));
                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(View_Activity.this,"No Internet",Toast.LENGTH_LONG).show();
                            }
                        })
                        {
                            protected Map<String ,String> getParams() throws AuthFailureError {
                                HashMap map = new HashMap();
                                map.put("id",Id);
                                return map;
                            }
                        };

                        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
                        queue.add(stringRequest);
                    }
                });

                alert.setNegativeButton("No", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                alert.show();
                break;

        }
        return super.onContextItemSelected(item);
    };
}