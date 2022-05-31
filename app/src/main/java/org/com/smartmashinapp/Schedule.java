package org.com.smartmashinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import org.com.smartmashinapp.databinding.ActivityMainBinding;
import org.com.smartmashinapp.databinding.ActivityScheduleBinding;

public class Schedule extends AppCompatActivity {

    private ActivityScheduleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityScheduleBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}