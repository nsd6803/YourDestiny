package com.example.yourdestiny.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Arrays;
import java.util.List;

@Entity
public class Guide {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "predicat")
    public String predicat;

    @ColumnInfo(name = "difficulty")
    public int difficulty;

    @ColumnInfo(name = "guide_pic")
    public int guide_pic;


    @ColumnInfo(name = "encounters")
    public List<String> encounters;

    @ColumnInfo(name = "encounters_descript")
    public List<String> encounters_descript;

    public Guide(String names, String predicat, int difficult, int guide_pic, String[] encounters, String[] encounters_descript) {
        this.name = names;
        this.predicat = predicat;
        this.difficulty = difficult;
        this.guide_pic = guide_pic;
        this.encounters = Arrays.asList(encounters);
        this.encounters_descript = Arrays.asList(encounters_descript);
        
    }

    public String getName() {
        return name;
    }

    public String getPredicat() {
        return predicat;
    }

    public String getDifficulty() {
        return String.valueOf(difficulty);
    }

    public int getGuide_pic() {
        return guide_pic;
    }

    public List<String> getEncounters() {
        return encounters;
    }

    public List<String> getEncounters_descript() {
        return encounters_descript;
    }

    public Guide() {
    }
}