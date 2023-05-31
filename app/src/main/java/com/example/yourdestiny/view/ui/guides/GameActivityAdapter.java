package com.example.yourdestiny.view.ui.guides;


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

public class GameActivityAdapter extends RecyclerView.Adapter<GameActivityAdapter.ViewHolder> {
    Context context;
    int[] set_images;
    String[] set_titles;
    String[] titles;
    int[] images;

    private AdapterView.OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    public GameActivityAdapter (Context context, int[] images, String[] titles){
        this.context = context;
        this.set_images = images;
        this.set_titles = titles;
        this.titles = new String[titles.length];
        this.images = new int[images.length];
        int random_number;
        for (int i = 0; i <= images.length-1; i++){
            this.titles[i] = set_titles[i];
            this.images[i] = set_images[i];
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;
        AdapterView.OnItemClickListener mItemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.ga_img);
            title = itemView.findViewById(R.id.ga_title);
        }
    }

    @NonNull
    @Override
    public GameActivityAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.game_activity_re, parent, false);
        com.example.yourdestiny.view.ui.guides.GameActivityAdapter.ViewHolder viewHolder = new com.example.yourdestiny.view.ui.guides.GameActivityAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(titles[position]);
        holder.image.setImageResource(images[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("Name", holder.title.getText().toString());
                Navigation.findNavController(v).navigate(R.id.action_navigation_game_activity_to_navigation_activity_card, bundle);
            }
        });
    }


    @Override
    public int getItemCount() {
        return titles.length;
    }
}


