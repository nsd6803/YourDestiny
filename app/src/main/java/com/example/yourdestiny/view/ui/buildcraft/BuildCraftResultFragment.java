package com.example.yourdestiny.view.ui.buildcraft;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yourdestiny.R;
import com.example.yourdestiny.view.ui.collection.Armor.ArmorAdapter;
import com.example.yourdestiny.view.ui.collection.Weapon.WeaponAdapter;


public class BuildCraftResultFragment extends Fragment {
    String clas;
    String subclass;
    String activity;
    BuildCraftResultViewModel buildCraftResultViewModel;
    RecyclerView recyclerView;
    RecyclerView recyclerView2;

    RecyclerView.Adapter progAdapter;
    RecyclerView.Adapter progAdapter2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String value1 = bundle.getString("class");
            String value2 = bundle.getString("subclass");
            String value3 = bundle.getString("activity");
            clas = value1;
            subclass = value2;
            activity = value3;
            Log.d("BCCCC", clas);
            Log.d("BCCCC", subclass);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_build_craft_result, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView cancel = getView().findViewById(R.id.imageView42);
        buildCraftResultViewModel = new BuildCraftResultViewModel(getActivity().getApplicationContext());
        recyclerView = getView().findViewById(R.id.weapons);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        progAdapter = new WeaponAdapter(getActivity(), buildCraftResultViewModel.getWeapon(clas, subclass, activity), "no");
        recyclerView.setAdapter(progAdapter);

        recyclerView2 = getView().findViewById(R.id.armors);
        recyclerView2.setHasFixedSize(true);
        LinearLayoutManager layoutManager2
                = new LinearLayoutManager(getActivity());
        recyclerView2.setLayoutManager(layoutManager2);
        progAdapter2 = new ArmorAdapter(getActivity(), buildCraftResultViewModel.getArmor(clas, subclass, activity), "no");
        recyclerView2.setAdapter(progAdapter2);


        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_navigation_result_to_navigation_buildcraft);
            }
        });
    }
}