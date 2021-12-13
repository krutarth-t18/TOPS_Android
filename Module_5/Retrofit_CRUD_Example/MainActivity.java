package com.example.retrofit_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2, edt3,edt4;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edttext1);
        edt2 = findViewById(R.id.edttext2);
        edt3 = findViewById(R.id.edttext3);
        edt4 = findViewById(R.id.edttext4);
        register  =findViewById(R.id.btn1);

        register.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String name = edt1.getText().toString();
                String price = edt2.getText().toString();
                String des = edt3.getText().toString();
                String quantity = edt4.getText().toString();

                ApiInterface api = API_Clinte.getApiClient().create(ApiInterface.class);

                Call<Model> call = api.saveNote(name,price,des,quantity);
                call.enqueue(new Callback<Model>(){

                    @Override
                    public void onResponse(Call<Model> call, Response<Model> response) {
                        String result = String.valueOf(response.body());
                        Toast.makeText(MainActivity.this,"product added"+result, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Model> call, Throwable t) {
                        startActivity(new Intent(MainActivity.this,ViewActivity.class));
                    }
                });
            }
        });
    }
}