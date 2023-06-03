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


public class ActivityFragment extends Fragment {

    String clas;
    String subclass;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String value1 = bundle.getString("class");
            String value2 = bundle.getString("subclass");
            clas = value1;
            subclass = value2;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_activity, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView raids = getView().findViewById(R.id.raid_act);
        raids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("subclass", subclass);
                bundle.putString("class", clas);
                bundle.putString("activity", "Рейд");
                Navigation.findNavController(view).navigate(R.id.action_navigation_activity_to_navigation_result, bundle);
            }
        });

        ImageView strike = getView().findViewById(R.id.strike_act);
        strike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("subclass", subclass);
                bundle.putString("class", clas);
                bundle.putString("activity", "Налет");
                Navigation.findNavController(view).navigate(R.id.action_navigation_activity_to_navigation_result, bundle);
            }
        });

        ImageView gambit = getView().findViewById(R.id.gambit_act);
        gambit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("subclass", subclass);
                bundle.putString("class", clas);
                bundle.putString("activity", "Гамбит");
                Navigation.findNavController(view).navigate(R.id.action_navigation_activity_to_navigation_result, bundle);
            }
        });

        ImageView crucible = getView().findViewById(R.id.crucible_act);
        crucible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("subclass", subclass);
                bundle.putString("class", clas);
                bundle.putString("activity", "Горнило");
                Navigation.findNavController(view).navigate(R.id.action_navigation_activity_to_navigation_result, bundle);
            }
        });

        ImageView cancel = getView().findViewById(R.id.imageView41);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_navigation_activity_to_navigation_buildcraft);
            }
        });
    }
}