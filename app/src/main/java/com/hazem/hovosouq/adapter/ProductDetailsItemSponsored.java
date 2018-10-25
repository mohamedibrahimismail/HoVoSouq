package com.hazem.hovosouq.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hazem.hovosouq.R;

/**
 * Created by Ahmed AbdElQader on 21-Oct-18.
 */

public class ProductDetailsItemSponsored extends RecyclerView.Adapter<ProductDetailsItemSponsored.ViewHolder> {

    private LayoutInflater mInflater;

    public ProductDetailsItemSponsored(Context context) {
        this.mInflater = LayoutInflater.from(context);
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.details_item_sponsored, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {



    }

    // total number of rows
    @Override
    public int getItemCount() {
        return 8;
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {


        ViewHolder(View itemView) {
            super(itemView);
        }
    }

}