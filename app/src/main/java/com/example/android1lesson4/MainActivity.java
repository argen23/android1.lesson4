package com.example.android1lesson4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.example.android1lesson4.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ViewPagerAdapter ViewPagerAdapter;
    RecyclerView rv;
    Adapter adapter;
    TextView textView1 , textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        binding.viewPager.setAdapter(ViewPagerAdapter);
        binding.tabs.setupWithViewPager(binding.viewPager);
        textView1  = findViewById(R.id.text1);
        textView2  = findViewById(R.id.text2);
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        rv = findViewById(R.id.recycler);
        adapter = new Adapter();
        rv.setAdapter(adapter);
    }
}
