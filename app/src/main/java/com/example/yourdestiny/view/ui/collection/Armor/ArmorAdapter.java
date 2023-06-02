package com.example.yourdestiny.view.ui.collection.Armor;

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
import com.example.yourdestiny.model.armorDB.Armor;

import java.util.Arrays;
import java.util.List;

public class ArmorAdapter  extends RecyclerView.Adapter<ArmorAdapter.ViewHolder> {
    Context context;
    List<Armor> armors;
    List<String> titles;
    List<String> types;
    List<Integer> pic;

    String from_new;
    private AdapterView.OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    public ArmorAdapter(Context context, List<Armor> weapons, String from_new) {
        this.context = context;
        this.armors = weapons;
        this.titles = Arrays.asList(new String[weapons.size()]);
        this.types = Arrays.asList(new String[weapons.size()]);
        this.pic = Arrays.asList(new Integer[weapons.size()]);
        for (int i = 0; i <= weapons.size() - 1; i++) {
            this.titles.set(i, weapons.get(i).getName());
            this.types.set(i, weapons.get(i).getType());
            this.pic.set(i, weapons.get(i).getPic());
        }
        this.from_new = from_new;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView type;
        TextView element;
        ImageView pic;
        AdapterView.OnItemClickListener mItemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView52);
            type = itemView.findViewById(R.id.textView53);
            pic = itemView.findViewById(R.id.imageButton5);
        }
    }

    @NonNull
    @Override
    public ArmorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.design_armor_re, parent, false);
        ArmorAdapter.ViewHolder viewHolder = new ArmorAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ArmorAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.title.setText(titles.get(position));
        holder.type.setText(types.get(position));
        holder.pic.setImageResource(pic.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("Name", holder.title.getText().toString());
                bundle.putString("from", from_new);
                if (from_new == "yes") {
                    Navigation.findNavController(v).navigate(R.id.action_navigation_new_to_navigation_armor_item, bundle);
                }
                else{
                    Navigation.findNavController(v).navigate(R.id.action_navigation_armor_to_navigation_armor_item, bundle);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return titles.size();
    }
}
