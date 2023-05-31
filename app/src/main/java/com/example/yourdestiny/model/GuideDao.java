package com.example.yourdestiny.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface GuideDao {
    @Query("SELECT * FROM Guide")
    List<Guide> getAll();


    @Query("SELECT COUNT(*) FROM Guide")
    int getRowCount();

    @Query("SELECT * FROM Guide WHERE name LIKE :name")
    Guide getActivity(String name);
    @Insert
    void insertAll(Guide... users);
}