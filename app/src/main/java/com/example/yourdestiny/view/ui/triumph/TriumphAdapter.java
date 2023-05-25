package com.example.yourdestiny.view.ui.triumph;

import android.annotation.SuppressLint;
import android.content.Context;
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
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yourdestiny.R;

public class TriumphAdapter extends RecyclerView.Adapter<TriumphAdapter.ViewHolder> {
    Context context;
    int[] set_images;
    String[] set_titles;
    String[] titles;
    int[] images;

    private AdapterView.OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    public TriumphAdapter (Context context, int[] images, String[] titles){
        this.context = context;
        this.set_images = images;
        this.set_titles = titles;
        this.titles = new String[6];
        this.images = new int[6];
        int random_number;
        for (int i = 0; i <= 5; i++){
            this.titles[i] = set_titles[i];
            this.images[i] = set_images[i];
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private static final String TAG = "MyApp";

        ImageView image;
        TextView title;
        AdapterView.OnItemClickListener mItemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_res);
            title = itemView.findViewById(R.id.text_list_res);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition() + 1;
                    //Bundle bundle = new Bundle();
                    //bundle.putInt("NUmber", pos);
                    //Navigation.findNavController(v).navigate(R.id.action_navigation_triumph_to_navigation_triumph_item);
                    Log.i(TAG, "Клик " + pos + " элемента");
                    Toast.makeText(image.getContext(), "Клик " + pos + " элемента", Toast.LENGTH_SHORT).show();

                }
            });
        }
    }

    @NonNull
    @Override
    public TriumphAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.design_re_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TriumphAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.image.setImageResource(images[position]);
        holder.title.setText(titles[position]);
        System.out.println(images[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("Name", holder.title.getText().toString());
                bundle.putInt("Image", images[position]);
                Navigation.findNavController(v).navigate(R.id.action_navigation_triumph_to_navigation_triumph_item, bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}

