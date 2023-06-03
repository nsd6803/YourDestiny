package com.example.yourdestiny.view.ui.profile;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.yourdestiny.model.Repository;

public class SettingsViewModel extends ViewModel {
    Context context;
    Repository repository;
    public SettingsViewModel(Context applicationContext) {
        context =  applicationContext;
        repository = new Repository(context);
    }

    public void deleteProfile(){
        repository.delete_data();
    }

}