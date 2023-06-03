package com.example.yourdestiny.view.ui.buildcraft;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.yourdestiny.R;


public class ClassFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_class, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView hunter = getView().findViewById(R.id.hunt);
        hunter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("class", "Охотник");
                Navigation.findNavController(view).navigate(R.id.action_navigation_class_to_navigation_subclass, bundle);
            }
        });
        ImageView titan = getView().findViewById(R.id.tit);
        titan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("class", "Титан");
                Navigation.findNavController(view).navigate(R.id.action_navigation_class_to_navigation_subclass,bundle);
            }
        });
        ImageView warlock = getView().findViewById(R.id.warl);
        warlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("class", "Варлок");
                Navigation.findNavController(view).navigate(R.id.action_navigation_class_to_navigation_subclass, bundle);
            }
        });
        ImageView cancel = getView().findViewById(R.id.imageView38);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_navigation_class_to_navigation_buildcraft);
            }
        });
    }
}