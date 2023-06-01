package com.example.yourdestiny.model.weaponDB;

import com.example.yourdestiny.R;

public class WeaponInfo {
    private String[] Name = {"Пиковый Туз"};
    private String[] Type = {"Револьвер"};
    private String[] Element = {"Кинетическое"};
    private int[] Pic = {R.drawable.weapon_spades_sq};
    private int[] Pic_back = {R.drawable.weapon_spades};
    private String[] Predicat = {"У меня всегда есть козырь в рукаве - Кейд-6"};
    private String[][] Stats = {{"84","75","40","40","42","70","14","140","13"}};
    private String[] Rare = {"Экзотическое"};
    private int[] Exotic_pic = {R.drawable.memento};
    private String[] Exotic_title = {"Мементо Мори"};
    private String[] Exotic_descrypt = {"Перезарядка после убийства пополняет магазин пулями, которые наносят дополнительный урон. Включает радар во время прицеливания."};

    public String getName(int count){
        return Name[count];
    }
    public String getType(int count) {
        return Type[count];
    }

    public String getElement(int count) {
        return Element[count];
    }

    public int getPic(int count) {
        return Pic[count];
    }

    public int getPic_back(int count) {
        return Pic_back[count];
    }

    public String getPredicat(int count) {
        return Predicat[count];
    }

    public String[] getStats(int count) {
        return Stats[count];
    }

    public String getRare(int count) {
        return Rare[count];
    }

    public int getExotic_pic(int count) {
        return Exotic_pic[count];
    }

    public String getExotic_title(int count) {
        return Exotic_title[count];
    }

    public String getExotic_descrypt(int count) {
        return Exotic_descrypt[count];
    }

    public String[] getName() {
        return Name;
    }
}
