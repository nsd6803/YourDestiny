package com.example.yourdestiny.view.ui.guides;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.work.WorkManager;

import com.example.yourdestiny.R;
import com.example.yourdestiny.databinding.FragmentGuidesBinding;

public class GuidesFragment extends Fragment {
    private GuidesViewModel guidesViewModel;
    private FragmentGuidesBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        guidesViewModel =
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

         Button button4 = view.findViewById(R.id.button4);
         Button button3 = view.findViewById(R.id.button7);
         button4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Bundle bundle = new Bundle();
                 bundle.putString("Name", "Подземелья");
                 Navigation.findNavController(view).navigate(R.id.action_navigation_guides_to_navigation_game_activity, bundle);
             }
         });

         WorkManager workManager = WorkManager.getInstance();

         button3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Bundle bundle = new Bundle();
                 bundle.putString("Name", "Рейды");
                 Navigation.findNavController(view).navigate(R.id.action_navigation_guides_to_navigation_game_activity, bundle);
             }
         });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}