package com.example.yourdestiny.viewmodel;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.yourdestiny.model.Repository;
import com.example.yourdestiny.model.armorDB.Armor;
import com.example.yourdestiny.model.weaponDB.Weapon;

import java.util.List;

public class BuildCraftResultViewModel extends ViewModel {

    Context context;
    Repository repository;
    public BuildCraftResultViewModel(Context applicationContext) {
        context =  applicationContext;
        repository = new Repository(context);
    }

    public List<Weapon> getWeapon(String clas, String subclass, String activity){
        return repository.weaponDao.getWeaponForBuildCraft(clas, subclass, activity);
    }

    public List<Armor> getArmor(String clas, String subclass, String activity){
        return repository.armorDao.getArmorForBuildCraft(clas, subclass, activity);
    }

}
