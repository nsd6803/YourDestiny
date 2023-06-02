package com.example.yourdestiny.view.ui.collection.Armor;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.yourdestiny.R;


public class ArmorFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_armor, container, false);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = getView().findViewById(R.id.title_6);
        textView.setText("Снаряжение");
        ImageView returne = getView().findViewById(R.id.imageView32);
        returne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Navigation.findNavController(arg).navigate(R.id.action_navigation_armor_to_navigation_collection);
            }
        });

        TextView hunter = getView().findViewById(R.id.title_11);

        TextView titan = getView().findViewById(R.id.title_12);

        TextView warlock = getView().findViewById(R.id.title_13);

        titan.setTextColor(getResources().getColor(R.color.grey));
        warlock.setTextColor(getResources().getColor(R.color.grey));

        hunter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hunter.setTextColor(getResources().getColor(R.color.white));
                titan.setTextColor(getResources().getColor(R.color.grey));
                warlock.setTextColor(getResources().getColor(R.color.grey));
            }
        });

        titan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hunter.setTextColor(getResources().getColor(R.color.grey));
                titan.setTextColor(getResources().getColor(R.color.white));
                warlock.setTextColor(getResources().getColor(R.color.grey));
            }
        });

        warlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hunter.setTextColor(getResources().getColor(R.color.grey));
                titan.setTextColor(getResources().getColor(R.color.grey));
                warlock.setTextColor(getResources().getColor(R.color.white));
            }
        });
    }
}