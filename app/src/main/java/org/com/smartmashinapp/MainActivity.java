package org.com.smartmashinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.MediaController;

import org.com.smartmashinapp.databinding.ActivityMainBinding;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import pl.droidsonroids.gif.GifDrawable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static Random random=new SecureRandom();
    private ActivityMainBinding binding;
    private Timer timer;
    private TimerTask timerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.card1.setOnClickListener(this);
        binding.card2.setOnClickListener(this);
        binding.card3.setOnClickListener(this);
        Log.i("","");
        ((GifDrawable) binding.gif.getDrawable()).stop();
        String s=getIntent().getStringExtra("name");
        binding.tvname.setText(s);




        binding.toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(!b){
                    ((GifDrawable) binding.gif.getDrawable()).stop();
                    stopTimer();
                }else {
                    ((GifDrawable) binding.gif.getDrawable()).start();
                    startTimer();
                }
            }
        });
    }
    private void startTimer(){
        timer =new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        binding.tvPC.setText(generate(230,260)+"V");
                    }
                });

            }
        },0,1000);
    }
    private void stopTimer(){
        if(timer!=null){
            timer.cancel();
            timer=null;
        }
    }
    public static int generate( int min, int max) {
        return min + random.nextInt((max - min) + 1);
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