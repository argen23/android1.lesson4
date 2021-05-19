package com.example.android1lesson4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.android1lesson4.fragment.FirstFragment;
import com.example.android1lesson4.fragment.SecondFragment;
import com.example.android1lesson4.fragment.ThirdFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new FirstFragment();
            }
            case 1: {
                return new SecondFragment();
            }
            case 2: {
                return new ThirdFragment();
            }
        }
        return new FirstFragment();
    }

    @Override
    public int getCount() {
        return 3;

    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: {
                return "TITLES";
            }
            case 1: {
                return "NUMBERS";
            }
            case 2: {
                return "IMAGES";
            }
        }
        return super.getPageTitle(position);
    }
}
