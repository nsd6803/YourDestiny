package com.example.yourdestiny.model.profileDB;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Profile {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "mail")
    public String mail;

    @ColumnInfo(name = "password")
    public String password;



    public Profile(String names, String mail, String password) {
        this.name = names;
        this.mail = mail;
        this.password = password;

    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public Profile() {
    }
}