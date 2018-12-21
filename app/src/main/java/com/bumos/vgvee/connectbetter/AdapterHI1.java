package com.bumos.vgvee.connectbetter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AdapterHI1 extends RecyclerView.Adapter<AdapterHI1.ViewHolder> {

    Context context;
    User user;
    DayAdapter dayAdapter;

    public AdapterHI1(Context context, User user) {
        this.context = context;
        this.user = user;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(context);
        View view = li.inflate(R.layout.recyclerlistitem, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DayAdapter dayAdapter = new DayAdapter(context, user, position);
        holder.list.setAdapter(dayAdapter);
        LinearLayoutManager llm = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        holder.list.setLayoutManager(llm);
        String day;
        switch (position){
            case 1: {
                day = "Monday";
                break;
            }
            case 2: {
                day = "Tuesday";
                break;
            }
            case 3: {
                day = "Wednesday";
                break;
            }
            case 4: {
                day = "Thursday";
                break;
            }
            case 5: {
                day = "Friday";
                break;
            }
            case 6: {
                day = "Saturday";
                break;
            }
            case 7: {
                day = "Sunday";
                break;
            }
            default: {
                day = "Error";
                break;
            }
        }
        holder.day.setText(day);

    }

    @Override
    public int getItemCount() {
        return 7;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView day;
        RecyclerView list;

        public ViewHolder(View itemView) {
            super(itemView);
            day = itemView.findViewById(R.id.day);
            list = itemView.findViewById(R.id.list);
        }
    }
}
