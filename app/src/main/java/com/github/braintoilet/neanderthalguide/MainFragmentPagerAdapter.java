package com.github.braintoilet.neanderthalguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Neanderthal", "Museum", "Discovery", "Wildlife" };

    public MainFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return NeanderthalFragment.newInstance();
            case 1:
                return MuseumFragment.newInstance();
            case 2:
                return DiscoveryFragment.newInstance();
            case 3:
                return WildlifeFragment.newInstance();
        }
        return NeanderthalFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
