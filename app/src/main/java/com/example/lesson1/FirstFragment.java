package com.example.lesson1;

import static com.example.lesson1.R.id.second_activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.lesson1.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    
    FragmentFirstBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater);
        initListener();
        return binding.getRoot();
    }

    private void initListener() {
      binding.btnBack.setOnClickListener(view -> {
          Intent intent = new Intent(requireActivity(),SecondActivity.class);
          startActivity(intent);
      });
    }


}







