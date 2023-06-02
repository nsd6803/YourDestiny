package com.example.yourdestiny.view.ui.collection.Weapon;

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

import com.example.yourdestiny.R;
import com.example.yourdestiny.model.weaponDB.Weapon;


public class WeaponEFragment extends Fragment {
    WeaponEViewModel weaponEViewModel;
    String CameFrom;

    Weapon weapon_info;

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
        return inflater.inflate(R.layout.fragment_weapon_e, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        weaponEViewModel = new WeaponEViewModel(getActivity().getApplicationContext());
        weapon_info = weaponEViewModel.getWeaponInfo(CameFrom);
        ImageView square = getView().findViewById(R.id.imageView55);
        ImageView background = getView().findViewById(R.id.imageView54);
        ImageView perk = getView().findViewById(R.id.imageView57);
        ImageView back = getView().findViewById(R.id.imageView56);
        TextView title = getView().findViewById(R.id.item_name4);
        TextView energy = getView().findViewById(R.id.item_predicat4);
        TextView predicat = getView().findViewById(R.id.item_type4);
        TextView exotic_title = getView().findViewById(R.id.textView26);
        TextView exotic_descryption = getView().findViewById(R.id.textView27);
        TextView lore = getView().findViewById(R.id.textView29);
        square.setImageResource(weapon_info.getPic());
        background.setImageResource(weapon_info.getBack_pic());
        perk.setImageResource(weapon_info.getExotic_pic());
        title.setText(weapon_info.getName());
        energy.setText(weapon_info.getElement());
        predicat.setText(weapon_info.getPredicat());
        exotic_title.setText(weapon_info.getExotic_title());
        exotic_descryption.setText(weapon_info.getExotic_descrypt());
        lore.setText(weapon_info.getLore());

        TextView impact = getView().findViewById(R.id.textView39);
        ProgressBar impact_b = getView().findViewById(R.id.progressBar14);
        impact.setText(weapon_info.getStats().get(0));
        impact_b.setProgress(Integer.parseInt(weapon_info.getStats().get(0)));

        TextView range = getView().findViewById(R.id.textView40);
        ProgressBar range_b = getView().findViewById(R.id.progressBar2);
        range.setText(weapon_info.getStats().get(1));
        range_b.setProgress(Integer.parseInt(weapon_info.getStats().get(1)));

        TextView stability = getView().findViewById(R.id.textView41);
        ProgressBar stability_b = getView().findViewById(R.id.progressBar9);
        stability.setText(weapon_info.getStats().get(2));
        stability_b.setProgress(Integer.parseInt(weapon_info.getStats().get(2)));

        TextView handling = getView().findViewById(R.id.textView43);
        ProgressBar handling_b = getView().findViewById(R.id.progressBar8);
        handling.setText(weapon_info.getStats().get(3));
        handling_b.setProgress(Integer.parseInt(weapon_info.getStats().get(3)));

        TextView r_speed = getView().findViewById(R.id.textView45);
        ProgressBar r_speed_b = getView().findViewById(R.id.progressBar6);
        r_speed.setText(weapon_info.getStats().get(4));
        r_speed_b.setProgress(Integer.parseInt(weapon_info.getStats().get(4)));

        TextView aim_assist = getView().findViewById(R.id.textView46);
        ProgressBar aim_assist_b = getView().findViewById(R.id.progressBar13);
        aim_assist.setText(weapon_info.getStats().get(5));
        aim_assist_b.setProgress(Integer.parseInt(weapon_info.getStats().get(5)));

        TextView airborne = getView().findViewById(R.id.textView47);
        ProgressBar airborne_b = getView().findViewById(R.id.progressBar12);
        airborne.setText(weapon_info.getStats().get(6));
        airborne_b.setProgress(Integer.parseInt(weapon_info.getStats().get(6)));

        TextView speed = getView().findViewById(R.id.textView49);
        speed.setText(weapon_info.getStats().get(7));

        TextView mag = getView().findViewById(R.id.textView51);
        mag.setText(weapon_info.getStats().get(8));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_navigation_exotic_to_navigation_weapon);
            }
        });

    }
}