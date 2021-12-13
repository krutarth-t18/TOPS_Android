package com.example.room_db_example.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.room_db_example.entity.User;

import java.util.List;

@Dao
public interface DaoInterface {
    @Insert
    public void adduser(User user);

    @Query("select * from tops")
    public List<User> getUsers();

    @Update
    public void updateuser(User user);

    @Delete
    public void deleteuser(User user);
}
