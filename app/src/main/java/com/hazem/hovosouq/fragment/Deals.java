package com.hazem.hovosouq.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.hazem.hovosouq.Models.Deal;
import com.hazem.hovosouq.R;
import com.hazem.hovosouq.adapter.AllCategoriesAdapter;
import com.hazem.hovosouq.adapter.DealsAdapter;
import com.hazem.hovosouq.adapter.ImagesActivityAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Deals extends Fragment {

    @BindView(R.id.all_categories_recyclerview) RecyclerView recyclerView;


    DealsAdapter dealsAdapter;
    private List<Deal> deals;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);





    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_deals, container, false);
        ButterKnife.bind(this,view);

        initviews();


        return view;
    }

    private void initviews() {
        deals = new ArrayList<>();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        dealsAdapter = new DealsAdapter(deals,getContext());
        recyclerView.setAdapter(dealsAdapter);

        deals.add(new Deal(R.drawable.bestdeals,"beast Deals",null));
        deals.add(new Deal(R.drawable.mobiles,"Mobiles",null));
        deals.add(new Deal(R.drawable.item2,"Hair Cutting",new Deal(R.drawable.item3,"Laptops",null)));
        deals.add(new Deal(R.drawable.classic_swites,"Suits",new Deal(R.drawable.casual,"Casual",null)));
        deals.add(new Deal(R.drawable.cars,"Cars",null));
      /*  deals.add(new Deal(R.drawable.item2,"Hair Cutting",new Deal(R.drawable.item3,"Laptops",null)));
        deals.add(new Deal(R.drawable.item2,"Hair Cutting",new Deal(R.drawable.item3,"Laptops",null)));
        deals.add(new Deal(R.drawable.item2,"Hair Cutting",new Deal(R.drawable.item3,"Laptops",null)));
*/
        dealsAdapter.notifyDataSetChanged();
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }



}
