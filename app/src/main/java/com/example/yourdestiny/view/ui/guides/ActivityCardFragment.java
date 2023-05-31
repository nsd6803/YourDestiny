package com.example.yourdestiny.view.ui.guides;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yourdestiny.R;

import java.util.Arrays;


public class ActivityCardFragment extends Fragment {
    private ActivityCardViewModel activityCardViewModel;
    private String Name;

    RecyclerView recyclerView;

    RecyclerView.Adapter progAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String value1 = bundle.getString("Name");
            Name = value1;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_activity_card, container, false);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView Title = getView().findViewById(R.id.textView19);
        TextView Predicat = getView().findViewById(R.id.textView20);
        TextView Difficulty = getView().findViewById(R.id.textView22);
        ImageView imageView = getView().findViewById(R.id.imageView47);
        activityCardViewModel = new ActivityCardViewModel(getActivity().getApplicationContext());
        Title.setText(activityCardViewModel.getActivityInfo(Name).getName());
        Predicat.setText('"'+activityCardViewModel.getActivityInfo(Name).getPredicat()+'"');
        Difficulty.setText(activityCardViewModel.getActivityInfo(Name).getDifficulty());
        imageView.setImageResource(activityCardViewModel.getActivityInfo(Name).getGuide_pic());

        ImageView back = getView().findViewById(R.id.imageView15);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                if(Arrays.asList(new GameActivityFragment().raid_names).contains(activityCardViewModel.getActivityInfo(Name).getName())){
                    bundle.putString("Name", "Рейды");
                }
                else{
                    bundle.putString("Name", "Подземелья");
                }
                Navigation.findNavController(v).navigate(R.id.action_navigation_activity_card_to_navigation_game_activity, bundle);
            }
        });

        recyclerView = getView().findViewById(R.id.Encounters);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        progAdapter = new ActivityCardAdapter(getActivity(), activityCardViewModel.getActivityInfo(Name).getEncounters_descript(), activityCardViewModel.getActivityInfo(Name).getEncounters());
        recyclerView.setAdapter(progAdapter);
    }

}