package com.example.yourdestiny.view.ui.triumph;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yourdestiny.R;
import com.example.yourdestiny.databinding.FragmentTriumphBinding;

public class TriumphFragment extends Fragment {

    private FragmentTriumphBinding binding;

    private String[] dungeon_names = new String[] {
            "Queensguard",
            "Dream Warrior",
            "Virtual Fighter",
            "Conqueror",
            "Glorious",
            "Flawless"
    };

    private int[] dungeons_pics = new int[]{
            R.drawable.queensguard,
            R.drawable.dream_warrior,
            R.drawable.virtual_fighter,
            R.drawable.conqueror,
            R.drawable.glorious,
            R.drawable.flawless
    };
    RecyclerView recyclerView;
    RecyclerView.Adapter progAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TriumphViewModel triumphViewModel =
                new ViewModelProvider(this).get(TriumphViewModel.class);

        binding = FragmentTriumphBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = getView().findViewById(R.id.triumph_view_list);
        TextView textView = getView().findViewById(R.id.title_2);
        textView.setText(R.string.title_triumph);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        progAdapter = new TriumphAdapter(getActivity(), dungeons_pics, dungeon_names);
        recyclerView.setAdapter(progAdapter);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}