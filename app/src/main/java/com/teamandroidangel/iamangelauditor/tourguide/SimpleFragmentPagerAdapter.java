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


    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);

    }


    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new MainPlaceFragment();
        } else if (position == 1) {
            fragment = new FirstAttractionFragment();
        } else if (position == 2) {
            fragment = new SecondAttractionFragment();
        } else if (position == 3) {
            fragment = new ThirdAttractionFragment();
        } else if (position == 4) {
            fragment = new FourthAttractionFragment();
        }
        return fragment;
    }



    @Override
    public CharSequence getPageTitle(int position){
        String title = null;
        if (position == 0)
        {
            title = "View 1";
        }else if (position == 1){
            title = "View 2";
        }else if (position == 2){
            title = "View 3";
        }else if (position == 3){
            title = "View 4";
        }else if (position == 4){
            title = "View 5";
        }
        return title;
    }
}