package com.example.yourdestiny.view.ui.guides.ActivityCard;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.yourdestiny.model.guidesDB.Guide;
import com.example.yourdestiny.model.Repository;

public class ActivityCardViewModel extends ViewModel {

    Repository repository;
    Context context;
    public ActivityCardViewModel(Context context) {
        this.context = context;
        repository = new Repository(context);
    }


    public Guide getActivityInfo(String name){
        Guide info = repository.getInfo(name);
        String predicat = info.getPredicat();
        Log.d("Predicat", predicat);
        return info;
    }
}
