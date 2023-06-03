package com.example.yourdestiny.model.profileDB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ProfileDao {
    @Query("SELECT * FROM Profile")
    List<Profile> getAll();


    @Query("SELECT COUNT(*) FROM Profile")
    int getRowCount();

    @Query("SELECT * FROM Profile WHERE name LIKE :name")
    Profile getAll(String name);

    @Query("SELECT name FROM Profile WHERE uid LIKE 1")
    String getName();

    @Query("SELECT mail FROM Profile WHERE uid LIKE 1")
    String getMail();

    @Query("SELECT password FROM Profile WHERE uid LIKE 1")
    String getPassword();

    @Query("DELETE FROM Profile")
    void DeleteProfile();

    @Insert
    void insertAll(Profile... users);


}