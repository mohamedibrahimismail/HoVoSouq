package com.hazem.hovosouq.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hazem.hovosouq.Communicators.Switcher2;
import com.hazem.hovosouq.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Select_CategoryAdapter extends RecyclerView.Adapter<Select_CategoryAdapter.ViewHolder> {

    private List<String> contents;
    private Context mContext;
    public static  Switcher2 switcher2;
    public Select_CategoryAdapter(List<String> contents, Context mContext) {
        this.contents = contents;
        this.mContext = mContext;
        switcher2 = (Switcher2)mContext;
    }


    @Override
    public int getItemCount() {
        return contents.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;


        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.men_fashoin_item, parent, false);
        return new ViewHolder(view);


    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {


//        if (mContext != null)
//            Glide.with(mContext).load(contents.get(position)).into(holder.image);

        if (position%5==0){
            holder.category_item.setBackground(mContext.getResources().getDrawable(R.drawable.men_fashoin1));
        }else if (position%5==1){
            holder.category_item.setBackground(mContext.getResources().getDrawable(R.drawable.men_fashoin2));
        }else if (position%5==2){
            holder.category_item.setBackground(mContext.getResources().getDrawable(R.drawable.men_fashoin3));
        }else if (position%5==3){
            holder.category_item.setBackground(mContext.getResources().getDrawable(R.drawable.men_fashoin4));
        }

    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.category_item)RelativeLayout category_item;
        @BindView(R.id.ClickedItems)Button button;

        ViewHolder(View view) {

            super(view);
            ButterKnife.bind(this, view);

         }

         @OnClick(R.id.ClickedItems)
         public void getdetailes(){
             switcher2.get_category(getAdapterPosition());
        }

    }

}