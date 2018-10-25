package com.hazem.hovosouq.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.hazem.hovosouq.R;


public class ImagesProductAdapter  extends PagerAdapter {

    LayoutInflater inflater;
    Context context;


    public ImagesProductAdapter(Context context) {
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;

    }


    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public int getCount()
    {
        return 3;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((View)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        final View itemView;
        itemView = inflater.inflate(R.layout.product_item_image, container, false);


        container.addView(itemView);

        return itemView;
    }


}