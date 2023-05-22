package com.example.yourdestiny.view.ui.buildcraft;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.yourdestiny.databinding.FragmentBuildcraftBinding;

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
}