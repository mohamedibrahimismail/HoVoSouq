package com.hazem.hovosouq.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.hazem.hovosouq.R;
import com.hazem.hovosouq.adapter.SearchAdapter;

public class SearchActivity extends AppCompatActivity {

    TextView search_edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        search_edittext = (EditText) findViewById(R.id.search_edittext);
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

        RecyclerView rvItemSearch = findViewById(R.id.rvItemSearch);
        rvItemSearch.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        SearchAdapter productDetailsItemColor = new SearchAdapter(this);
        rvItemSearch.setAdapter(productDetailsItemColor);


    }
}
