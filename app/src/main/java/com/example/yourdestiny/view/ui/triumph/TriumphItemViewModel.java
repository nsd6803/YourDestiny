package com.example.yourdestiny.view.ui.triumph;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.yourdestiny.model.Repository;
import com.example.yourdestiny.model.triumphDB.Triumph;

public class TriumphItemViewModel extends ViewModel {
    Context context;
    Repository repository;

    String name_triumph;

    public TriumphItemViewModel(Context applicationContext, String name_triumph) {
        context =  applicationContext;
        this.name_triumph = name_triumph;
        repository = new Repository(context);
    }

    public Triumph getTriumphs(){
        return repository.triumphDao.getTriumph(name_triumph);
    }



}
