package com.krinotech.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class TribecaFragment extends BaseFragment {

    public TribecaFragment() { }

    @Override
    public List<Area> getAreas() {
        return AreaProvider.getTribecaAreas(getResources());
    }
}
