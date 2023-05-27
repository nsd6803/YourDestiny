package com.example.yourdestiny.view.ui.guides;

import android.graphics.Bitmap;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GuidesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    private  MutableLiveData<Boolean> isStarted = new MutableLiveData<Boolean>(false);
    private MutableLiveData<Integer> value;
    MutableLiveData<Bitmap> bitmap = new MutableLiveData<>();
    public GuidesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is guides fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<Integer> getValue(){
        if(value == null){
            value = new MutableLiveData<Integer>(0);
        }
        return value;
    }



}