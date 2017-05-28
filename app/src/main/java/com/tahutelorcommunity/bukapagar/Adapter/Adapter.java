package com.tahutelorcommunity.bukapagar.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.tahutelorcommunity.bukapagar.Fragment.FilterFragment;
import com.tahutelorcommunity.bukapagar.Fragment.ListFragment;
import com.tahutelorcommunity.bukapagar.Fragment.MapFragment;

/**
 * Created by QQ on 5/24/2017.
 */

public class Adapter extends FragmentStatePagerAdapter {
    int tabCount;

    public Adapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MapFragment tab1 = new MapFragment();
                return tab1;
            case 1:
                ListFragment tab2 = new ListFragment();
                return tab2;
            case 2:
                FilterFragment tab3 = new FilterFragment();
                return tab3;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
