package com.example.xml_parsing_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class SAX_Exmaple_Activity extends AppCompatActivity {

    Button btn;
    ListView listView;
    List<Employee> employees = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_a_x__exmaple_);
        listView = findViewById(R.id.list);
        btn = findViewById(R.id.btnparse);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                try{
                    employees = SAXXMLParser.parse(getAssets().open("employees.xml"));
                    ArrayAdapter<Employee> adapter = new ArrayAdapter<Employee>(SAX_Exmaple_Activity.this,android.R.layout.simple_list_item_1,employees);
                    listView.setAdapter(adapter);
                    listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                            Employee employee = (Employee) adapterView.getItemAtPosition(i);
                            Toast.makeText(adapterView.getContext(), employee.getDetails(),Toast.LENGTH_LONG).show();
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}