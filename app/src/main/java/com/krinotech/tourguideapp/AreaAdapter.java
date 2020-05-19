package com.krinotech.tourguideapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.krinotech.tourguideapp.databinding.AreaItemBinding;

import java.util.List;

public class AreaAdapter extends RecyclerView.Adapter<AreaViewHolder> {
    private List<Area> areas;

    public AreaAdapter(List<Area> areas) {
        this.areas = areas;
    }

    @NonNull
    @Override
    public AreaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        AreaItemBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.area_item, parent, false);
        return new AreaViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AreaViewHolder holder, int position) {
        Area area = areas.get(position);
        holder.bind(area);
    }

    @Override
    public int getItemCount() {
        if(areas != null) {
            return areas.size();
        }
        return 0;
    }
}
