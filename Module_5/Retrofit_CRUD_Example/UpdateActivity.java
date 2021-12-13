package com.example.retrofit_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UpdateActivity extends AppCompatActivity {

    String id,name,desc,price,quantity;
    EditText nametext,destext,pricetext,quantitytext;
    Button updateButton;
    ApiInterface api;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        id = String.valueOf(getIntent().getIntExtra("id",0));
        name = getIntent().getStringExtra("name");
        desc = getIntent().getStringExtra("desc");
        price = getIntent().getStringExtra("price");
        quantity = getIntent().getStringExtra("quantity");

        nametext = findViewById(R.id.updatetext1);
        destext = findViewById(R.id.updatetext2);
        pricetext = findViewById(R.id.updatetext3);
        quantitytext = findViewById(R.id.updatetext4);
        updateButton = findViewById(R.id.btn2);

        nametext.setText(name);
        destext.setText(desc);
        quantitytext.setText(quantity);
        pricetext.setText(price);

        updateButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                api = API_Clinte.getApiClient().create(ApiInterface.class);
                Call<Model> call = api.updateNote(id,nametext.getText().toString(),pricetext.getText().toString(),
                                    destext.getText().toString(),quantitytext.getText().toString());

                call.enqueue(new Callback<Model>(){
                    @Override
                    public void onResponse(Call<Model> call, Response<Model> response) {

                    }

                    @Override
                    public void onFailure(Call<Model> call, Throwable t) {

                    }
                });
                startActivity(new Intent(UpdateActivity.this,ViewActivity.class));
            }
        });

    }
}