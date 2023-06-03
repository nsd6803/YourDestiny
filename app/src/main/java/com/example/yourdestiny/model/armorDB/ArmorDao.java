package com.example.yourdestiny.model.armorDB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ArmorDao {
    @Query("SELECT * FROM Armor")
    List<Armor> getAll();


    @Query("SELECT COUNT(*) FROM Armor")
    int getRowCount();

    @Query("SELECT * FROM Armor WHERE name LIKE :name")
    Armor getArmor(String name);


    @Query("SELECT * FROM Armor WHERE for_class LIKE 'Охотник'")
    List<Armor> getHunter();

    @Query("SELECT * FROM Armor WHERE for_class LIKE 'Титан'")
    List<Armor> getTitan();

    @Query("SELECT * FROM Armor WHERE for_class LIKE 'Варлок'")
    List<Armor> getWarlock();

    @Query("SELECT * FROM Armor WHERE neww LIKE 'Новое'")
    List<Armor> getNeww();

    @Query("SELECT * FROM Armor WHERE for_class LIKE :clas AND for_subclass LIKE :subclass AND for_activity LIKE :activity")
    List<Armor> getArmorForBuildCraft(String clas, String subclass, String activity);

    @Insert
    void insertAll(Armor... users);
}