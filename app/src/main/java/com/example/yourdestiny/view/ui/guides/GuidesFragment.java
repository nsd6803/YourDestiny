package com.example.yourdestiny.view.ui.guides;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.yourdestiny.databinding.FragmentGuidesBinding;

public class GuidesFragment extends Fragment {

    private FragmentGuidesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GuidesViewModel guidesViewModel =
                new ViewModelProvider(this).get(GuidesViewModel.class);

        binding = FragmentGuidesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGuides;
        guidesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}