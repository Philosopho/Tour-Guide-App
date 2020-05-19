package com.krinotech.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LittleItalyFragment extends BaseFragment {

    public LittleItalyFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setAreas(AreaProvider.getLittleItalyAreas(getResources()));
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
