package com.example.yourdestiny.viewmodel;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.yourdestiny.model.Repository;
import com.example.yourdestiny.model.weaponDB.Weapon;

public class WeaponLViewModel extends ViewModel {
    Context context;
    Repository repository;

    public WeaponLViewModel(Context applicationContext) {
        context = applicationContext;
        repository = new Repository(context);
    }

    public Weapon getWeaponInfo(String name) {
        return repository.weaponDao.getWeapon(name);
    }
}
