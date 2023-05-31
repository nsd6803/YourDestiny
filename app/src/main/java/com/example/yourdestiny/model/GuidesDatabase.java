package com.example.yourdestiny.model;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {Guide.class}, version = 1)
@TypeConverters(Encounter.class)
public abstract class GuidesDatabase extends RoomDatabase {
    public abstract GuideDao guideDao();
}
