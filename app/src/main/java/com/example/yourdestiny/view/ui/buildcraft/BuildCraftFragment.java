package com.example.yourdestiny.view.ui.buildcraft;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.yourdestiny.databinding.FragmentBuildcraftBinding;

public class BuildCraftFragment extends Fragment {

    private FragmentBuildcraftBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BuildCraftViewModel notificationsViewModel =
                new ViewModelProvider(this).get(BuildCraftViewModel.class);

        binding = FragmentBuildcraftBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBuildcraft;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}