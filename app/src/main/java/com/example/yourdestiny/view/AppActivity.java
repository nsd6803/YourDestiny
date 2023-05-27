package com.example.yourdestiny.view;

import android.content.res.ColorStateList;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.yourdestiny.R;
import com.example.yourdestiny.databinding.ActivityAppBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AppActivity extends AppCompatActivity {

    private ActivityAppBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAppBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setItemIconTintList(null);
        navView.setItemTextColor(ColorStateList.valueOf(ContextCompat.getColor(this, R.color.white)));
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_guides, R.id.navigation_collection, R.id.navigation_buildcraft,
                R.id.navigation_triumph, R.id.navigation_profile, R.id.navigation_collection, R.id.navigation_armor, R.id.navigation_new,
                R.id.navigation_triumph_item, R.id.navigation_game_activity, R.id.navigation_class, R.id.navigation_subclass,
                R.id.navigation_activity, R.id.navigation_result)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_app);
        NavigationUI.setupWithNavController(binding.navView, navController);


    }

}