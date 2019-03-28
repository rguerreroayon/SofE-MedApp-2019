package com.nearsoft.sofe.map.view;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MedPagerAdapter extends FragmentPagerAdapter {

    public MedPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return MapFragment.newInstance();
            case 1:
                return ServicesFragment.newInstance();
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Inicio";
            case 1:
                return "Citas";
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
