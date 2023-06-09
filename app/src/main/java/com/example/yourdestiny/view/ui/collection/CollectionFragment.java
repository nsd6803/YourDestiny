package com.example.yourdestiny.view.ui.collection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.yourdestiny.R;
import com.example.yourdestiny.databinding.FragmentCollectionBinding;
import com.example.yourdestiny.model.Repository;
import com.example.yourdestiny.viewmodel.CollectionViewModel;

public class CollectionFragment extends Fragment {
    private FragmentCollectionBinding binding;
    Repository repository;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CollectionViewModel collectionViewModel =
                new ViewModelProvider(this).get(CollectionViewModel.class);

        binding = FragmentCollectionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = getView().findViewById(R.id.title_3);
        textView.setText(R.string.title_collection);
        repository = new Repository(getActivity().getApplicationContext());
        ImageView weapons = getView().findViewById(R.id.imageView9);
        weapons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Navigation.findNavController(arg).navigate(R.id.action_navigation_collection_to_navigation_weapon);
            }
        });

        ImageView armor = getView().findViewById(R.id.imageView10);
        armor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Navigation.findNavController(arg).navigate(R.id.action_navigation_collection_to_navigation_armor);
            }
        });

        ImageView neww = getView().findViewById(R.id.imageView7);
        neww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Navigation.findNavController(arg).navigate(R.id.action_navigation_collection_to_navigation_new);
            }
        });

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}