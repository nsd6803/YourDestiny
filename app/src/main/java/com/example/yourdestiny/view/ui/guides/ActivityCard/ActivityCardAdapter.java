package com.example.yourdestiny.view.ui.guides.ActivityCard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yourdestiny.R;

import java.util.Arrays;
import java.util.List;

public class ActivityCardAdapter extends RecyclerView.Adapter<ActivityCardAdapter.ViewHolder> {
    Context context;
    List<String> set_descryption;
    List<String> set_titles;
    List<String> titles;
    List<String> descryption;

    private AdapterView.OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    public ActivityCardAdapter (Context context, List<String> descryption, List<String> titles){
        this.context = context;
        this.set_descryption = descryption;
        this.set_titles = titles;
        this.titles = Arrays.asList(new String[titles.size()]);
        this.descryption = Arrays.asList(new String[titles.size()]);
        int random_number;
        for (int i = 0; i <= descryption.size()-1; i++){
            this.titles.set(i, set_titles.get(i));
            this.descryption.set(i, set_descryption.get(i));
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private static final String TAG = "MyApp";

        TextView description;
        TextView title;
        AdapterView.OnItemClickListener mItemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            description = itemView.findViewById(R.id.encounter_description);
            title = itemView.findViewById(R.id.encounter_title);
        }
    }

    @NonNull
    @Override
    public ActivityCardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.design_activity_card, parent, false);
        ActivityCardAdapter.ViewHolder viewHolder = new ActivityCardAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ActivityCardAdapter.ViewHolder holder, int position) {
        holder.title.setText(titles.get(position));
        holder.description.setText(descryption.get(position));
    }


    @Override
    public int getItemCount() {
        return titles.size();
    }
}