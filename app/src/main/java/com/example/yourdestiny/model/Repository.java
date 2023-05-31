package com.example.yourdestiny.model;

import android.content.Context;

import androidx.room.Room;

import java.util.List;

public class Repository {
    public GuidesInfo guidesInfo;
    public GuidesDatabase db = null;
    public GuideDao guideDao = null;
    public List<Guide> guides = null;

    public Repository(Context context) {
        db = Room.databaseBuilder(context.getApplicationContext(),
                GuidesDatabase.class, "Guides").allowMainThreadQueries().build();
        guideDao = db.guideDao();
        guides = db.guideDao().getAll();
        guidesInfo = new GuidesInfo();
    }

    public int check(){
        return db.guideDao().getRowCount();
    }


}
