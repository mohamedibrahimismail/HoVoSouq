package com.hazem.hovosouq.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hazem.hovosouq.R;

/**
 * Created by Ahmed AbdElQader on 21-Oct-18.
 */

public class ProductDetailsItemSize extends RecyclerView.Adapter<ProductDetailsItemSize.ViewHolder> {

    private LayoutInflater mInflater;
    String data[] = {"4 US","6 US","4.5 US","5.5 US"};

    public ProductDetailsItemSize(Context context) {
        this.mInflater = LayoutInflater.from(context);
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.details_item_size, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.details_item_size_textview.setText(data[position]);

        if (position == 1) {
            holder.details_item_size_textview.setBackgroundResource(R.drawable.recycler_item_selected);
            holder.details_item_size_textview.setTextColor(R.color.recycler_details_selected_item);
        }else {
            holder.details_item_size_textview.setBackgroundResource(R.drawable.recycler_item_not_selected);
            holder.details_item_size_textview.setTextColor(R.color.recycler_details_not_selected_item);
        }
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return data.length;
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView details_item_size_textview;

        ViewHolder(View itemView) {
            super(itemView);
            details_item_size_textview = itemView.findViewById(R.id.details_item_size_textview);
        }
    }

}