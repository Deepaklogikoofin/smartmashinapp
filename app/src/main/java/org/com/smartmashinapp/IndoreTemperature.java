package org.com.smartmashinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import org.com.smartmashinapp.databinding.ActivityIndoreTemperatureBinding;
import org.com.smartmashinapp.databinding.ActivityMainBinding;

public class IndoreTemperature extends AppCompatActivity {

    private ActivityIndoreTemperatureBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityIndoreTemperatureBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


    }
}