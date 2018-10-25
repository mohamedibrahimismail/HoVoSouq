package com.hazem.hovosouq.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.hazem.hovosouq.R;
import com.hazem.hovosouq.adapter.ProductAdapter;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Products extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        ButterKnife.bind(this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        recyclerView = findViewById(R.id.recyclerViewProducts);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(Products.this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapter = new ProductAdapter(this);

        recyclerView.setAdapter(adapter);
    }

    boolean checkView = false;
    public void changeView(View view) {
        if (checkView) {
            view.setBackgroundResource(R.drawable.collection_grid);
            RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(Products.this, 1);
            recyclerView.setLayoutManager(mLayoutManager);
            adapter.notifyDataSetChanged();
            checkView = false;
        }else {
            view.setBackgroundResource(R.drawable.collection_linear);
            RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(Products.this, 2);
            recyclerView.setLayoutManager(mLayoutManager);
            adapter.notifyDataSetChanged();
            checkView = true;
        }
    }

    @OnClick(R.id.close_products)
    public  void  close(){
        finish();
    }


}
