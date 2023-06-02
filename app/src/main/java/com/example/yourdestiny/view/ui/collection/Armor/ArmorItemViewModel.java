package com.example.yourdestiny.view.ui.collection.Armor;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.yourdestiny.model.Repository;
import com.example.yourdestiny.model.armorDB.Armor;

public class ArmorItemViewModel extends ViewModel {
    Context context;
    Repository repository;
    public ArmorItemViewModel(Context applicationContext) {
        context =  applicationContext;
        repository = new Repository(context);
    }

    public Armor getArmorInfo(String name){
        return repository.armorDao.getArmor(name);
    }
}