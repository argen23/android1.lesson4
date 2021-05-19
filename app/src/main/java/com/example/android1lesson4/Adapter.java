package com.example.android1lesson4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1lesson4.databinding.FirstFragmentItemBinding;
import com.example.android1lesson4.fragment.Numbers;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<MainViewHolder> {

    private ArrayList<User> users = new ArrayList<>();

    public void setUsers(ArrayList<User> users){
        this.users.addAll(users);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(FirstFragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(users.get(position));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }


}
