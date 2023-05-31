package com.example.yourdestiny.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface GuideDao {
    @Query("SELECT * FROM Guide")
    List<Guide> getAll();


    @Query("SELECt COUNT(*) FROM Guide")
    int getRowCount();
    @Insert
    void insertAll(Guide... users);
}