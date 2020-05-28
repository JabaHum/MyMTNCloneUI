package com.example.mymtncloneui.Covid.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.mymtncloneui.Covid.adapters.CovidViewPagerAdapter;
import com.example.mymtncloneui.R;
import com.google.android.material.tabs.TabLayout;

public class CovidBaseActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covidbase);

        viewPager = findViewById(R.id.vp_covid);
        viewPager.setAdapter(new CovidViewPagerAdapter(getSupportFragmentManager(),0));
        TabLayout tabLayout = findViewById(R.id.tab_layout_covid);
        tabLayout.setupWithViewPager(viewPager);
    }
}
