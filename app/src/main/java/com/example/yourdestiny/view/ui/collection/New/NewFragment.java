package com.example.yourdestiny.view.ui.collection.New;

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
import com.example.yourdestiny.view.ui.collection.Armor.ArmorAdapter;
import com.example.yourdestiny.view.ui.collection.Weapon.WeaponAdapter;
import com.example.yourdestiny.viewmodel.NewVieModel;


public class NewFragment extends Fragment {
    NewVieModel newVieModel;

    RecyclerView recyclerView;

    RecyclerView.Adapter progAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = getView().findViewById(R.id.title_5);
        textView.setText("Новое");
        ImageView returne = getView().findViewById(R.id.imageView30);
        TextView weapon = getView().findViewById(R.id.title_14);
        TextView armor = getView().findViewById(R.id.title_15);
        armor.setTextColor(getResources().getColor(R.color.grey));
        newVieModel = new NewVieModel(getActivity().getApplicationContext());
        recyclerView = getView().findViewById(R.id.new_items);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        progAdapter = new WeaponAdapter(getActivity(), newVieModel.getNewWeapon(), "yes", "no","", "", "");
        recyclerView.setAdapter(progAdapter);

        weapon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                weapon.setTextColor(getResources().getColor(R.color.white));
                armor.setTextColor(getResources().getColor(R.color.grey));
                LinearLayoutManager layoutManager
                        = new LinearLayoutManager(getActivity());
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManager);
                progAdapter = new WeaponAdapter(getActivity(), newVieModel.getNewWeapon(), "yes", "no","", "", "");
                recyclerView.setAdapter(progAdapter);
            }
        });

        armor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                weapon.setTextColor(getResources().getColor(R.color.grey));
                armor.setTextColor(getResources().getColor(R.color.white));

                LinearLayoutManager layoutManager
                        = new LinearLayoutManager(getActivity());
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManager);
                progAdapter = new ArmorAdapter(getActivity(), newVieModel.getNewArmor(), "yes", "no","", "", "");
                recyclerView.setAdapter(progAdapter);
            }
        });


        returne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Navigation.findNavController(arg).navigate(R.id.action_navigation_new_to_navigation_collection);
            }
        });
    }
}