package com.krinotech.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

public class LittleItalyFragment extends BaseFragment {

    public LittleItalyFragment() {
    }

    @Override
    public List<Area> getAreas() {
        return AreaProvider.getLittleItalyAreas(getResources());
    }
}
