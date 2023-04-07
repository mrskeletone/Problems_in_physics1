package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Connections_and_Supports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connections_and_supports);
    }
    public void nextActivity(View v){
        Intent intent=new Intent(this,Finish.class);
        startActivity(intent);
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,Unknow_values.class);
        startActivity(intent);
    }
    public void OnArticulatoin(View v){
        Intent intent=new Intent(this,Articulation.class);
        startActivity(intent);
    }
    public void OnPivotSupport(View v){
        Intent intent=new Intent(this,Pivot_support.class);
        startActivity(intent);
    }
    public void OnSmoothSupport(View v){
        Intent intent=new Intent(this,Smooth_support.class);
        startActivity(intent);
    }
}