package com.example.yourdestiny.model.weaponDB;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {Weapon.class}, version = 1)
@TypeConverters(Stats.class)
public abstract class WeaponDatabase extends RoomDatabase {
    public abstract WeaponDao weaponDao();
}
