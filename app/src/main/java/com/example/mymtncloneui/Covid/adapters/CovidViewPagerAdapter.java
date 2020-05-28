package com.example.mymtncloneui.Covid.adapters;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mymtncloneui.Covid.fragments.AnnouncementsFragment;
import com.example.mymtncloneui.Covid.fragments.ContactUsFragment;
import com.example.mymtncloneui.Covid.fragments.FaqFragment;
import com.example.mymtncloneui.Covid.fragments.InformationFragment;

public class CovidViewPagerAdapter extends FragmentPagerAdapter {
    public CovidViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new InformationFragment();
            case 1:
                return new FaqFragment();
            case 2:
                return new AnnouncementsFragment();
            case 3:
                return new ContactUsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Information";
        } else if (position == 1) {
            return "FAQS";
        } else  if (position ==2){
            return "Announcements";
        }else {
            return "Contact Us";
        }
    }
}
