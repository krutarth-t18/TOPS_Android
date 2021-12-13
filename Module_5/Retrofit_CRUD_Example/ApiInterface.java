package com.example.retrofit_crud;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("insert.php")
    Call<Model> saveNote(
            @Field("product_name") String product_name,
            @Field("product_price") String product_price,
            @Field("product_description") String product_description,
            @Field("product_quantity") String product_quantity
    );

    @GET("view.php")
    Call <List<Model>> getNotes();


    @FormUrlEncoded
    @POST("update.php")
    Call<Model> updateNote(
            @Field("id") String id,
            @Field("product_name") String product_name,
            @Field("product_price") String product_price,
            @Field("product_description") String product_description,
            @Field("product_quantity") String product_quantity
    );

    @FormUrlEncoded
    @POST("delete.php")
    Call<Model> deleteNote(@Field("id") int id);

    }
