package com.example.yourdestiny.view.ui.collection.Weapon;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.yourdestiny.model.Repository;
import com.example.yourdestiny.model.weaponDB.Weapon;

public class WeaponEViewModel extends ViewModel {
    Context context;
    Repository repository;
    public WeaponEViewModel(Context applicationContext) {
        context =  applicationContext;
        repository = new Repository(context);
    }

    public Weapon getWeaponInfo(String name){
        return repository.weaponDao.getWeapon(name);
    }
}
