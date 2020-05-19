package com.krinotech.tourguideapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TourFragmentStateAdapter extends FragmentStateAdapter {


    public TourFragmentStateAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new SohoFragment();
            case 1:
                return new LittleItalyFragment();
            case 2:
                return new ChinaTownFragment();
            default:
                return new TribecaFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
