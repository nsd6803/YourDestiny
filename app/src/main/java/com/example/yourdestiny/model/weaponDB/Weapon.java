package com.example.yourdestiny.model.weaponDB;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Arrays;
import java.util.List;

@Entity
public class Weapon {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "type")
    public String type;

    @ColumnInfo(name = "element")
    public String element;

    @ColumnInfo(name = "pic")
    public int pic;

    @ColumnInfo(name = "back_pic")
    public int back_pic;

    @ColumnInfo(name = "predicat")
    public String predicat;

    @ColumnInfo(name = "stats")
    public List<String> stats;

    @ColumnInfo(name = "rare")
    public String rare;

    @ColumnInfo(name = "exotic_pic")
    public int exotic_pic;


    @ColumnInfo(name = "exotic_title")
    public String exotic_title;

    @ColumnInfo(name = "exotic_descrypt")
    public String exotic_descrypt;

    public Weapon(String name, String type, String element, int pic, int back_pic, String predicat, String[] stats, String rare, int exotic_pic, String exotic_title, String exotic_descrypt) {
        this.name = name;
        this.type = type;
        this.element = element;
        this.pic = pic;
        this.back_pic = back_pic;
        this.predicat = predicat;
        this.stats = Arrays.asList(stats);
        this.rare = rare;
        this.exotic_pic = exotic_pic;
        this.exotic_title = exotic_title;
        this.exotic_descrypt = exotic_descrypt;
    }

    public Weapon() {
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getElement() {
        return element;
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

    public List<String> getStats() {
        return stats;
    }

    public String getRare() {
        return rare;
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
}
