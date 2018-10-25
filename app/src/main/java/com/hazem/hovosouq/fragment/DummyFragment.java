package com.hazem.hovosouq.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hazem.hovosouq.R;

import butterknife.ButterKnife;

@SuppressLint("ValidFragment")
public class DummyFragment extends BaseFragment implements View.OnClickListener {


    @SuppressLint("ValidFragment")
    public DummyFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dummy, container, false);
        ButterKnife.bind(this,view);

        initViews(view);
        attachListeners();
        return view;
    }






    @SuppressLint("MissingSuperCall")
    @Override
    public void onLowMemory() {
    }

    @Override
    public void initViews(View view) {
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
