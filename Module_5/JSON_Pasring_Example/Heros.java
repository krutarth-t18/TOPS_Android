package com.example.json_parsing_example;

public class Heros {
    String name,imgurl;

    public Heros(String name, String imgurl){
        this.name = name;
        this.imgurl = imgurl;
    }

    public String getName() {
        return name;
    }

    public String getImgurl() {
        return imgurl;
    }
}
