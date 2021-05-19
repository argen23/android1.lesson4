package com.example.android1lesson4.fragment;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1lesson4.databinding.SecondFragmentItemBinding;

public class MainViewHolderSecond extends RecyclerView.ViewHolder {
    private SecondFragmentItemBinding binding;


    public MainViewHolderSecond(@NonNull SecondFragmentItemBinding itemView) {
        super(itemView.getRoot());
        binding = itemView;
    }

    public void onBind(Numbers numbers){
        binding.textView.setText(numbers.getNumber());
    }
}
