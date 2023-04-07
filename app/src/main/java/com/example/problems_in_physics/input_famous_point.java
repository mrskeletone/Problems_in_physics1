package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class input_famous_point extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_famous_point_power);
    }
    public void nextActivity(View v){
        Intent intent=new Intent(this,Unknow_values.class);
        startActivity(intent);
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,Points.class);
        startActivity(intent);
    }
}