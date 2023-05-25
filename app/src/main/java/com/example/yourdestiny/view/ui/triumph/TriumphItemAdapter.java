package com.example.yourdestiny.view.ui.triumph;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yourdestiny.R;

public class TriumphItemAdapter extends RecyclerView.Adapter<TriumphAdapter.ViewHolder> {
    Context context;
    TriumphItem_Components triumphItem_components = new TriumphItem_Components();
    String name;

    public TriumphItemAdapter(Context context, String name) {
        this.context = context;
        this.name = name;
    }

    @NonNull
    @Override
    public TriumphAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.design_re_triumph, parent, false);
        TriumphAdapter.ViewHolder viewHolder = new TriumphAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TriumphAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}