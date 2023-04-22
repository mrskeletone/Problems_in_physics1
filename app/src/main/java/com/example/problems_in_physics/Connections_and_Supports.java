package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Connections_and_Supports extends AppCompatActivity {
    private int points;
    private String[] point;
    String[] pointUknow;
    int i=0;
    private int[] frames;
    int[] framesUknow;
    private double[] F;
    double[] angleUknow;
    private double[] angle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connections_and_supports);
        Bundle bundle=getIntent().getExtras();
        points= bundle.getInt("points");
        point= (String[]) bundle.get("pointKnow");
        frames= (int[]) bundle.get("frmKnow");
        F= (double[]) bundle.get("fsKnow");
        angle = (double[]) bundle.get("angleKnow");
        pointUknow= (String[]) bundle.get("pointUknow");
        framesUknow= (int[]) bundle.get("framesUknow");
        angleUknow= (double[]) bundle.get("angleUknow");


    }
    public void nextActivity(View v){
        Intent intent=new Intent(this,Finish.class);
        intent.putExtra("pointKnow",point);
        intent.putExtra("frmKnow",frames);
        intent.putExtra("fsKnow",F);
        intent.putExtra("angleKnow",angle);
        intent.putExtra("points",points);
        intent.putExtra("pointUknow",pointUknow);
        intent.putExtra("framesUknow",framesUknow);
        intent.putExtra("angleUknow",angleUknow);
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