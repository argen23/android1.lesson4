package com.example.android1lesson4.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android1lesson4.R;
import com.example.android1lesson4.databinding.FragmentFirstBinding;
import com.example.android1lesson4.databinding.FragmentThirdBinding;

public class ThirdFragment extends Fragment {
private  FragmentThirdBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}