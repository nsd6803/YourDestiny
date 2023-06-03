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

import com.example.yourdestiny.R;

public class SubclassFragment extends Fragment {

    String clas;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String value1 = bundle.getString("class");
            clas = value1;
            Log.d("BCCCC", clas);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_subclass, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView solar = getView().findViewById(R.id.solar);
        solar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("subclass", "Огонь");
                bundle.putString("class", clas);
                Navigation.findNavController(view).navigate(R.id.action_navigation_subclass_to_navigation_activity, bundle);
            }
        });
        ImageView arc = getView().findViewById(R.id.arc);
        arc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("subclass", "Электричество");
                bundle.putString("class", clas);
                Navigation.findNavController(view).navigate(R.id.action_navigation_subclass_to_navigation_activity, bundle);
            }
        });
        ImageView strand = getView().findViewById(R.id.strand);
        strand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("subclass", "Нить");
                bundle.putString("class", clas);
                Navigation.findNavController(view).navigate(R.id.action_navigation_subclass_to_navigation_activity, bundle);
            }
        });
        ImageView voidd = getView().findViewById(R.id.voidf);
        voidd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("subclass", "Пустота");
                bundle.putString("class", clas);
                Navigation.findNavController(view).navigate(R.id.action_navigation_subclass_to_navigation_activity, bundle);
            }
        });
        ImageView stasis = getView().findViewById(R.id.stasis);
        stasis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("subclass", "Стазис");
                bundle.putString("class", clas);
                Navigation.findNavController(view).navigate(R.id.action_navigation_subclass_to_navigation_activity, bundle);
            }
        });

        ImageView cancel = getView().findViewById(R.id.imageView39);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_navigation_subclass_to_navigation_buildcraft);
            }
        });
    }
}