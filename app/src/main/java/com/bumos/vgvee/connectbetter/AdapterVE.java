package com.bumos.vgvee.connectbetter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AdapterVE extends RecyclerView.Adapter<AdapterVE.ViewHolder> {

    Context context;
    User user;
    AdapterHI1 adapterHI1;

    public AdapterVE(Context context, User user) {
        this.context = context;
        this.user = user;
    }

    @NonNull
    @Override
    public AdapterVE.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(context);
        View view = li.inflate(R.layout.ve_mid, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterVE.ViewHolder holder, int position) {
        adapterHI1 = new AdapterHI1(context, user);
        holder.list1.setAdapter(adapterHI1);
        LinearLayoutManager llm = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        holder.list1.setLayoutManager(llm);
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView list1;
         public ViewHolder(View itemView) {
            super(itemView);
//            list1 = itemView.findViewById(R.id.ViewWrapperHI1);     //this is the one to be used at last
             list1 = itemView.findViewById(R.id.ViewWrapperVE);       //this is the one I'm using for testing purpose
        }
    }
}
