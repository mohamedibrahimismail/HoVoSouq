package com.hazem.hovosouq.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.hazem.hovosouq.R;
import com.hazem.hovosouq.adapter.ViewPagerAdapter;
import com.hazem.hovosouq.fragment.Deals;
import com.hazem.hovosouq.fragment.DummyFragment;
import com.hazem.hovosouq.fragment.MainFragment;
import com.hazem.hovosouq.fragment.Profile;
import com.hazem.hovosouq.fragment.SearchFragment;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    //init the views

    private ViewPager viewPager;
    private TabLayout tabLayout;


    //the icons of tablayout  icon white  don't selected
    private int[] tabIcons = {
            R.drawable.home_gray,
            R.drawable.tag_gray,
            R.drawable.search_gray,
            R.drawable.cart_gray,
            R.drawable.account_gray
    };
    // icon of tab layout selected blue icons
    private int[] tabIconsSelected = {
            R.drawable.home,
            R.drawable.tag,
            R.drawable.search,
            R.drawable.cart,
            R.drawable.account_,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tabs);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);





        setupTabIcons();



    }


    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new MainFragment(), "");
        adapter.addFragment(new Deals(), "");
        adapter.addFragment(new SearchFragment(), "");
        adapter.addFragment(new DummyFragment(), "");
        adapter.addFragment(new Profile(), "");

        viewPager.setAdapter(adapter);

        viewPager.setOffscreenPageLimit(5);

    }



    /**
     * set up the tab icons to the tab layout and inti the custom view to it
     */
    private void setupTabIcons() {
        final View view0 = getLayoutInflater().inflate(R.layout.custom_tab, null);
        ((ImageView) view0.findViewById(R.id.image_tab)).setImageResource(R.drawable.home);
        tabLayout.getTabAt(0).setCustomView(view0);

        View view1 = getLayoutInflater().inflate(R.layout.custom_tab, null);
        ((ImageView) view1.findViewById(R.id.image_tab)).setImageResource(tabIcons[1]);
        tabLayout.getTabAt(1).setCustomView(view1);

        View view2 = getLayoutInflater().inflate(R.layout.custom_tab, null);
        ((ImageView) view2.findViewById(R.id.image_tab)).setImageResource(tabIcons[2]);
        tabLayout.getTabAt(2).setCustomView(view2);

        View view3 = getLayoutInflater().inflate(R.layout.custom_tab, null);
        ((ImageView) view3.findViewById(R.id.image_tab)).setImageResource(tabIcons[3]);
        tabLayout.getTabAt(3).setCustomView(view3);



        View view4 = getLayoutInflater().inflate(R.layout.custom_tab, null);
        ((ImageView) view4.findViewById(R.id.image_tab)).setImageResource(tabIcons[4]);
        tabLayout.getTabAt(4).setCustomView(view4);


//        View view5 = getLayoutInflater().inflate(R.layout.custom_tab, null);
//        ((ImageView) view5.findViewById(R.id.image_tab)).setImageResource(tabIcons[5]);
//        tabLayout.getTabAt(5).setCustomView(view5);





        final View[] selectedImageResources = {view0, view1,view2,view3,view4};

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                ((ImageView) selectedImageResources[tab.getPosition()].findViewById(R.id.image_tab))
                        .setImageResource(tabIconsSelected[tab.getPosition()]);

                tab.setCustomView(selectedImageResources[tab.getPosition()]);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                ((ImageView) selectedImageResources[tab.getPosition()].findViewById(R.id.image_tab))
                        .setImageResource(tabIcons[tab.getPosition()]);

                tab.setCustomView(selectedImageResources[tab.getPosition()]);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


}
