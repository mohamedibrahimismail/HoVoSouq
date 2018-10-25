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

import com.hazem.hovosouq.Models.Deal;
import com.hazem.hovosouq.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DealsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Deal> contents;
    private Context mContext;

    public DealsAdapter(List<Deal> contents, Context mContext) {
        this.contents = contents;
        this.mContext = mContext;
    }


    @Override
    public int getItemCount() {
        return contents.size();
    }


    @Override
    public int getItemViewType(int position) {

            return position;


    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;

            if(viewType==0 || viewType==1 || viewType==4) {

                    view = LayoutInflater.from(parent.getContext())
                            .inflate(R.layout.dealsitem1, parent, false);

                    return new ViewHolder1(view);
            }


                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.dealsitem2, parent, false);

                return new ViewHolder2(view);



    }


    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {


//        if (mContext != null)
//            Glide.with(mContext).load(contents.get(position)).into(holder.image);

      /* ViewHolder1 viewHolder1 = (ViewHolder1)holder;

        if (position%5==0){
            viewHolder1.background.setBackground(mContext.getResources().getDrawable(R.drawable.bestdeal));
        }else if (position%5==1){
            viewHolder1.background.setBackground(mContext.getResources().getDrawable(R.drawable.dummy_1111));
        }else if (position%5==2){
            viewHolder1.background.setBackground(mContext.getResources().getDrawable(R.drawable.dummy_5));
        }else if (position%5==3){
            viewHolder1.background.setBackground(mContext.getResources().getDrawable(R.drawable.dummy_add));
        }else if(position%5==4) {
            viewHolder1.background.setBackground(mContext.getResources().getDrawable(R.drawable.dummy__1));
        }
*/
            if(holder.getItemViewType()==0 || holder.getItemViewType()==1 ||holder.getItemViewType()==4 ) {

                ViewHolder1 viewHolder1 = (ViewHolder1) holder;
                Picasso.get()
                        .load(contents.get(position).getBackground())
                        .resize(500, 200)
                        .into(viewHolder1.background);
                //viewHolder1.background.setImageResource(contents.get(position).getBackground());
                viewHolder1.button.setText(contents.get(position).getDeal_tags());
                return;

            }else {

                ViewHolder2 viewHolder2 = (ViewHolder2) holder;
                viewHolder2.background1.setImageResource(contents.get(position).getBackground());
                viewHolder2.button1.setText(contents.get(position).getDeal_tags());
                viewHolder2.background2.setImageResource(contents.get(position).getDeal().getBackground());
                viewHolder2.button2.setText(contents.get(position).getDeal().getDeal_tags());
                return;
            }
        }



    }


     class ViewHolder1 extends RecyclerView.ViewHolder{

        ImageView background;
        Button button;

        ViewHolder1(View view) {
            super(view);

            background = (ImageView)view.findViewById(R.id.dealtime1_background);
            button = (Button)view.findViewById(R.id.dealtime1_button);
        }



    }

    class ViewHolder2 extends RecyclerView.ViewHolder {

        ImageView background1;
        ImageView background2;
        Button button1;
        Button button2;

        ViewHolder2(View view) {
            super(view);

            background1 = (ImageView)view.findViewById(R.id.beckground_item2_1);
            background2 = (ImageView)view.findViewById(R.id.beckground_item2_2);
            button1 = (Button)view.findViewById(R.id.button_item2_1);
            button2 = (Button)view.findViewById(R.id.button_item2_2);

        }


    }


