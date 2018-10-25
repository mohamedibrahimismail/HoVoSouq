package com.hazem.hovosouq.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hazem.hovosouq.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Rating extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.cloase_rating)
    public void close_rating(){
        finish();
    }
}
