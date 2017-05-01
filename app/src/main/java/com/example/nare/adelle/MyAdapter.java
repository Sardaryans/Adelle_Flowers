package com.example.nare.adelle;

import android.content.Context;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Itemclass> listitem;
    private Context context;


    public MyAdapter(List<Itemclass> listitem, Context context) {
        this.listitem = listitem;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        final Itemclass itemclass = listitem.get(position);

        holder.imageView.setImageResource(itemclass.getImg());
        holder.model.setText(itemclass.getModel());
        holder.inform.setText(itemclass.getInfo());
        holder.gin.setText(itemclass.getGin());

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Nkar.class);
                intent.putExtra("key",itemclass.getImg());
                intent.putExtra("key1",itemclass.getModel());
                intent.putExtra("key2",itemclass.getGin());
                context.startActivity(intent);
            }
        });

        holder.btnbuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Buy.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView model,inform,gin;
        private Button btnbuy;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.imgview);
            model = (TextView)itemView.findViewById(R.id.model);
            inform = (TextView)itemView.findViewById(R.id.info1);
            gin = (TextView)itemView.findViewById(R.id.gin);
            btnbuy = (Button)itemView.findViewById(R.id.btnbuy);

        }
    }
}
