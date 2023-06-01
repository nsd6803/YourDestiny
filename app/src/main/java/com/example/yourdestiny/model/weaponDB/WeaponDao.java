package com.example.yourdestiny.model.weaponDB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WeaponDao {
    @Query("SELECT * FROM Weapon")
    List<Weapon> getAll();


    @Query("SELECT COUNT(*) FROM Weapon")
    int getRowCount();

    @Query("SELECT * FROM Weapon WHERE name LIKE :name")
    Weapon getActivity(String name);

    @Query("SELECT rare FROM Weapon WHERE name LIKE :name")
    String isExotic(String name);

    @Insert
    void insertAll(Weapon... users);
}