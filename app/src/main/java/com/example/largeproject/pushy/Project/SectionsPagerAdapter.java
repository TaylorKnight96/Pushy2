package com.example.largeproject.pushy.Project;

/** Class for stores fragments for tabs
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.largeproject.pushy.Utils.Project;

import java.util.ArrayList;
import java.util.List;

public class SectionsPagerAdapter extends FragmentPagerAdapter{
    private static final String TAG = "SectionsPagerAdapter";
    private final List<Fragment> fragmentList = new ArrayList<>();

    public SectionsPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    public void addFragment(Fragment fragment)
    {
        fragmentList.add(fragment);
    }

}
