package com.example.yourdestiny.view.ui.triumph;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yourdestiny.R;

import java.util.Objects;


public class TriumphItemFragment extends Fragment {
    private String Title;
    private int Image;
    TriumphItemViewModel triumphItemViewModel;
    RecyclerView recyclerView;

    RecyclerView.Adapter progAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String value1 = bundle.getString("Name");
            int value2 = bundle.getInt("Image");
            Title = value1;
            Image = value2;
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_triumph__item, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = getView().findViewById(R.id.Triumph_name);
        textView.setText(Title);
        ImageView imageView = getView().findViewById(R.id.imageView35);
        imageView.setImageResource(Image);
        ImageView imageView2 = getView().findViewById(R.id.imageView34);
        triumphItemViewModel = new TriumphItemViewModel(getActivity().getApplicationContext(), Title);
        ProgressBar progressBar = getView().findViewById(R.id.progressBar);

        progressBar.setProgress((int)((changeState()/(float)triumphItemViewModel.repository.db_T.triumphDao().getTriumph(Title).getIsChecked().size())*100));
        if(changeState() == triumphItemViewModel.repository.db_T.triumphDao().getTriumph(Title).getIsChecked().size()){
            textView.setTextColor(getResources().getColor(R.color.green));
        }


        recyclerView = getView().findViewById(R.id.triumph_tasks);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        progAdapter = new TriumphItemAdapter(getActivity(),Title, textView, triumphItemViewModel.getTriumphs(), progressBar, triumphItemViewModel);
        recyclerView.setAdapter(progAdapter);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Navigation.findNavController(arg).navigate(R.id.action_navigation_triumph_item_to_navigation_triumph);
            }
        });

    }

    public int changeState(){
        int count = 0;
        for(int i = 0; i < triumphItemViewModel.repository.db_T.triumphDao().getTriumph(Title).getIsChecked().size(); i++){
            if(Objects.equals(triumphItemViewModel.repository.db_T.triumphDao().getTriumph(Title).getIsChecked().get(i), "true")){
                count += 1;
            }
        }

        return count;
    }
}