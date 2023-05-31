package com.example.yourdestiny.view.ui.guides;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.yourdestiny.model.Repository;

public class ActivityCardViewModel extends ViewModel {

    Repository repository;
    Context context;
    public ActivityCardViewModel(Context context) {
        this.context = context;
        repository = new Repository(context);
    }


    public void  check(){
        int count = repository.check();
        Log.d("HEYYYY", String.valueOf(count));
    }
}
