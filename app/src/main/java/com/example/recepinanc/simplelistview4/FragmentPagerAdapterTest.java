package com.example.recepinanc.simplelistview4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Recepinanc on 14.09.2015.
 */
public class FragmentPagerAdapterTest extends FragmentPagerAdapter {

    private static final int NUM_PAGES = 2;
    private HistoryFragment mHistoryFragment;
    private ListAppFragment mListAppFragment;

    public FragmentPagerAdapterTest(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                mHistoryFragment = new HistoryFragment();
                return mHistoryFragment;
            case 1:
                mListAppFragment = new ListAppFragment();
                return mListAppFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}
