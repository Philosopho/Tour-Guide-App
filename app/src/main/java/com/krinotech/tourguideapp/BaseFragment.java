package com.krinotech.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.krinotech.tourguideapp.databinding.AreaListBinding;

import java.util.List;

public class BaseFragment extends Fragment {
    private List<Area> areas;
    private AreaListBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.area_list, container, false);
        setUpAdapter(areas);
        return binding.getRoot();
    }

    private void setUpAdapter(List<Area> areas) {
        AreaAdapter areaAdapter = new AreaAdapter(areas);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        binding.rvList.setHasFixedSize(true);
        binding.rvList.setLayoutManager(linearLayoutManager);
        binding.rvList.setAdapter(areaAdapter);
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }
}
