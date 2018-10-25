package com.hazem.hovosouq.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hazem.hovosouq.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private List<String> contents;
    private Context mContext;
    public CategoryAdapter(List<String> contents, Context mContext) {
        this.contents = contents;
        this.mContext = mContext;
    }


    @Override
    public int getItemCount() {
        return contents.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;


        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_offers, parent, false);
        return new ViewHolder(view);


    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {


//        if (mContext != null)
//            Glide.with(mContext).load(contents.get(position)).into(holder.image);

        if (position%5==0){
            holder.categIV.setImageDrawable(mContext.getResources().getDrawable(R.drawable.dummy__1));
        }else if (position%5==1){
            holder.categIV.setImageDrawable(mContext.getResources().getDrawable(R.drawable.dummy_1111));
        }else if (position%5==2){
            holder.categIV.setImageDrawable(mContext.getResources().getDrawable(R.drawable.dummy_5));
        }else if (position%5==3){
            holder.categIV.setImageDrawable(mContext.getResources().getDrawable(R.drawable.dummy_add));
        }else if(position%5==4) {
            holder.categIV.setImageDrawable(mContext.getResources().getDrawable(R.drawable.dummy__1));
        }

    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.categIV)ImageView categIV;


        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }


    }

}