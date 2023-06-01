package com.example.yourdestiny.model.guidesDB;

import androidx.room.TypeConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Encounter {
    @TypeConverter
    public static List<String> fromString(String value) {
        return new ArrayList<>(Arrays.asList(value.split(",")));
    }

    @TypeConverter
    public static String fromList(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String item : list) {
            sb.append(item);
            sb.append(",");
        }
        return sb.toString();
    }
}
