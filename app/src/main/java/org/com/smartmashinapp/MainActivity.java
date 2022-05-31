package org.com.smartmashinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.com.smartmashinapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.card1.setOnClickListener(this);
        binding.card2.setOnClickListener(this);
        binding.card3.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.card1:
                startActivity(new Intent(this,IndoreTemperature.class));
                break;
            case R.id.card2:
                startActivity(new Intent(this,PowerConsumption.class));
                break;
            case R.id.card3:
                startActivity(new Intent(this,Schedule.class));
                break;


        }

    }
}