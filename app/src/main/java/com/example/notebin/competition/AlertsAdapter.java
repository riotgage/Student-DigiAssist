package com.example.notebin.competition;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.notebin.R;

import java.util.List;

public class AlertsAdapter extends RecyclerView.Adapter<AlertsAdapter.MyViewHolder> {

    private Context mContext;
    private List<Competition> competitionList;
    public class MyViewHolder extends  RecyclerView.ViewHolder{
        public TextView comp_title,date,url,website;
        public ImageView thumbnail;


        public MyViewHolder(@NonNull View view) {
            super(view);
            comp_title = view.findViewById(R.id.comp_name);
            date =  view.findViewById(R.id.date);
            thumbnail =  view.findViewById(R.id.web_logo);
            url = view.findViewById(R.id.url);
            website=view.findViewById(R.id.webName);
            Log.d("Adapter", "onBindViewHolder: binded ");
        }
    }

    public AlertsAdapter(Context mContext,List<Competition> competitionList) {
        this.mContext = mContext;
        this.competitionList=competitionList;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.comp_card, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(itemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Competition competition = competitionList.get(position);
        holder.comp_title.setText(competition.getComp_name());
        holder.date.setText(competition.getDate());
        holder.website.setText(competition.getWebsite());
        holder.url.setText(competition.getLink());

        Glide.with(mContext).load(competition.getThumb()).into(holder.thumbnail);


    }

    @Override
    public int getItemCount() {
        return competitionList.size();
    }


}
