package com.example.yourdestiny.view.ui.collection;

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

public class WeaponFragment extends Fragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weapon, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = getView().findViewById(R.id.title_4);
        textView.setText("Оружие");
        ImageView returne = getView().findViewById(R.id.imageView29);
        returne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Navigation.findNavController(arg).navigate(R.id.action_navigation_weapon_to_navigation_collection);
            }
        });
    }
}