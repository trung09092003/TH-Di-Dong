package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.itemViewholder> {

    Context context05;
    List<item> itemList05;

    public itemAdapter(Context context, List<item> itemList) {
        this.context05 = context;
        this.itemList05 = itemList;
    }

    @NonNull
    @Override
    public itemViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context05).inflate(R.layout.row_item,parent,false);
        return new itemViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewholder holder, int position) {
        holder.image05.setImageResource(itemList05.get(position).getImage());
        holder.title05.setText(itemList05.get(position).getTitle());
        holder.text05.setText(itemList05.get(position).getText());
        holder.bt05.setText(itemList05.get(position).getBt());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context05, Details.class);
                intent.putExtra("text",itemList05.get(position).getText());
                intent.putExtra("image",itemList05.get(position).getImage());
                intent.putExtra("title",itemList05.get(position).getTitle());
                context05.startActivities(new Intent[]{intent});
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemList05.size();
    }

    public static final class itemViewholder extends RecyclerView.ViewHolder  {

        ImageView image05;
        TextView title05,text05,bt05;

        public itemViewholder(@NonNull View itemView) {
            super(itemView);
            image05=itemView.findViewById(R.id.image);
            title05=itemView.findViewById(R.id.title);
            text05=itemView.findViewById(R.id.text);
            bt05=itemView.findViewById(R.id.button);
        }
    }
    public interface OnNodeListener{
        void onNodeClick(int position);
    }
}
