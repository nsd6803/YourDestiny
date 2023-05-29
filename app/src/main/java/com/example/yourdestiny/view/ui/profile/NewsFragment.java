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
            "Хотфикс 26/05/23",
            "TWAB 25/05/23",
            "Обновление 7.1.0",
            "TWAB 18/05/23",
            "Хотфикс 7.0.5.3",
            "TWAB 11/05/23",
            "TWAB 04/05/23",
            "Хотфикс 7.0.5.2"
    };

    private int[] news_pics = new int[]{
            R.drawable.hotfix,
            R.drawable.twab,
            R.drawable.update,
            R.drawable.twab,
            R.drawable.hotfix,
            R.drawable.twab,
            R.drawable.twab,
            R.drawable.hotfix
    };

    private String[] news_url = new String[]{
            "https://www.bungie.net/7/en/News/article/destiny-2-hotfix-5-26-23",
            "https://www.bungie.net/7/en/News/article/twab-may-25-2023",
            "https://www.bungie.net/7/en/News/article/season-deep-update-7-1-0",
            "https://www.bungie.net/7/en/News/article/this_week_at_bungie_05_18_23",
            "https://www.bungie.net/7/en/News/article/hotfix7_0_5_3",
            "https://www.bungie.net/7/en/News/article/05-011-2023-twab",
            "https://www.bungie.net/7/en/News/article/destiny-2-g-games-23-twab",
            "https://www.bungie.net/7/en/News/article/hotfix_7-0-5-2"
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
        progAdapter = new NewsAdapter(getActivity(), news_pics, news_names, news_url);
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