package com.hazem.hovosouq.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hazem.hovosouq.R;

/**
 * Created by Ahmed AbdElQader on 21-Oct-18.
 */

public class ProductDetailsItemColor extends RecyclerView.Adapter<ProductDetailsItemColor.ViewHolder> {

    private LayoutInflater mInflater;

    public ProductDetailsItemColor(Context context) {
        this.mInflater = LayoutInflater.from(context);
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.details_item_color, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if (position == 0)
            holder.details_item_color_imageview.setBackgroundResource(R.drawable.recycler_item_selected);
        else
            holder.details_item_color_imageview.setBackgroundResource(R.drawable.recycler_item_not_selected);

    }

    // total number of rows
    @Override
    public int getItemCount() {
        return 1;
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView details_item_color_imageview;

        ViewHolder(View itemView) {
            super(itemView);
            details_item_color_imageview = itemView.findViewById(R.id.details_item_color_imageview);
        }
    }

}