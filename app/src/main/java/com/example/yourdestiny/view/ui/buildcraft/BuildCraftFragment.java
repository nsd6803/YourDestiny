package com.example.yourdestiny.view.ui.buildcraft;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.yourdestiny.R;
import com.example.yourdestiny.databinding.FragmentBuildcraftBinding;
import com.example.yourdestiny.viewmodel.BuildCraftViewModel;

public class BuildCraftFragment extends Fragment {

    private FragmentBuildcraftBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BuildCraftViewModel buildCraftViewModel =
                new ViewModelProvider(this).get(BuildCraftViewModel.class);

        binding = FragmentBuildcraftBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button start = getView().findViewById(R.id.button6);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_navigation_buildcraft_to_navigation_class);
            }
        });
    }


}