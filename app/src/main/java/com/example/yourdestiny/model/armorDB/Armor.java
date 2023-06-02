package com.example.yourdestiny.model.armorDB;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class  Armor {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "type")
    public String type;

    @ColumnInfo(name = "pic")
    public int pic;

    @ColumnInfo(name = "back_pic")
    public int back_pic;

    @ColumnInfo(name = "predicat")
    public String predicat;


    @ColumnInfo(name = "exotic_pic")
    public int exotic_pic;


    @ColumnInfo(name = "exotic_title")
    public String exotic_title;

    @ColumnInfo(name = "exotic_descrypt")
    public String exotic_descrypt;

    @ColumnInfo(name = "lore")
    public String lore;

    @ColumnInfo(name = "for_class")
    public String for_class;

    @ColumnInfo(name = "for_subclass")
    public String for_subclass;

    @ColumnInfo(name = "for_activity")
    public String for_activity;

    @ColumnInfo(name = "neww")
    public String neww;

    public Armor(String name, String type, int pic, int back_pic, String predicat,
                 int exotic_pic, String exotic_title, String exotic_descrypt, String lore, String for_class, String for_subclass, String for_activity, String neww) {
        this.name = name;
        this.type = type;

        this.pic = pic;
        this.back_pic = back_pic;
        this.predicat = predicat;
        this.exotic_pic = exotic_pic;
        this.exotic_title = exotic_title;
        this.exotic_descrypt = exotic_descrypt;
        this.lore = lore;
        this.for_class = for_class;
        this.for_subclass = for_subclass;
        this.for_activity = for_activity;
        this.neww = neww;
    }

    public Armor() {
    }

    public String getLore(){
        return lore;
    }

    public String getClas(){
        return for_class;
    }

    public String getSubclass(){
        return for_subclass;
    }

    public String getActivity(){
        return for_activity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }


    public int getPic() {
        return pic;
    }

    public int getBack_pic() {
        return back_pic;
    }

    public String getPredicat() {
        return predicat;
    }


    public int getExotic_pic() {
        return exotic_pic;
    }

    public String getExotic_title() {
        return exotic_title;
    }

    public String getExotic_descrypt() {
        return exotic_descrypt;
    }

    public String gerNeww(){return neww;}
}
