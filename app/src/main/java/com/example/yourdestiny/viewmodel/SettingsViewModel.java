package com.example.yourdestiny.viewmodel;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import com.example.yourdestiny.model.Repository;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

public class SettingsViewModel extends ViewModel {
    Context context;
    public Repository repository;
    FirebaseUser user;
    public SettingsViewModel(Context applicationContext) {
        user = FirebaseAuth.getInstance().getCurrentUser();
        context =  applicationContext;
        repository = new Repository(context);
    }

    public void deleteProfile(){
        repository.delete_data();
    }

    public String getName(){
        return repository.getName_p();
    }

    public String getMail(){
        return repository.getMail_p();
    }

    public String getPass(){
        return repository.getPass_p();
    }

    public void changeName(String name){
        UserProfileChangeRequest profileUpdates = new UserProfileChangeRequest.Builder()
                .setDisplayName(getName())
                .build();

        user.updateProfile(profileUpdates)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            // Имя аккаунта успешно обновлено
                        } else {
                            // Возникла ошибка при обновлении имени аккаунта
                        }
                    }
                });
    }
    public int changeMail(String mail){
        final int[] resultt = {0};
        user.updateEmail(mail)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    int result = 0;
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            // Почта успешно обновлена
                        } else {
                            Toast.makeText(context.getApplicationContext(), "Такая почта уже есть", Toast.LENGTH_SHORT).show();
                            result = 1;
                            resultt[0] = result;
                        }
                    }
                });
        return resultt[0];
    }
    public void changePass(String pass){
        user.updatePassword(pass)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            // Пароль успешно обновлен
                        } else {
                            // Возникла ошибка при обновлении пароля
                        }
                    }
                });
    }
}