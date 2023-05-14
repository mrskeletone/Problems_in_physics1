package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Connections_and_Supports extends AppCompatActivity {
    private int points;
    private  boolean smothSup=false,smothCon=false,artic=false;
    private String[] point;
    String[] pointUknow;
    int i=0;
    private int[] frames;
    int[] framesUknow;
    private double[] F;
    double[] angleUknow;
    private double[] angle;
    int[] framePivot;
    String[] pointPivot;
    int[] frameArticulation1;
    int[] frameArticulation2;
    String[] pointArticulaton;
    int[] frameSmooth;
    int[] angleSmooth;
    String[] pointSmooth;
    int quan_frame;
    double []Xp;
    double[ ]Yp;
    String[]full_points;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connections_and_supports);
        Bundle bundle=getIntent().getExtras();
        points= bundle.getInt("points");
        quan_frame=bundle.getInt("quan_frame");
        point= (String[]) bundle.get("pointKnow");
        frames= (int[]) bundle.get("frmKnow");
        F= (double[]) bundle.get("fsKnow");
        angle = (double[]) bundle.get("angleKnow");
        pointUknow= (String[]) bundle.get("pointUknow");
        framesUknow= (int[]) bundle.get("framesUknow");
        angleUknow= (double[]) bundle.get("angleUknow");
        pointPivot= (String[])  bundle.get("pointPivot");
        framePivot= (int[]) bundle.get("framePivot");
        frameArticulation1= (int[]) bundle.get("frameArticulation1");
        frameArticulation2= (int[]) bundle.get("frameArticulation2");
        pointArticulaton= (String[]) bundle.get("pointArticulaton");
        frameSmooth= (int[]) bundle.get("frameSmooth");
        angleSmooth= (int[]) bundle.get("angleSmooth");
        pointSmooth= (String[]) bundle.get("pointSmooth");
        Xp= (double[]) bundle.get("Xp");
        Yp= (double[]) bundle.get("Yp");
        full_points= (String[]) bundle.get("full_points");



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
        if(smothCon){
        intent.putExtra("pointPivot",pointPivot);
        intent.putExtra("framePivot",framePivot);
        }
        if(artic){
        intent.putExtra("frameArticulation1",frameArticulation1);
        intent.putExtra("frameArticulation2",frameArticulation2);
        intent.putExtra("pointArticulaton",pointArticulaton);
        }
        if(smothSup){
        intent.putExtra("frameSmooth",frameSmooth);
        intent.putExtra("angleSmooth",angleSmooth);
        intent.putExtra("pointSmooth",pointSmooth);
        }
        intent.putExtra("quan_frame",quan_frame);
        intent.putExtra("Xp",Xp);
        intent.putExtra("Yp",Yp);
        intent.putExtra("full_points",full_points);

        startActivity(intent);
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,Unknow_values.class);
        startActivity(intent);
    }
    public void OnArticulatoin(View v){
        Intent intent=new Intent(this,Articulation.class);
        intent.putExtra("pointKnow",point);
        intent.putExtra("frmKnow",frames);
        intent.putExtra("fsKnow",F);
        intent.putExtra("angleKnow",angle);
        intent.putExtra("points",points);
        intent.putExtra("pointUknow",pointUknow);
        intent.putExtra("framesUknow",framesUknow);
        intent.putExtra("angleUknow",angleUknow);
        intent.putExtra("pointPivot",pointPivot);
        intent.putExtra("framePivot",framePivot);
        intent.putExtra("frameArticulation1",frameArticulation1);
        intent.putExtra("frameArticulation2",frameArticulation2);
        intent.putExtra("pointArticulaton",pointArticulaton);
        intent.putExtra("frameSmooth",frameSmooth);
        intent.putExtra("angleSmooth",angleSmooth);
        intent.putExtra("pointSmooth",pointSmooth);
        intent.putExtra("quan_frame",quan_frame);
        intent.putExtra("Xp",Xp);
        intent.putExtra("Yp",Yp);
        intent.putExtra("full_points",full_points);
        artic=true;
        startActivity(intent);
    }
    public void OnPivotSupport(View v){
        Intent intent=new Intent(this,Pivot_support.class);
        intent.putExtra("pointKnow",point);
        intent.putExtra("frmKnow",frames);
        intent.putExtra("fsKnow",F);
        intent.putExtra("angleKnow",angle);
        intent.putExtra("points",points);
        intent.putExtra("pointUknow",pointUknow);
        intent.putExtra("framesUknow",framesUknow);
        intent.putExtra("angleUknow",angleUknow);
        intent.putExtra("pointPivot",pointPivot);
        intent.putExtra("framePivot",framePivot);
        intent.putExtra("frameArticulation1",frameArticulation1);
        intent.putExtra("frameArticulation2",frameArticulation2);
        intent.putExtra("pointArticulaton",pointArticulaton);
        intent.putExtra("frameSmooth",frameSmooth);
        intent.putExtra("angleSmooth",angleSmooth);
        intent.putExtra("pointSmooth",pointSmooth);
        intent.putExtra("quan_frame",quan_frame);
        intent.putExtra("Xp",Xp);
        intent.putExtra("Yp",Yp);
        intent.putExtra("full_points",full_points);
        smothCon=true;
        startActivity(intent);
    }
    public void OnSmoothSupport(View v){
        Intent intent=new Intent(this,Smooth_support.class);
        intent.putExtra("pointKnow",point);
        intent.putExtra("frmKnow",frames);
        intent.putExtra("fsKnow",F);
        intent.putExtra("angleKnow",angle);
        intent.putExtra("points",points);
        intent.putExtra("pointUknow",pointUknow);
        intent.putExtra("framesUknow",framesUknow);
        intent.putExtra("angleUknow",angleUknow);
        intent.putExtra("pointPivot",pointPivot);
        intent.putExtra("framePivot",framePivot);
        intent.putExtra("frameArticulation1",frameArticulation1);
        intent.putExtra("frameArticulation2",frameArticulation2);
        intent.putExtra("pointArticulaton",pointArticulaton);
        intent.putExtra("frameSmooth",frameSmooth);
        intent.putExtra("angleSmooth",angleSmooth);
        intent.putExtra("pointSmooth",pointSmooth);
        intent.putExtra("quan_frame",quan_frame);
        intent.putExtra("Xp",Xp);
        intent.putExtra("Yp",Yp);
        intent.putExtra("full_points",full_points);
        smothSup=true;
        startActivity(intent);
    }
}