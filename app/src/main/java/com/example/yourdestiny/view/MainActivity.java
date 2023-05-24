package com.example.yourdestiny.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.yourdestiny.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
                        Intent intent = new Intent(arg.getContext(), AppActivity.class);
                        arg.getContext().startActivity(intent);
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