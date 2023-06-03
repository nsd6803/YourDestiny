package com.example.yourdestiny.view;

import android.content.Context;

import com.example.yourdestiny.model.Repository;
import com.example.yourdestiny.model.armorDB.Armor;
import com.example.yourdestiny.model.guidesDB.Guide;
import com.example.yourdestiny.model.triumphDB.Triumph;
import com.example.yourdestiny.model.weaponDB.Weapon;

public class MainActivityViewModel {
    Context context;
    Repository repository;
    public MainActivityViewModel(Context applicationContext) {
        context =  applicationContext;
        repository = new Repository(context);
        fillDataBase();
    }

    public void fillDataBase(){
        if(repository.check() == 0){
            for (int i= 0; i < repository.guidesInfo.getNames().length; i++){
                Guide guide = new Guide(
                        repository.guidesInfo.getNames(i),
                        repository.guidesInfo.getPredicat(i),
                        repository.guidesInfo.getDifficult(i),
                        repository.guidesInfo.getGuide_pic(i),
                        repository.guidesInfo.getEncounters(i),
                        repository.guidesInfo.getEncounters_descript(i)
                );
                repository.guideDao.insertAll(guide);
            }

        }
        if(repository.check_w() == 0){
            for (int i= 0; i < repository.weaponInfo.getName().length; i++){
                Weapon weapon = new Weapon(
                        repository.weaponInfo.getName(i),
                        repository.weaponInfo.getType(i),
                        repository.weaponInfo.getElement(i),
                        repository.weaponInfo.getPic(i),
                        repository.weaponInfo.getPic_back(i),
                        repository.weaponInfo.getPredicat(i),
                        repository.weaponInfo.getStats(i),
                        repository.weaponInfo.getRare(i),
                        repository.weaponInfo.getExotic_pic(i),
                        repository.weaponInfo.getExotic_title(i),
                        repository.weaponInfo.getExotic_descrypt(i),
                        repository.weaponInfo.getLore(i),
                        repository.weaponInfo.getClas(i),
                        repository.weaponInfo.getSubclas(i),
                        repository.weaponInfo.getActivityy(i),
                        repository.weaponInfo.getNeww(i)

                );
                repository.weaponDao.insertAll(weapon);
            }

        }

        if(repository.check_a() == 0){
            for (int i= 0; i < repository.armorInfo.getName().length; i++){
                Armor armor = new Armor(
                        repository.armorInfo.getName(i),
                        repository.armorInfo.getType(i),
                        repository.armorInfo.getPic(i),
                        repository.armorInfo.getPic_back(i),
                        repository.armorInfo.getPredicat(i),
                        repository.armorInfo.getExotic_pic(i),
                        repository.armorInfo.getExotic_title(i),
                        repository.armorInfo.getExotic_descrypt(i),
                        repository.armorInfo.getLore(i),
                        repository.armorInfo.getClas(i),
                        repository.armorInfo.getSubclas(i),
                        repository.armorInfo.getActivityy(i),
                        repository.armorInfo.getNeww(i)

                );
                repository.armorDao.insertAll(armor);
            }

        }

        if(repository.check_t() == 0){
            for (int i= 0; i < repository.triumphInfo.getNames().length; i++){
                Triumph triumph = new Triumph(
                        repository.triumphInfo.getNames(i),
                        repository.triumphInfo.getTitles(i),
                        repository.triumphInfo.getDesctuptions(i),
                        repository.triumphInfo.getIsChecked(i)

                );
                repository.triumphDao.insertAll(triumph);
            }

        }
    }

    public void refillTriumph(){
        repository.db_T.triumphDao().DeleteTriumoh();
        for (int i= 0; i < repository.triumphInfo.getNames().length; i++){
            Triumph triumph = new Triumph(
                    repository.triumphInfo.getNames(i),
                    repository.triumphInfo.getTitles(i),
                    repository.triumphInfo.getDesctuptions(i),
                    repository.triumphInfo.getIsChecked(i)

            );
            repository.triumphDao.insertAll(triumph);
        }
    }
}
