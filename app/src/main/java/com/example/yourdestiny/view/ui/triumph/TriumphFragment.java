package com.example.yourdestiny.view.ui.triumph;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.yourdestiny.databinding.FragmentTriumphBinding;

public class TriumphFragment extends Fragment {

    private FragmentTriumphBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TriumphViewModel triumphViewModel =
                new ViewModelProvider(this).get(TriumphViewModel.class);

        binding = FragmentTriumphBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}