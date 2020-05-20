package com.krinotech.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

public class SohoFragment extends BaseFragment {

    public SohoFragment() { }

    @Override
    public List<Area> getAreas() {
        return AreaProvider.getSohoAreas(getResources());
    }
}
