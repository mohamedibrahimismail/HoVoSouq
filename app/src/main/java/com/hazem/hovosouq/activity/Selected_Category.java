package com.hazem.hovosouq.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.ImageButton;

import com.hazem.hovosouq.Communicators.Switcher2;
import com.hazem.hovosouq.R;
import com.hazem.hovosouq.adapter.AllCategoriesAdapter;
import com.hazem.hovosouq.adapter.Select_CategoryAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Selected_Category extends AppCompatActivity implements Switcher2{

    @BindView(R.id.all_categories_recyclerview)
    RecyclerView all_cateogories;
    @BindView(R.id.back_arrow)
    ImageButton back_button;

    Select_CategoryAdapter categoryAdapter;
    private List<String> contents;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected__category);


        ButterKnife.bind(this);


        contents = new ArrayList<>();
        final StaggeredGridLayoutManager mLayoutManager =
                new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        all_cateogories.setLayoutManager(mLayoutManager);


        categoryAdapter = new Select_CategoryAdapter(contents,this);

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

        startActivity(new Intent(Selected_Category.this,Products.class));
    }
}
