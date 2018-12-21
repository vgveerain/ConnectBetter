package com.bumos.vgvee.connectbetter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class AdapterHI2 extends RecyclerView.Adapter<AdapterHI2.ViewHolder> {

    Context context;
    User user;

    public AdapterHI2(Context context, User user) {
        this.context = context;
        this.user = user;
    }

    @NonNull
    @Override
    public AdapterHI2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHI2.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
