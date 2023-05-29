package com.example.yourdestiny.view.ui.profile;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yourdestiny.R;

public class NewsAdapter extends RecyclerView.Adapter<com.example.yourdestiny.view.ui.profile.NewsAdapter.ViewHolder> {
    Context context;
    int[] set_images;
    String[] set_titles;
    String[] titles;
    int[] images;

    String[] url;
    String[] set_url;

    private AdapterView.OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    public NewsAdapter (Context context, int[] images, String[] titles, String[] url){
        this.context = context;
        this.set_images = images;
        this.set_titles = titles;
        this.set_url = url;
        this.titles = new String[titles.length];
        this.images = new int[images.length];
        this.url = new String[url.length];
        int random_number;
        for (int i = 0; i <= images.length-1; i++){
            this.titles[i] = set_titles[i];
            this.images[i] = set_images[i];
            this.url[i] = set_url[i];
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private static final String TAG = "MyApp";

        ImageView image;
        TextView title;
        AdapterView.OnItemClickListener mItemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView45);
            title = itemView.findViewById(R.id.textView18);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition() + 1;
                    Log.i(TAG, "Клик " + pos + " элемента");
                    Toast.makeText(image.getContext(), "Клик " + pos + " элемента", Toast.LENGTH_SHORT).show();

                }
            });
        }
    }

    @NonNull
    @Override
    public com.example.yourdestiny.view.ui.profile.NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.design_re_news_full, parent, false);
        com.example.yourdestiny.view.ui.profile.NewsAdapter.ViewHolder viewHolder = new com.example.yourdestiny.view.ui.profile.NewsAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.yourdestiny.view.ui.profile.NewsAdapter.ViewHolder holder, int position) {
        holder.title.setText(titles[position]);
        holder.image.setImageResource(images[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = url[position];
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(link));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}


