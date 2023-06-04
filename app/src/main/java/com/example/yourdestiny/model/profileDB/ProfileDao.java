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

    @Query("SELECT name FROM Profile LIMIT 1")
    String getName();

    @Query("SELECT mail FROM Profile LIMIT 1")
    String getMail();

    @Query("SELECT password FROM Profile LIMIT 1")
    String getPassword();

    @Query("UPDATE Profile SET name=:name")
    void setName(String name);

    @Query("UPDATE Profile SET mail=:mail")
    void setMail(String mail);

    @Query("UPDATE Profile SET password=:pass")
    void setPassword(String pass);

    @Query("DELETE FROM Profile")
    void DeleteProfile();

    @Insert
    void insertAll(Profile... users);


}