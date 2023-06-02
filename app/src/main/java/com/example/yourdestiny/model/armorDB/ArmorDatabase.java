package com.example.yourdestiny.model.armorDB;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Armor.class}, version = 1)
public abstract class ArmorDatabase extends RoomDatabase {
    public abstract ArmorDao armorDao();
}
