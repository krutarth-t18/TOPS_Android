package com.example.room_db_example.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.room_db_example.dao.DaoInterface;
import com.example.room_db_example.entity.User;

@Database(entities = User.class,version = 2)
public abstract class Database_class extends RoomDatabase {
    public abstract DaoInterface daoInterface();

}
