package com.example.yourdestiny.viewmodel;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.yourdestiny.model.Repository;
import com.example.yourdestiny.model.armorDB.Armor;
import com.example.yourdestiny.model.weaponDB.Weapon;

import java.util.List;

public class NewVieModel extends ViewModel {
    Context context;
    Repository repository;
    public NewVieModel(Context applicationContext) {
        context =  applicationContext;
        repository = new Repository(context);
    }

    public List<Armor> getNewArmor(){
        return repository.armorDao.getNeww();
    }

    public List<Weapon> getNewWeapon(){
        return repository.weaponDao.getNeww();
    }
}