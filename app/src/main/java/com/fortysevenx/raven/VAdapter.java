package com.fortysevenx.raven;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class VAdapter extends FragmentStatePagerAdapter {

//    private final ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
//    private final ArrayList<String> fragmentTitle = new ArrayList<>();

    int not;
    public VAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm);
        this.not = behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new fragment1();
            case  1:
                return new fragment2();
            case 2:
                return new fragment3();
            default:
                return new fragment1();
        }
    }

    @Override
    public int getCount() {
        return  not;
    }
//
//    public void addFragment(Fragment fragment,String title){
//        fragmentArrayList.add(fragment);
//        fragmentTitle.add(title);
//    }

//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return fragmentTitle.get(position);
//    }
}
