package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Unknow_values extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unknow_values);
    }
    public void nextActivity(View v){
        Intent intent=new Intent(this,Connections_and_Supports.class);
        startActivity(intent);
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,input_famous_point.class);
        startActivity(intent);
    }
}
