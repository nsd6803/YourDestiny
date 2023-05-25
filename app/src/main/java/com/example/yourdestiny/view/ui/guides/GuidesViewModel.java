package com.example.yourdestiny.view.ui.guides;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GuidesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    String mURL = "https://www.kindpng.com/picc/m/151-1510254_destiny-2-hunter-png-transparent-png.png";
    ExecutorService executorService = Executors.newFixedThreadPool(5);

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

    public LiveData<Bitmap> getBitmap(){
        return bitmap;
    }
    public void execute(){
        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 11; i++) {
                        value.postValue(i);
                        TimeUnit.MILLISECONDS.sleep(100);
                    }
                    URL url = new
                            URL("https://www.freepnglogos.com/uploads/download-destiny-logo/destiny-2-logo-hd-picture-png-13.png");
                    bitmap.postValue(BitmapFactory.
                            decodeStream((InputStream)url.getContent()));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };
        executorService.submit(runnable);
    }
    public void close_executor(){
        // Завершаем работу ExecutorService
        executorService.shutdown();
        try{
            if (!executorService.awaitTermination(500, TimeUnit.MILLISECONDS)){
                executorService.shutdownNow();
            }
        } catch (InterruptedException e){
            executorService.shutdownNow();
        }
        System.out.println("it's close");
    }

}