package com.example.yourdestiny.view.ui.triumph;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yourdestiny.R;
import com.example.yourdestiny.model.triumphDB.Triumph;

import java.util.Arrays;
import java.util.Objects;

public class TriumphItemAdapter extends RecyclerView.Adapter<TriumphItemAdapter.ViewHolder> {
    Context context;
    String name;
    TextView N_A_M_E;
    Triumph triumphs;
    String[] titles;
    String[] descriptions;
    String[] isCheck;
    ProgressBar progressBar;
    TriumphItemViewModel triumphItemViewModel;

    private AdapterView.OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    public TriumphItemAdapter (Context context, String name, TextView N_A_M_E, Triumph triumphs, ProgressBar progressBar, TriumphItemViewModel triumphItemViewModel){
        this.context = context;
        this.name = name;
        this.N_A_M_E = N_A_M_E;
        this.triumphs = triumphs;
        this.triumphItemViewModel = triumphItemViewModel;
        this.titles = new String[triumphs.title.size()];
        this.descriptions = new String[triumphs.title.size()];
        this.isCheck = new String[triumphs.title.size()];
        for (int i = 0; i <= triumphs.title.size()-1; i++){
            this.titles[i] = triumphs.title.get(i);
            this.descriptions[i] = triumphs.description.get(i);
            this.isCheck[i] = triumphItemViewModel.repository.db_T.triumphDao().getTriumph(name).getIsChecked().get(i);
        }
        this.progressBar = progressBar;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView desctiption;
        CheckBox isCheck;

        AdapterView.OnItemClickListener mItemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.task_name);
            desctiption = itemView.findViewById(R.id.textView14);
            isCheck = itemView.findViewById(R.id.checkBox2);

        }
    }

    @NonNull
    @Override
    public TriumphItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.design_re_triumph, parent, false);
        TriumphItemAdapter.ViewHolder viewHolder = new TriumphItemAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TriumphItemAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Log.d("MEOW", String.valueOf(changeState()));
        holder.title.setText(titles[position]);
        holder.desctiption.setText(descriptions[position]);
        holder.isCheck.setOnCheckedChangeListener(null); // Сбрасываем слушатель, чтобы избежать перезапуска обработчика
        holder.isCheck.setChecked(Boolean.valueOf(isCheck[position]));
        holder.isCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                isCheck[position] = String.valueOf(holder.isCheck.isChecked());
                progressBar.setProgress((int)((changeState()/(float)isCheck.length)*100));
                triumphItemViewModel.repository.triumphInfo.setIsChecked(position, titles[position], String.valueOf(holder.isCheck.isChecked()));
                triumphItemViewModel.repository.db_T.triumphDao().UpdateTriumph(Arrays.asList(isCheck), name);
                if(changeState() == isCheck.length){
                    N_A_M_E.setTextColor(context.getResources().getColor(R.color.green));
                }
                else{
                    N_A_M_E.setTextColor(context.getResources().getColor(R.color.white));
                }
            }
        });

    }


    @Override
    public int getItemCount() {
        return titles.length;
    }

    public int changeState(){
        int count = 0;
        for(int i = 0; i < isCheck.length; i++){
            if(Objects.equals(isCheck[i], "true")){
                count += 1;
            }
        }

        return count;
    }

}