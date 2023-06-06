package com.example.yourdestiny.view.ui.guides;

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
import com.example.yourdestiny.viewmodel.GameActivityViewModel;

import java.util.Objects;


public class GameActivityFragment extends Fragment {
    private GameActivityViewModel gameActivityViewModel;
    private String CameFrom;
    RecyclerView recyclerView;

    RecyclerView.Adapter progAdapter;

    public String[] raid_names = new String[] {
            "Источник Кошмаров",
            "Падение Короля",
            "Клятва Послушника",
            "Хранилище Стекла",
            "Склеп Глубокого Камня",
            "Сад Спасения",
            "Последнее Желание"
    };

    private int[] raid_pics = new int[]{
            R.drawable.ron,
            R.drawable.kf,
            R.drawable.vod,
            R.drawable.vog,
            R.drawable.dsc,
            R.drawable.gos,
            R.drawable.lw
    };

    private String[] dungeon_names = new String[] {
            "Призраки Глубины",
            "Шпиль Хранителя",
            "Дуальность",
            "Тиски Алчности",
            "Откровение",
            "Яма Ереси",
            "Расколотый Трон"
    };

    private int[] dungeons_pics = new int[]{
            R.drawable.god,
            R.drawable.sow,
            R.drawable.d,
            R.drawable.goa,
            R.drawable.p,
            R.drawable.poh,
            R.drawable.st
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String value1 = bundle.getString("Name");
            CameFrom = value1;
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game_activity, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gameActivityViewModel = new GameActivityViewModel(getActivity().getApplicationContext());
        recyclerView = getView().findViewById(R.id.game_activity);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity());
        TextView textView = getView().findViewById(R.id.title_7);
        textView.setText(CameFrom);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        if(Objects.equals(CameFrom, "Подземелья")) {
            progAdapter = new GameActivityAdapter(getActivity(), dungeons_pics, dungeon_names);
        }
        else{
            progAdapter = new GameActivityAdapter(getActivity(), raid_pics, raid_names);
        }
        recyclerView.setAdapter(progAdapter);

        ImageView returne = getView().findViewById(R.id.imageView28);
        returne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {

                Navigation.findNavController(arg).navigate(R.id.action_navigation_game_activity_to_navigation_guides);
            }
        });
    }


}