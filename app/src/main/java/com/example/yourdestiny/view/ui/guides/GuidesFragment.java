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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.WorkManager;

import com.example.yourdestiny.R;
import com.example.yourdestiny.databinding.FragmentGuidesBinding;
import com.example.yourdestiny.model.Repository;

public class GuidesFragment extends Fragment {
    private GuidesViewModel guidesViewModel;
    private FragmentGuidesBinding binding;
    Repository repository;
    RecyclerView recyclerView;

    RecyclerView.Adapter progAdapter;

    private String[] news_names = new String[] {
            "Хотфикс 26/05/23",
            "TWAB 25/05/23",
            "Обновление 7.1.0",
            "TWAB 18/05/23"
    };

    private int[] news_pics = new int[]{
            R.drawable.hotfix,
            R.drawable.twab,
            R.drawable.update,
            R.drawable.twab
    };

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
         repository = new Repository(getActivity().getApplicationContext());
        recyclerView = getView().findViewById(R.id.recyclerView2);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        progAdapter = new GuidesNewsAdapter(getActivity(), news_pics, news_names);
        recyclerView.setAdapter(progAdapter);

        TextView textView1 = getView().findViewById(R.id.textView17);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("Name", "Гайды");
                Navigation.findNavController(view).navigate(R.id.action_navigation_guides_to_navigation_news, bundle);
            }
        });


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