package com.example.yourdestiny.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.yourdestiny.R;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_sign_up);

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