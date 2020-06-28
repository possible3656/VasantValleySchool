package com.example.vasantvalleyschool.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vasantvalleyschool.Model.NotificationModel;
import com.example.vasantvalleyschool.R;

import java.util.ArrayList;


public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {

    Context context;
    ArrayList<NotificationModel> arrayList;

    public NotificationAdapter(Context context, ArrayList<NotificationModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_home_recycler_view,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(arrayList.get(position).getMessage());
    }

    @Override
    public int getItemCount() {
       return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.messageNotification);

        }
    }
}
