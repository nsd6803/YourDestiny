package com.example.yourdestiny.view;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.yourdestiny.R;
import com.example.yourdestiny.model.profileDB.Profile;
import com.example.yourdestiny.viewmodel.MainActivityViewModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    MainActivityViewModel mainActivityViewModel;
    FirebaseAuth mAuth;
    EditText nickname;
    EditText passwrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivityViewModel = new MainActivityViewModel(getApplicationContext());

        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        if (prefs.getBoolean("isFirstRun", true)) {
            Intent myIntent = new Intent(MainActivity.this, OnBoarding.class);
            MainActivity.this.startActivity(myIntent);
        }

        prefs.edit().putBoolean("isFirstRun", false).apply();
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.INTERNET}, 1);
        }
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_main);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );



        mAuth = FirebaseAuth.getInstance();
        nickname = findViewById(R.id.editTextTextPersonName);
        passwrd = findViewById(R.id.editTextTextPassword);

        TextView registr = findViewById(R.id.textView5);
        registr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Intent intent = new Intent(arg.getContext(), SignUp.class);
                arg.getContext().startActivity(intent);
            }
        });

        TextView pass = findViewById(R.id.textView2);
        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Intent intent = new Intent(arg.getContext(), PassRestore.class);
                arg.getContext().startActivity(intent);
            }
        });

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg) {
                    String nickname_ = nickname.getText().toString();
                    String pass_ = passwrd.getText().toString();
                    Log.d("PASSWORD", pass_);
                    if(TextUtils.isEmpty(nickname_)){
                        Toast.makeText(MainActivity.this, "Введите имя", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(TextUtils.isEmpty(pass_)){
                        Toast.makeText(MainActivity.this, "Введите пароль", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    mAuth.signInWithEmailAndPassword(nickname_, pass_)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                                user.getDisplayName().toString();
                                mainActivityViewModel.repository.db_P.profileDao().DeleteProfile();
                                Profile profile = new Profile(user.getDisplayName().toString(), nickname_, pass_);
                                mainActivityViewModel.repository.db_P.profileDao().insertAll(profile);
                                mainActivityViewModel.refillTriumph();
                                Intent intent = new Intent(arg.getContext(), AppActivity.class);
                                intent.putExtra("nickname", user.getDisplayName().toString());
                                arg.getContext().startActivity(intent);
                                finish();
                            } else {

                                Toast.makeText(MainActivity.this, "Ошибка",
                                        Toast.LENGTH_SHORT).show();

                            }
                        }
                    });
                }
            });

        ImageView imageView = findViewById(R.id.to_OB);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Intent intent = new Intent(arg.getContext(), OnBoarding.class);
                arg.getContext().startActivity(intent);
            }
        });
    }
}