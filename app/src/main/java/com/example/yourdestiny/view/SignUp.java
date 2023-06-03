package com.example.yourdestiny.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.yourdestiny.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

public class SignUp extends AppCompatActivity {
    EditText name, email, pass, pass_confirm;
    Button register;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_sign_up);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        name = findViewById(R.id.editTextTextPersonName2);
        email = findViewById(R.id.editTextTextPersonName3);
        pass = findViewById(R.id.editTextTextPersonName4);
        pass_confirm = findViewById(R.id.editTextTextPersonName5);
        register = findViewById(R.id.button2);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name_, email_, pass_, pass_conf_;
                name_ = name.getText().toString();
                email_ = email.getText().toString();
                pass_ = pass.getText().toString();
                pass_conf_ = pass_confirm.getText().toString();

                if(TextUtils.isEmpty(name_)){
                    Toast.makeText(SignUp.this, "Введите имя", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(email_)){
                    Toast.makeText(SignUp.this, "Введите Почту", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(pass_)){
                    Toast.makeText(SignUp.this, "Введите Пароль", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(pass_conf_)){
                    Toast.makeText(SignUp.this, "Повторите пароль", Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.createUserWithEmailAndPassword(email_, pass_)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    UserProfileChangeRequest profileUpdates = new UserProfileChangeRequest.Builder()
                                            .setDisplayName(name_) // Устанавливаем имя аккаунта
                                            .build();

                                    if (user != null) {
                                        user.updateProfile(profileUpdates)
                                                .addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful()) {
                                                            Toast.makeText(SignUp.this, "Аккаунт создан.",
                                                                    Toast.LENGTH_SHORT).show();
                                                        } else {
                                                            Toast.makeText(SignUp.this, "Ошибка.",
                                                                    Toast.LENGTH_SHORT).show();
                                                        }
                                                    }
                                                });
                                    }
                                    Toast.makeText(SignUp.this, "Аккаунт создан.",
                                            Toast.LENGTH_SHORT).show();



                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(SignUp.this, "Ошибка.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

            }
        });

        TextView signup = findViewById(R.id.textView6);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Intent intent = new Intent(arg.getContext(), MainActivity.class);
                arg.getContext().startActivity(intent);
            }
        });
    }
}