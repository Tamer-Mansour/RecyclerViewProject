package com.example.recyclerviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyCardAdapter extends RecyclerView.Adapter<MyCardAdapter.ViewHolder> {
    ArrayList<MyCardJob> myCardJobs;
    Context context;

    public MyCardAdapter(ArrayList<MyCardJob> myCardJobs, MainActivity activity) {
        this.myCardJobs = myCardJobs;
        this.context = activity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.movie_item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyCardJob myCardJobList = myCardJobs.get(position);
        holder.textViewName.setText(myCardJobList.getCardName());
        holder.textViewJob.setText(myCardJobList.getCardJob());
        holder.appLogo.setImageResource(myCardJobList.getCardImage());

        holder.itemView.setOnClickListener(v -> Toast.makeText(context, myCardJobList.getCardName(), Toast.LENGTH_SHORT).show());

    }

    @Override
    public int getItemCount() {
        return myCardJobs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView appLogo;
        TextView textViewName, textViewJob;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            appLogo = itemView.findViewById(R.id.ivCamera);
            textViewName = itemView.findViewById(R.id.tvName);
            textViewJob = itemView.findViewById(R.id.tvJob);
        }
    }
}
