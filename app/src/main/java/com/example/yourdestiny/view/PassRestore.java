package com.example.yourdestiny.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.yourdestiny.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class PassRestore extends AppCompatActivity {
    EditText mail;
    Button reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_pass_restore);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        mail = findViewById(R.id.editTextTextPersonName6);
        reset = findViewById(R.id.button3);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail_ = mail.getText().toString();
                if(TextUtils.isEmpty(mail_)){
                    Toast.makeText(PassRestore.this, "Введите почту", Toast.LENGTH_SHORT).show();
                    return;
                }
                FirebaseAuth.getInstance().sendPasswordResetEmail(mail_)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(PassRestore.this, "Проверь почту!", Toast.LENGTH_SHORT).show();
                                }
                                else{
                                    Toast.makeText(PassRestore.this, "Ошибка", Toast.LENGTH_SHORT).show();
                                }
                            }

                        });
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView signin = findViewById(R.id.imageView2);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Intent intent = new Intent(arg.getContext(), MainActivity.class);
                arg.getContext().startActivity(intent);
                finish();
            }
        });
    }
}