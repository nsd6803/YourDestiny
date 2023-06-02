package com.example.yourdestiny.model.triumphDB;

public class TriumphInfo {
    private String[] Names = {};
    private String[][] Descriptions = {};
    private String[][] isChecked = {};

    public String getNames(int count) {
        return Names[count];
    }

    public String[] getNames() {
        return Names;
    }

    public String[] getDesctuptions(int count) {
        return Descriptions[count];
    }

    public String[] getIsChecked(int count) {
        return isChecked[count];
    }
}
