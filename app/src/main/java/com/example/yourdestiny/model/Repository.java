package com.example.yourdestiny.model;

import android.content.Context;

import androidx.room.Room;

import com.example.yourdestiny.model.armorDB.Armor;
import com.example.yourdestiny.model.armorDB.ArmorDao;
import com.example.yourdestiny.model.armorDB.ArmorDatabase;
import com.example.yourdestiny.model.armorDB.ArmorInfo;
import com.example.yourdestiny.model.guidesDB.Guide;
import com.example.yourdestiny.model.guidesDB.GuideDao;
import com.example.yourdestiny.model.guidesDB.GuidesDatabase;
import com.example.yourdestiny.model.guidesDB.GuidesInfo;
import com.example.yourdestiny.model.profileDB.Profile;
import com.example.yourdestiny.model.profileDB.ProfileDao;
import com.example.yourdestiny.model.profileDB.ProfileDatabase;
import com.example.yourdestiny.model.triumphDB.Triumph;
import com.example.yourdestiny.model.triumphDB.TriumphDao;
import com.example.yourdestiny.model.triumphDB.TriumphDatabase;
import com.example.yourdestiny.model.triumphDB.TriumphInfo;
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

    public ArmorInfo armorInfo;
    public ArmorDatabase db_A = null;
    public ArmorDao armorDao = null;
    public List<Armor> armors = null;

    public TriumphInfo triumphInfo;
    public TriumphDatabase db_T = null;
    public TriumphDao triumphDao = null;

    public List<Triumph> triumphs = null;


    public ProfileDatabase db_P = null;
    public ProfileDao profileDao = null;
    public List<Profile> profiles = null;

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

        db_A = Room.databaseBuilder(context.getApplicationContext(),
                ArmorDatabase.class, "Armor").allowMainThreadQueries().build();
        armorDao = db_A.armorDao();
        armors = db_A.armorDao().getAll();
        armorInfo = new ArmorInfo();


        db_T = Room.databaseBuilder(context.getApplicationContext(),
                TriumphDatabase.class, "Triumph").allowMainThreadQueries().build();
        triumphDao = db_T.triumphDao();
        triumphs = db_T.triumphDao().getAll();
        triumphInfo = new TriumphInfo();

        db_P = Room.databaseBuilder(context.getApplicationContext(),
                ProfileDatabase.class, "Profile").allowMainThreadQueries().build();
        profileDao = db_P.profileDao();
        profiles = db_P.profileDao().getAll();
    }

    public String getName_p(){
        return db_P.profileDao().getName();
    }
    public String getMail_p(){
        return db_P.profileDao().getMail();
    }
    public String getPass_p(){
        return db_P.profileDao().getPassword();
    }
    public void setName_p(String name){
         db_P.profileDao().setName(name);
    }
    public void setMail_p(String mail){
        db_P.profileDao().setMail(mail);
    }
    public void setPass_p(String pass){
        db_P.profileDao().setPassword(pass);
    }
    public void delete_data(){
        db_P.profileDao().DeleteProfile();
    }

    public int check(){
        return db.guideDao().getRowCount();
    }

    public int check_w(){
        return db_W.weaponDao().getRowCount();
    }

    public Guide getInfo(String name){ return db.guideDao().getActivity(name);}

    public Weapon getInfo_w(String name){ return db_W.weaponDao().getWeapon(name);}

    public int check_a(){
        return db_A.armorDao().getRowCount();
    }

    public Armor getInfo_a(String name){ return db_A.armorDao().getArmor(name);}

    public int check_t(){
        return db_T.triumphDao().getRowCount();
    }

    public Triumph getInfo_t(String name){ return db_T.triumphDao().getTriumph(name);}
}
