package com.example.realem_db_example;

import io.realm.RealmObject;

public class Model_Class extends RealmObject {

    String name,pass;
    int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public int getId() {
        return id;
    }
}
