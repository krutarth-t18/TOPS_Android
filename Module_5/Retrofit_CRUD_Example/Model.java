package com.example.retrofit_crud;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Model {

    @Expose
    @SerializedName("id")
    private int id;

    @Expose
    @SerializedName("product_name")
    private String product_name;

    @Expose
    @SerializedName("product_price")
    private String product_price;

    @Expose
    @SerializedName("product_description")
    private String product_description;

    @Expose
    @SerializedName("product_quantity")
    private String product_quantity;

    @Expose
    @SerializedName("success")
    private Boolean success;

    @Expose
    @SerializedName("message")
    private String message;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public String getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(String product_quantity) {
        this.product_quantity = product_quantity;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
