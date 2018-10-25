package com.hazem.hovosouq.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.hazem.hovosouq.R;
import com.hazem.hovosouq.adapter.SearchAdapter;


public class SearchFragment extends Fragment {



    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    TextView search_edittext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_search, container, false);

        search_edittext = (EditText) view.findViewById(R.id.search_edittext);
        search_edittext.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
//                    performSearch();
                    return true;
                }
                return false;
            }
        });

        RecyclerView rvItemSearch = view.findViewById(R.id.rvItemSearch);
        rvItemSearch.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        SearchAdapter productDetailsItemColor = new SearchAdapter(getActivity());
        rvItemSearch.setAdapter(productDetailsItemColor);


        return view;
    }










}
