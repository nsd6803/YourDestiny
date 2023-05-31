package com.example.yourdestiny.view.ui.guides;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.yourdestiny.model.Guide;
import com.example.yourdestiny.model.Repository;

public class GameActivityViewModel extends ViewModel {
    Context context;
    Repository repository;
    public GameActivityViewModel(Context context) {
        this.context = context;
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
    }
}
