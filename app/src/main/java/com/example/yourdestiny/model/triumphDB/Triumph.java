package com.example.yourdestiny.model.triumphDB;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Arrays;
import java.util.List;

@Entity
public class Triumph {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "description")
    public List<String> description;

    @ColumnInfo(name = "isChecked")
    public List<String> isChecked;



    public Triumph(String names, String[] description, String[] isChecked) {
        this.name = names;
        this.description = Arrays.asList(description);
        this.isChecked = Arrays.asList(isChecked);
    }

    public String getName() {
        return name;
    }

    public List<String> getDescription() {
        return description;
    }

    public List<String> getIsChecked() {
        return isChecked;
    }



    public Triumph() {
    }
}