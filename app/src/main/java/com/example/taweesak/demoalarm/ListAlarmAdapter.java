package com.example.taweesak.demoalarm;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAlarmAdapter extends RecyclerView.Adapter<ListAlarmAdapter.ListAlarmViewHolder>{

    private Context mContext;
    private ArrayList<String> notiStringArrayList, dayStringArrayList, monthStringArrayList,
            hourStringArrayList, minuteStringArrayList;
    private LayoutInflater layoutInflater;

    public ListAlarmAdapter(Context mContext,
                            ArrayList<String> notiStringArrayList,
                            ArrayList<String> dayStringArrayList,
                            ArrayList<String> monthStringArrayList,
                            ArrayList<String> hourStringArrayList,
                            ArrayList<String> minuteStringArrayList) {

        this.layoutInflater = LayoutInflater.from(mContext);
        this.notiStringArrayList = notiStringArrayList;
        this.dayStringArrayList = dayStringArrayList;
        this.monthStringArrayList = monthStringArrayList;
        this.hourStringArrayList = hourStringArrayList;
        this.minuteStringArrayList = minuteStringArrayList;
    } // Constructor Class

    @NonNull
    @Override
    public ListAlarmViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {




        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAlarmViewHolder listAlarmViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return notiStringArrayList.size();
    }


    public class ListAlarmViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewNoti,textViewDay,
                textViewMonth,textViewHour,textViewMinute;

        public ListAlarmViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewNoti = itemView.findViewById(R.id.textViewNoti);
            textViewDay = itemView.findViewById(R.id.textViewDay);
            textViewMonth = itemView.findViewById(R.id.textViewMonth);
            textViewHour = itemView.findViewById(R.id.textViewHour);
            textViewMinute = itemView.findViewById(R.id.textViewMinute);

        }

    }// ViewHolder Class


} // Main Class