package com.example.android1lesson4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1lesson4.databinding.FirstFragmentItemBinding;

public class MainViewHolder extends RecyclerView.ViewHolder {

    private FirstFragmentItemBinding binding;

    public MainViewHolder(@NonNull FirstFragmentItemBinding itemView) {
        super(itemView.getRoot());
       binding = itemView;
    }

    public void onBind(User user) {
        binding.text1.setText(user.getName());
        binding.text2.setText(user.getSurname());

    }

}
