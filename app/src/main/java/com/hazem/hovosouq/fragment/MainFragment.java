package com.hazem.hovosouq.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.hazem.hovosouq.R;
import com.hazem.hovosouq.activity.AllCategories;
import com.hazem.hovosouq.adapter.CategoryAdapter;
import com.hazem.hovosouq.adapter.ImagesActivityAdapter;
import com.hazem.hovosouq.adapter.OffersActivityAdapter;
import com.hazem.hovosouq.view.CircleIndicator2;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@SuppressLint("ValidFragment")
public class MainFragment extends BaseFragment implements View.OnClickListener {


    @SuppressLint("ValidFragment")
    public MainFragment() {

    }



    //init the views
    @BindView(R.id.imagesRV)RecyclerView imagesRV;
    @BindView(R.id.offersRV)RecyclerView offersRV;
    @BindView(R.id.categoryRV)RecyclerView categoryRV;
    @BindView(R.id.seeall)TextView seeall;


    ArrayList<String> imagesData = new ArrayList<>();
    ImagesActivityAdapter imagesAdapter;


    OffersActivityAdapter offersAdapter;
    CategoryAdapter categoryAdapter;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this,view);

        initViews(view);
        attachListeners();
        return view;
    }


    @OnClick(R.id.seeall)
    public void Seeall() {
       startActivity(new Intent(getContext(), AllCategories.class));
    }



    @SuppressLint("MissingSuperCall")
    @Override
    public void onLowMemory() {
    }

    @Override
    public void initViews(View view) {


        RecyclerView.LayoutManager
                layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        imagesRV.setLayoutManager(layoutManager);

        imagesAdapter = new ImagesActivityAdapter(imagesData,getContext());

        imagesRV.setAdapter(imagesAdapter);



        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        pagerSnapHelper.attachToRecyclerView(imagesRV);

        CircleIndicator2 indicator = view.findViewById(R.id.indicator);
        indicator.attachToRecyclerView(imagesRV, pagerSnapHelper);
        imagesAdapter.registerAdapterDataObserver(indicator.getAdapterDataObserver());








        RecyclerView.LayoutManager
                layoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        offersRV.setLayoutManager(layoutManager1);

        offersAdapter = new OffersActivityAdapter(imagesData,getContext());

        offersRV.setAdapter(offersAdapter);


        //todo here the category
        final StaggeredGridLayoutManager mLayoutManager =
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        categoryRV.setLayoutManager(mLayoutManager);


        categoryAdapter = new CategoryAdapter(imagesData,getContext());

        categoryRV.setAdapter(categoryAdapter);



        imagesData.add("");
        imagesData.add("");
        imagesData.add("");
        imagesData.add("");
        imagesData.add("");


        offersAdapter.notifyDataSetChanged();
        imagesAdapter.notifyDataSetChanged();
        categoryAdapter.notifyDataSetChanged();






    }

    @Override
    public void attachListeners() {
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
        }
    }

}
