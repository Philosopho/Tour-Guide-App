package com.krinotech.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TribecaFragment extends BaseFragment {

    public TribecaFragment() { }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setAreas(AreaProvider.getTribecaAreas(getResources()));
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
