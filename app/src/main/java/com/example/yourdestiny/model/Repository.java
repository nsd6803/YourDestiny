package com.example.yourdestiny.model;

import android.content.Context;

import androidx.room.Room;

import com.example.yourdestiny.model.guidesDB.Guide;
import com.example.yourdestiny.model.guidesDB.GuideDao;
import com.example.yourdestiny.model.guidesDB.GuidesDatabase;
import com.example.yourdestiny.model.guidesDB.GuidesInfo;
import com.example.yourdestiny.model.weaponDB.Weapon;
import com.example.yourdestiny.model.weaponDB.WeaponDao;
import com.example.yourdestiny.model.weaponDB.WeaponDatabase;
import com.example.yourdestiny.model.weaponDB.WeaponInfo;

import java.util.List;

public class Repository {
    public GuidesInfo guidesInfo;
    public GuidesDatabase db = null;
    public GuideDao guideDao = null;
    public List<Guide> guides = null;

    public WeaponInfo weaponInfo;
    public WeaponDatabase db_W = null;
    public WeaponDao weaponDao = null;
    public List<Weapon> weapons = null;

    public Repository(Context context) {
        db = Room.databaseBuilder(context.getApplicationContext(),
                GuidesDatabase.class, "Guides").allowMainThreadQueries().build();
        guideDao = db.guideDao();
        guides = db.guideDao().getAll();
        guidesInfo = new GuidesInfo();

        db_W = Room.databaseBuilder(context.getApplicationContext(),
                WeaponDatabase.class, "Weapon").allowMainThreadQueries().build();
        weaponDao = db_W.weaponDao();
        weapons = db_W.weaponDao().getAll();
        weaponInfo = new WeaponInfo();
    }

    public int check(){
        return db.guideDao().getRowCount();
    }

    public int check_w(){
        return db_W.weaponDao().getRowCount();
    }

    public Guide getInfo(String name){ return db.guideDao().getActivity(name);}

    public Weapon getInfo_w(String name){ return db_W.weaponDao().getActivity(name);}
}
