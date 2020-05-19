package com.krinotech.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ChinaTownFragment extends BaseFragment {

    public ChinaTownFragment() { }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setAreas(AreaProvider.getChinaTownAreas(getResources()));
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
