package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class orderAdapter extends RecyclerView.Adapter<orderAdapter.orderViewholder>{
        Context context05;
        int row_layout05;
        List<orderItem> itemList05;

        public orderAdapter(Context context, List<orderItem> itemList, int row_layout) {
            this.context05 = context;
            this.itemList05 = itemList;
            this.row_layout05=row_layout;
        }

    @NonNull
    @Override
    public orderViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemView =layoutInflater.inflate(row_layout05,parent,false);
        return new orderViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull orderViewholder holder, int position) {
        holder.image05.setImageResource(itemList05.get(position).getImage());
        holder.title05.setText(itemList05.get(position).getTitle());
        holder.price05.setText(itemList05.get(position).getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(context, chitietorder.class);
//                intent.putExtra("text",itemList.get(position).getTitle());
//                intent.putExtra("image",itemList.get(position).getImage());
//                intent.putExtra("title",itemList.get(position).getTitle());
//                context.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList05.size();
    }

    public static final class orderViewholder extends RecyclerView.ViewHolder  {

            ImageView image05;
            TextView title05,price05;

            public orderViewholder(@NonNull View itemView) {
                super(itemView);
                image05=itemView.findViewById(R.id.image);
                title05=itemView.findViewById(R.id.title);
                price05=itemView.findViewById(R.id.price);
            }
        }
    }

