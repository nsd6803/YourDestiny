package com.example.yourdestiny.viewmodel;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.yourdestiny.model.Repository;
import com.example.yourdestiny.model.weaponDB.Weapon;

import java.util.List;

public class WeaponViewModel extends ViewModel {
    Context context;
    Repository repository;
    public WeaponViewModel(Context applicationContext) {
        context =  applicationContext;
        repository = new Repository(context);
    }

    public List<Weapon> getExotic(){
        return repository.weaponDao.getExotic();
    }

    public List<Weapon> getLegenadry(){
        return repository.weaponDao.getLegendary();
    }

}
