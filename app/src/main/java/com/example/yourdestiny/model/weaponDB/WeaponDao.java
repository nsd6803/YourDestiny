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
    Weapon getWeapon(String name);

    @Query("SELECT rare FROM Weapon WHERE name LIKE :name")
    String isExotic(String name);

    @Query("SELECT * FROM Weapon WHERE rare LIKE 'Экзотическое'")
    List<Weapon> getExotic();

    @Query("SELECT * FROM Weapon WHERE rare LIKE 'Легендарное'")
    List<Weapon> getLegendary();

    @Query("SELECT * FROM Weapon WHERE neww LIKE 'Новое'")
    List<Weapon> getNeww();
    @Insert
    void insertAll(Weapon... users);
}