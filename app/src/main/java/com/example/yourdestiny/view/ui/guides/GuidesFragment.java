package com.example.yourdestiny.view.ui.guides;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

import com.example.yourdestiny.R;
import com.example.yourdestiny.databinding.FragmentGuidesBinding;
import com.example.yourdestiny.viewmodel.MyWorker;

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

         ImageView receiving_img = getView().findViewById(R.id.imageView27);
         GuidesViewModel viewModel2 = new ViewModelProvider(this).get(GuidesViewModel.class);
         viewModel2.getValue().observe(getViewLifecycleOwner(), value ->  {
             Log.d("Loading","Статус загрузки " + value*10 + " %");
         });
         viewModel2.getBitmap().observe(getViewLifecycleOwner(), bitmap ->{
             if (bitmap != null ){
                 receiving_img.setImageBitmap(bitmap);
             }
         });
         Button button4 = view.findViewById(R.id.button4);
         Button button3 = view.findViewById(R.id.button7);
         button4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 viewModel2.execute();
             }
         });
         WorkManager workManager = WorkManager.getInstance();
         Data.Builder builder = new Data.Builder();
         builder.putString("key", "https://www.freepnglogos.com/uploads/download-destiny-logo/destiny-2-logo-hd-picture-png-13.png");
         OneTimeWorkRequest newRequest = new OneTimeWorkRequest.Builder(MyWorker.class)
                 .setInputData(builder.build())
                 .build();
         button3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 workManager.enqueue(newRequest) ;
             }
         });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        guidesViewModel.close_executor();
        binding = null;
    }

}