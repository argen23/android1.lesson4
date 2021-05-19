package com.example.android1lesson4.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1lesson4.databinding.FirstFragmentItemBinding;
import com.example.android1lesson4.databinding.SecondFragmentItemBinding;

import java.util.ArrayList;

public class Adapter_second  extends RecyclerView.Adapter<MainViewHolderSecond> {

    private ArrayList<Numbers> numbers = new ArrayList<>();

    public void setNumbers(ArrayList<Numbers> numbers) {
        this.numbers.addAll(numbers);
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public MainViewHolderSecond onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolderSecond(SecondFragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolderSecond holder, int position) {
        holder.onBind(numbers.get(position));

    }



    @Override
    public int getItemCount() {
        return numbers.size();
    }
}
