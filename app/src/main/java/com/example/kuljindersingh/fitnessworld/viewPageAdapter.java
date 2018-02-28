package com.example.kuljindersingh.fitnessworld;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

public class viewPageAdapter extends FragmentPagerAdapter
{
    public viewPageAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                yogatab t1 = new yogatab();
                return t1;
            case 1:
                gymtab t2 = new gymtab();
                return t2;
            case 2:
                cardiotab t3 = new cardiotab();
                return t3;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }//set the number of tabs

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "Yoga";
            case 1:

                return "Gym";
            case 2:

                return "Cardio";
        }
        return null;
    }



}
