package com.example.yourdestiny.view.ui.guides;


import android.content.Context;
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

        private static final String TAG = "MyApp";

        ImageView image;
        TextView title;
        AdapterView.OnItemClickListener mItemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.ga_img);
            title = itemView.findViewById(R.id.ga_title);

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
    }


    //@Override
    //public void onBindViewHolder(@NonNull com.example.yourdestiny.view.ui.guides.GameActivityFragment.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
    //    holder.title.setText(titles[position]);
    //    holder.itemView.setOnClickListener(new View.OnClickListener() {
    //        @Override
    //        public void onClick(View v) {
    //            Bundle bundle = new Bundle();
    //            bundle.putString("Name", holder.title.getText().toString());
    //            Navigation.findNavController(v).navigate(R.id.action_navigation_triumph_to_navigation_triumph_item, bundle);
    //        }
    //    });
    //}

    @Override
    public int getItemCount() {
        return titles.length;
    }
}


