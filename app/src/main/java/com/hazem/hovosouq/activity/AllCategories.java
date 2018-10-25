package com.hazem.hovosouq.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;
import android.widget.Toast;

import com.hazem.hovosouq.Communicators.Switcher1;
import com.hazem.hovosouq.R;
import com.hazem.hovosouq.adapter.AllCategoriesAdapter;
import com.hazem.hovosouq.adapter.CategoryAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AllCategories extends AppCompatActivity implements Switcher1 {

    @BindView(R.id.all_categories_recyclerview) RecyclerView all_cateogories;
    @BindView(R.id.back_arrow) ImageButton back_button;

    AllCategoriesAdapter categoryAdapter;
    private List<String> contents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_categories);

        ButterKnife.bind(this);


        contents = new ArrayList<>();
        final StaggeredGridLayoutManager mLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        all_cateogories.setLayoutManager(mLayoutManager);
        categoryAdapter = new AllCategoriesAdapter(contents,this);
        all_cateogories.setAdapter(categoryAdapter);


        add_data_to_recyclerview();

        categoryAdapter.notifyDataSetChanged();



    }

    @OnClick(R.id.back_arrow)
    public void Seeall() {
        finish();
    }


    public void add_data_to_recyclerview(){
       for(int a = 0;a<30;a++){
           contents.add("");
       }
    }

    @Override
    public void get_category(int position) {

       // Toast.makeText(this,position+"",Toast.LENGTH_SHORT).show();

        startActivity(new Intent(this,Selected_Category.class));

    }
}
