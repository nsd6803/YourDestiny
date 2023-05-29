package com.example.yourdestiny.view.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yourdestiny.R;


public class NewsFragment extends Fragment {
    String Back;
    RecyclerView recyclerView;

    RecyclerView.Adapter progAdapter;

    private String[] news_names = new String[] {
            "Источник Кошмаров",
            "Падение Короля",
            "Клятва Послушника",
            "Хранилище Стекла",
            "Склеп Глубокого Камня",
            "Сад Спасения",
            "Последнее Желание"
    };

    private int[] news_pics = new int[]{
            R.drawable.ron,
            R.drawable.kf,
            R.drawable.vod,
            R.drawable.vog,
            R.drawable.dsc,
            R.drawable.gos,
            R.drawable.lw
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String value1 = bundle.getString("Name");
            Back = value1;
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = getView().findViewById(R.id.news);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        progAdapter = new NewsAdapter(getActivity(), news_pics, news_names);
        recyclerView.setAdapter(progAdapter);

        ImageView back = getView().findViewById(R.id.imageView44);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Back == "Гайды") {
                    Navigation.findNavController(view).navigate(R.id.action_navigation_news_to_navigation_guides);
                }
                else{
                    Navigation.findNavController(view).navigate(R.id.action_navigation_news_to_navigation_profile);
                }
            }
        });
    }
}