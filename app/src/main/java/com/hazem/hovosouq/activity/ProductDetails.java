package com.hazem.hovosouq.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.hazem.hovosouq.R;
import com.hazem.hovosouq.adapter.ImagesProductAdapter;
import com.hazem.hovosouq.adapter.ProductDetailsItemColor;
import com.hazem.hovosouq.adapter.ProductDetailsItemSize;
import com.hazem.hovosouq.adapter.ProductDetailsItemSponsored;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProductDetails extends AppCompatActivity {

//    ArrayList<String> imagesData = new ArrayList<>();
    ImagesProductAdapter imagesAdapter;
    ViewPager viewPager;
    @BindView(R.id.writereview)LinearLayout writereview;
//
//    RecyclerView imagesRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        ButterKnife.bind(this);
        viewPager = (ViewPager)findViewById(R.id.product_details_slider);
        imagesAdapter = new ImagesProductAdapter(this);
        viewPager.setAdapter(imagesAdapter);
        viewPager.setCurrentItem(0);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(viewPager, true);

//        imagesRV = (RecyclerView) findViewById(R.id.imagesRV_detaile);
//        RecyclerView.LayoutManager
//                layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//
//        imagesRV.setLayoutManager(layoutManager);
//
//        imagesAdapter = new ImagesProductAdapter(imagesData,this);
//
//        imagesRV.setAdapter(imagesAdapter);
//
//        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
//        pagerSnapHelper.attachToRecyclerView(imagesRV);
//
//
//        CircleIndicator2 indicator = findViewById(R.id.indicator);
//        indicator.attachToRecyclerView(imagesRV, pagerSnapHelper);
//        imagesAdapter.registerAdapterDataObserver(indicator.getAdapterDataObserver());
//
//
//        imagesData.add("");
//        imagesData.add("");
//        imagesData.add("");
//        imagesData.add("");
//        imagesData.add("");
//
//
//        imagesAdapter.notifyDataSetChanged();


        RecyclerView rvItemColors = findViewById(R.id.rvItemColors);
        rvItemColors.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ProductDetailsItemColor productDetailsItemColor = new ProductDetailsItemColor(this);
        rvItemColors.setAdapter(productDetailsItemColor);

        RecyclerView rvItemSize = findViewById(R.id.rvItemSize);
        rvItemSize.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ProductDetailsItemSize productDetailsItemSize = new ProductDetailsItemSize(this);
        rvItemSize.setAdapter(productDetailsItemSize);

        RecyclerView rvItemsponsored = findViewById(R.id.rvItemsponsored);
        rvItemsponsored.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ProductDetailsItemSponsored productDetailsItemSponsored  = new ProductDetailsItemSponsored(this);
        rvItemsponsored.setAdapter(productDetailsItemSponsored);


    }

    @OnClick(R.id.writereview)
    public void write_review(){
        startActivity(new Intent(ProductDetails.this,Rating.class));
    }

    @OnClick(R.id.close_products_details)
    public void close(){
        finish();
    }

}
