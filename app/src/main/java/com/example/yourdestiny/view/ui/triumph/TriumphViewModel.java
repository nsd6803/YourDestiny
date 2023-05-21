package com.example.yourdestiny.view.ui.triumph;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TriumphViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TriumphViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}