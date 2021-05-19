package com.example.android1lesson4.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android1lesson4.Adapter;
import com.example.android1lesson4.R;
import com.example.android1lesson4.User;
import com.example.android1lesson4.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {


    private FragmentFirstBinding binding;
    private Adapter adapter;
    private ArrayList<User> users = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        getUserList();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new Adapter();
        adapter.setUsers(users);
        binding.recycler.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    private void getUserList() {
        users.add(new User("гулчачап", "surname"));
        users.add(new User("name", "surname"));
        users.add(new User("name", "surname"));
        users.add(new User("name", "surname"));
        users.add(new User("name", "surname"));
        users.add(new User("name", "surname"));
        users.add(new User("name", "surname"));
        users.add(new User("name", "surname"));
        users.add(new User("name", "surname"));
        users.add(new User("name", "surname"));
        users.add(new User("name", "surname"));
        users.add(new User("name", "surname"));
        users.add(new User("name", "surname"));
    }
}