package org.com.smartmashinapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.com.smartmashinapp.R;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2;
    ViewGroup card3,card2,card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        button1=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        card3=findViewById(R.id.cardView3);
        card2=findViewById(R.id.cardView2);
        card=findViewById(R.id.cardView);
    }

    @Override
    public void onClick(View view) {
        if(view==button1){
            card3.setVisibility(View.INVISIBLE);
        }else if(view==button2){
            card3.setVisibility(View.VISIBLE);
        }else if(view==card2){
           callAct("Machine ZX55");
        }else if(view==card){
            callAct("Machine TS23");
        }
    }
    private void callAct(String s){
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("name",s);
        startActivity(intent);
    }
}