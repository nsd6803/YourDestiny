package com.example.yourdestiny.view.ui.collection.Weapon;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yourdestiny.R;

public class WeaponFragment extends Fragment {

    WeaponViewModel weaponViewModel;
    RecyclerView recyclerView;

    RecyclerView.Adapter progAdapter;

    String came_from;
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
        weaponViewModel = new WeaponViewModel(getActivity().getApplicationContext());
        returne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Navigation.findNavController(arg).navigate(R.id.action_navigation_weapon_to_navigation_collection);
            }
        });

        TextView legendary = getView().findViewById(R.id.title_11);
        TextView exotic = getView().findViewById(R.id.title_12);

        exotic.setTextColor(getResources().getColor(R.color.grey));

        recyclerView = getView().findViewById(R.id.Weapons);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        progAdapter = new WeaponAdapter(getActivity(), weaponViewModel.getLegenadry(), "no");
        recyclerView.setAdapter(progAdapter);

        legendary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                legendary.setTextColor(getResources().getColor(R.color.white));
                exotic.setTextColor(getResources().getColor(R.color.grey));
                recyclerView = getView().findViewById(R.id.Weapons);
                LinearLayoutManager layoutManager
                        = new LinearLayoutManager(getActivity());
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManager);
                progAdapter = new WeaponAdapter(getActivity(), weaponViewModel.getLegenadry(), "no");
                recyclerView.setAdapter(progAdapter);
            }
        });

        exotic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                legendary.setTextColor(getResources().getColor(R.color.grey));
                exotic.setTextColor(getResources().getColor(R.color.white));
                recyclerView = getView().findViewById(R.id.Weapons);
                LinearLayoutManager layoutManager
                        = new LinearLayoutManager(getActivity());
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManager);
                progAdapter = new WeaponAdapter(getActivity(), weaponViewModel.getExotic(), "no");
                recyclerView.setAdapter(progAdapter);
            }
        });
    }
}