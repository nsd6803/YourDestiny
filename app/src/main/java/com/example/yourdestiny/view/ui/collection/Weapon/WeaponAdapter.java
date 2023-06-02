package com.example.yourdestiny.view.ui.collection.Weapon;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yourdestiny.R;
import com.example.yourdestiny.model.weaponDB.Weapon;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WeaponAdapter extends RecyclerView.Adapter<WeaponAdapter.ViewHolder> {
    Context context;
    List<Weapon> weapons;
    List<String> titles;
    List<String> types;
    List<String> element;
    List<Integer> pic;
    List<String> rare;

    String from_new;


    private AdapterView.OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    public WeaponAdapter (Context context, List<Weapon> weapons, String from_new){
        this.context = context;
        this.weapons = weapons;
        this.titles = Arrays.asList(new String[weapons.size()]);
        this.types = Arrays.asList(new String[weapons.size()]);
        this.element = Arrays.asList(new String[weapons.size()]);
        this.pic = Arrays.asList(new Integer[weapons.size()]);
        this.rare = Arrays.asList(new String[weapons.size()]);
        for (int i = 0; i <= weapons.size()-1; i++){
            this.titles.set(i, weapons.get(i).getName());
            this.types.set(i, weapons.get(i).getType());
            this.element.set(i, weapons.get(i).getElement());
            this.pic.set(i, weapons.get(i).getPic());
            this.rare.set(i, weapons.get(i).getRare());
        }
        this.from_new = from_new;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView type;
        TextView element;
        ImageView pic;
        AdapterView.OnItemClickListener mItemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView23);
            type = itemView.findViewById(R.id.textView24);
            element = itemView.findViewById(R.id.textView25);
            pic = itemView.findViewById(R.id.imageButton);
        }
    }

    @NonNull
    @Override
    public WeaponAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.design_weapon_re, parent, false);
        WeaponAdapter.ViewHolder viewHolder = new WeaponAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull WeaponAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.title.setText(titles.get(position));
        holder.type.setText(types.get(position));
        holder.element.setText(element.get(position));
        holder.pic.setImageResource(pic.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("Name", holder.title.getText().toString());
                bundle.putString("from", from_new);
                if(from_new == "yes") {
                    if (Objects.equals(rare.get(position), "Экзотическое")) {
                        Navigation.findNavController(v).navigate(R.id.action_navigation_new_to_navigation_exotic, bundle);
                    } else {
                        Navigation.findNavController(v).navigate(R.id.action_navigation_new_to_navigation_legendary, bundle);
                    }
                }
                else{
                    if (Objects.equals(rare.get(position), "Экзотическое")) {
                        Navigation.findNavController(v).navigate(R.id.action_navigation_weapon_to_navigation_exotic, bundle);
                    } else {
                        Navigation.findNavController(v).navigate(R.id.action_navigation_weapon_to_navigation_legendary, bundle);
                    }
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return titles.size();
    }
}