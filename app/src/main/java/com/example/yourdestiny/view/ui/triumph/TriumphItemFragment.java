package com.example.yourdestiny.view.ui.triumph;

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

import com.example.yourdestiny.R;


public class TriumphItemFragment extends Fragment {
    private String Title;
    private int Image;
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
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                Navigation.findNavController(arg).navigate(R.id.action_navigation_triumph_item_to_navigation_triumph);
            }
        });

    }
}