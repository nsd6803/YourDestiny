package com.example.yourdestiny.view.ui.guides;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.yourdestiny.R;
import com.example.yourdestiny.databinding.FragmentGuidesBinding;

public class GuidesFragment extends Fragment {

    private FragmentGuidesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GuidesViewModel guidesViewModel =
                new ViewModelProvider(this).get(GuidesViewModel.class);
        binding = FragmentGuidesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = getView().findViewById(R.id.title_1);
        textView.setText(R.string.title_guides);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}