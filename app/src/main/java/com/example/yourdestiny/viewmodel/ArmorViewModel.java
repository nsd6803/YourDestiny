package com.example.yourdestiny.viewmodel;

import android.content.Context;

import com.example.yourdestiny.model.Repository;
import com.example.yourdestiny.model.armorDB.Armor;

import java.util.List;

public class ArmorViewModel {
    Context context;
    Repository repository;
    public ArmorViewModel(Context applicationContext) {
        this.context = applicationContext;
        repository = new Repository(context);
    }


    public List<Armor> getHunter(){
        return repository.armorDao.getHunter();
    }

    public List<Armor> getTitan(){
        return repository.armorDao.getTitan();
    }

    public List<Armor> getWarlock(){
        return repository.armorDao.getWarlock();
    }

}
