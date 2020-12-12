package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class orderScreen extends AppCompatActivity {
    RecyclerView order_recycle;
    orderAdapter orderAdapter;
    TabLayout tabLayout05;
    TabItem tab051,tab052,tab053;
    ViewPager viewPager05;
    PagerAdapter pagerAdapter05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_screen);
        tabLayout05 = findViewById(R.id.tablayout);
        tab051 =findViewById(R.id.tab1);
        tab052 =findViewById(R.id.tab2);
        tab053 =findViewById(R.id.tab3);
        viewPager05 =findViewById(R.id.viewpaper);
        pagerAdapter05 = new PagerAdapter(getSupportFragmentManager(),tabLayout05.getTabCount());
//        pagerAdapter = new com.example.thecoffeehouse.PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager05.setAdapter(pagerAdapter05);

        tabLayout05.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager05.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    pagerAdapter05.notifyDataSetChanged();
                } else if (tab.getPosition() == 1) {
                    pagerAdapter05.notifyDataSetChanged();
                } else if (tab.getPosition() == 2) {
                    pagerAdapter05.notifyDataSetChanged();
                }



            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager05.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout05));
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.delivery);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.news:
                        startActivity(new Intent(getApplicationContext(),Home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.delivery:
//                        startActivity(new Intent(getApplicationContext(),orderScreen.class));
//                        overridePendingTransition(0,0);
                        return true;
                    case R.id.store:
                        startActivity(new Intent(getApplicationContext(),store_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(),account_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

}