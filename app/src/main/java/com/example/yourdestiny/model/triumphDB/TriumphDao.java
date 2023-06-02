package com.example.yourdestiny.model.triumphDB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TriumphDao {
    @Query("SELECT * FROM Triumph")
    List<Triumph> getAll();


    @Query("SELECT COUNT(*) FROM Triumph")
    int getRowCount();

    @Query("SELECT * FROM Triumph WHERE name LIKE :name")
    Triumph getTriumph(String name);

    @Query("UPDATE Triumph set isChecked = :triumph WHERE name LIKE :name")
    void UpdateTriumph(List<String> triumph, String name);

    @Insert
    void insertAll(Triumph... users);
}