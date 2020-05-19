package com.krinotech.tourguideapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.krinotech.tourguideapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        TourFragmentStateAdapter adapter = new TourFragmentStateAdapter(this);

        binding.viewPager2.setAdapter(adapter);

        final String[] tabNames = {
                getString(R.string.soho),
                getString(R.string.little_italy),
                getString(R.string.china_town),
                getString(R.string.tribeca)
        };

        new TabLayoutMediator(binding.tabLayout, binding.viewPager2,

                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText(tabNames[position]);
                    }
                })
                .attach();
    }
}
