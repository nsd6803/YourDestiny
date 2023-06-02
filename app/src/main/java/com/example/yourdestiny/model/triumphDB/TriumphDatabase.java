package com.example.yourdestiny.model.triumphDB;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {Triumph.class}, version = 1)
@TypeConverters(TriumphChecked.class)
public abstract class TriumphDatabase extends RoomDatabase {
    public abstract TriumphDao triumphDao();
}
