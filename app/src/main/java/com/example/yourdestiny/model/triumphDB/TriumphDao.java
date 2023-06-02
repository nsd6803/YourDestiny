package com.example.yourdestiny.model.triumphDB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TriumphDao {
    @Query("SELECT * FROM Triumph")
    List<Triumph> getAll();


    @Query("SELECT COUNT(*) FROM Triumph")
    int getRowCount();

    @Query("SELECT * FROM Triumph WHERE name LIKE :name")
    Triumph getTriumph(String name);

    @Update
    void UpdateTriumph(Triumph triumph);

    @Insert
    void insertAll(Triumph... users);
}