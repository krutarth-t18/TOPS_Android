package com.example.room_db_example.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TOPS")
public class User {
    @PrimaryKey(autoGenerate = true)
    int id=0;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "email")
    private String email;

    public int getId(){ return id;}

    public String getName() {return name;}

    public String getEmail() {return email;}

    public void setId(int id) {this.id = id;}

    public void setName(String name) {this.name = name;}

    public void setEmail(String email) {
        this.email = email;
    }
}
