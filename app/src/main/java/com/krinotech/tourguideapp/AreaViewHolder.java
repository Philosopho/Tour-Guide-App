package com.krinotech.tourguideapp;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.krinotech.tourguideapp.databinding.AreaItemBinding;

class AreaViewHolder extends RecyclerView.ViewHolder {
    private AreaItemBinding binding;

    public AreaViewHolder(@NonNull AreaItemBinding itemView) {

        super(itemView.getRoot());

        binding = itemView;
    }

    public void bind(Area area) {
        binding.setArea(area);
        binding.executePendingBindings();
        if(area.getPicture() != -1) {
            binding.areaPicture.setImageDrawable(binding
                    .areaAddress
                    .getResources()
                    .getDrawable(area.getPicture()));
            binding.areaPicture.setVisibility(View.VISIBLE);
        }
    }
}
