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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yourdestiny.R;
import com.example.yourdestiny.viewmodel.ArmorViewModel;


public class ArmorFragment extends Fragment {

    ArmorViewModel armorViewModel;
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
        return inflater.inflate(R.layout.fragment_armor, container, false);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = getView().findViewById(R.id.title_6);
        textView.setText("Снаряжение");
        ImageView returne = getView().findViewById(R.id.imageView32);
        armorViewModel = new ArmorViewModel(getActivity().getApplicationContext());
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

        recyclerView = getView().findViewById(R.id.Armors);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        progAdapter = new ArmorAdapter(getActivity(), armorViewModel.getHunter(), "no", "no","", "", "");
        recyclerView.setAdapter(progAdapter);

        hunter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hunter.setTextColor(getResources().getColor(R.color.white));
                titan.setTextColor(getResources().getColor(R.color.grey));
                warlock.setTextColor(getResources().getColor(R.color.grey));

                recyclerView = getView().findViewById(R.id.Armors);
                LinearLayoutManager layoutManager
                        = new LinearLayoutManager(getActivity());
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManager);
                progAdapter = new ArmorAdapter(getActivity(), armorViewModel.getHunter(), "no", "no","", "", "");
                recyclerView.setAdapter(progAdapter);
            }
        });

        titan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hunter.setTextColor(getResources().getColor(R.color.grey));
                titan.setTextColor(getResources().getColor(R.color.white));
                warlock.setTextColor(getResources().getColor(R.color.grey));

                recyclerView = getView().findViewById(R.id.Armors);
                LinearLayoutManager layoutManager
                        = new LinearLayoutManager(getActivity());
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManager);
                progAdapter = new ArmorAdapter(getActivity(), armorViewModel.getTitan(), "no", "no","", "", "");
                recyclerView.setAdapter(progAdapter);
            }
        });

        warlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hunter.setTextColor(getResources().getColor(R.color.grey));
                titan.setTextColor(getResources().getColor(R.color.grey));
                warlock.setTextColor(getResources().getColor(R.color.white));

                recyclerView = getView().findViewById(R.id.Armors);
                LinearLayoutManager layoutManager
                        = new LinearLayoutManager(getActivity());
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(layoutManager);
                progAdapter = new ArmorAdapter(getActivity(), armorViewModel.getWarlock(), "no", "no","", "", "");
                recyclerView.setAdapter(progAdapter);
            }
        });
    }
}