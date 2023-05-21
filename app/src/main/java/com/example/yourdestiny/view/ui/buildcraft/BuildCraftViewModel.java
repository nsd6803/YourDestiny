package com.example.yourdestiny.view.ui.buildcraft;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BuildCraftViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BuildCraftViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is buildcraft fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}