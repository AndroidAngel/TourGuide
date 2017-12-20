package com.teamandroidangel.iamangelauditor.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by iamangelauditor on 15/12/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 5;
    private String tabTitles[] = new String[]{"Tab1","Tab2","Tab3","Tab4","Tab5"};
    private Context context;


    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

    }


    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MainPlaceFragment();
            case 1:
                return new FirstAttractionFragment();
            case 2:
                default: return null;




        }
   // return MainPlaceFragment.newInstance(position + 1);

       }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }
}