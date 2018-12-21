package com.bumos.vgvee.connectbetter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.time.format.DateTimeFormatter;

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.viewHolder> {

    Context context;
    User user;
    int pos;

    public DayAdapter(Context context, User user, int pos) {
        this.context = context;
        this.user = user;
        this.pos = pos;
    }

    @NonNull
    @Override
    public DayAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerlistitem, parent, false);
        viewHolder viewHolder = new viewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DayAdapter.viewHolder holder, int position) {
        session session = user.dailySessions.get(pos).daySession.get(position);
        String subjectName = session.subject.subjectName;
        String location = session.venue;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        String sessionTime = session.startTime.format(dtf);
        int colour_circle;
        float attendance = user.attendanceObj.AttPercentage;
        if(attendance <= 0.6){
            colour_circle = R.drawable.red;
        }else if(attendance > 0.6 && attendance <= 0.75){
            colour_circle = R.drawable.yellow;
        }else{
            colour_circle = R.drawable.green;
        }

        Picasso.get().load(colour_circle).into(holder.colour_circle);
        holder.sessionTime.setText(sessionTime);
        holder.location.setText(location);
        holder.subject_name.setText(subjectName);
    }

    @Override
    public int getItemCount() {
        return user.dailySessions.get(pos).daySession.size();
    }

    class viewHolder extends RecyclerView.ViewHolder{
        ImageView colour_circle;
        TextView subject_name, location, sessionTime;
        public viewHolder(View itemView) {
            super(itemView);
            colour_circle = itemView.findViewById(R.id.colour_circle);
            subject_name = itemView.findViewById(R.id.subject_name);
            location = itemView.findViewById(R.id.location);
            sessionTime = itemView.findViewById(R.id.sTime);
        }
    }
}
