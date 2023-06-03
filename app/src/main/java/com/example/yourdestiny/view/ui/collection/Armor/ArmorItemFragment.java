package com.example.yourdestiny.view.ui.collection.Armor;

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
import com.example.yourdestiny.model.armorDB.Armor;


public class ArmorItemFragment extends Fragment {
    ArmorItemViewModel armorItemViewModel;
    String CameFrom;

    Armor armor_info;
    String came_from;
    String came_from_bc;
    String clas;
    String subclass;
    String activity;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String value1 = bundle.getString("Name");
            String from = bundle.getString("from");
            String from_bc = bundle.getString("from_bc");
            CameFrom = value1;
            came_from = from;
            came_from_bc = from_bc;
        }
        if (bundle != null) {
            String value1 = bundle.getString("class");
            String value2 = bundle.getString("subclass");
            String value3 = bundle.getString("activity");
            clas = value1;
            subclass = value2;
            activity = value3;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_armor_item, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        armorItemViewModel = new ArmorItemViewModel(getActivity().getApplicationContext());
        armor_info = armorItemViewModel.getArmorInfo(CameFrom);
        ImageView square = getView().findViewById(R.id.imageView55);
        ImageView background = getView().findViewById(R.id.imageView54);
        ImageView perk = getView().findViewById(R.id.imageView57);
        ImageView back = getView().findViewById(R.id.imageView56);
        TextView title = getView().findViewById(R.id.item_name4);
        TextView type = getView().findViewById(R.id.item_predicat4);
        TextView predicat = getView().findViewById(R.id.item_type4);
        TextView exotic_title = getView().findViewById(R.id.textView26);
        TextView exotic_descryption = getView().findViewById(R.id.textView27);
        TextView lore = getView().findViewById(R.id.textView29);


        square.setImageResource(armor_info.getPic());
        background.setImageResource(armor_info.getBack_pic());
        perk.setImageResource(armor_info.getExotic_pic());
        title.setText(armor_info.getName());
        type.setText(armor_info.getType());
        predicat.setText(armor_info.getPredicat());
        exotic_title.setText(armor_info.getExotic_title());
        exotic_descryption.setText(armor_info.getExotic_descrypt());
        lore.setText(armor_info.getLore());


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (came_from == "yes") {
                    Navigation.findNavController(view).navigate(R.id.action_navigation_armor_item_to_navigation_new);
                }
                else if(came_from_bc == "yes"){
                    Bundle bundle = new Bundle();
                    bundle.putString("class", clas);
                    bundle.putString("subclass", subclass);
                    bundle.putString("activity", activity);
                    Navigation.findNavController(view).navigate(R.id.action_navigation_armor_item_to_navigation_result, bundle);
                }else {
                    Navigation.findNavController(view).navigate(R.id.action_navigation_armor_item_to_navigation_armor);
                }
            }
        });

    }
}