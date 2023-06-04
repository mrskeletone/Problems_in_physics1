package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Articulation extends AppCompatActivity {

    int i=0;
    Button button17;
    EditText editTextTextPersonName,editTextTextPersonName2,editTextTextPersonName3;
    private int points;
    private String[] point;
    String[] pointUknow;
    private int[] frames;
    private  boolean smothSup,smothCon,artic;

    int[] framesUknow;
    private double[] F;
    double[] angleUknow;
    private double[] angle;
    int[] framePivot;
    String[] pointPivot;
    int[] frameSmooth;
    int[] angleSmooth;
    String[] pointSmooth;
    int quan_frame;
    double []Xp;
    double[ ]Yp;
    String[]full_points;
    private List<String> pointArticulaton_list=new ArrayList<>();
    private List<Integer> frameArticulation1_list=new ArrayList<>();

    private List<Integer> frameArticulation2_list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulation);
        Bundle bundle=getIntent().getExtras();
        points= bundle.getInt("points");
        smothSup=bundle.getBoolean("smothSup");
        smothCon=bundle.getBoolean("smothCon");
        artic=bundle.getBoolean("artic");
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
        frameSmooth= (int[]) bundle.get("frameSmooth");
        angleSmooth= (int[]) bundle.get("angleSmooth");
        pointSmooth= (String[]) bundle.get("pointSmooth");
        Xp= (double[]) bundle.get("Xp");
        Yp= (double[]) bundle.get("Yp");
        full_points= (String[]) bundle.get("full_points");
        button17=findViewById(R.id.button17);
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3=findViewById(R.id.editTextTextPersonName3);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameArticulation1_list.add(Integer.parseInt(editTextTextPersonName.getText().toString()));
                frameArticulation2_list.add(Integer.parseInt(editTextTextPersonName2.getText().toString()));
                pointArticulaton_list.add(editTextTextPersonName3.getText().toString());
                editTextTextPersonName3.setText("");
                editTextTextPersonName2.setText("");
                editTextTextPersonName.setText("");
                i++;
            }
        });
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,Connections_and_Supports.class);
        String[] pointArticulaton=new String[i];
        for(int j=0;j<pointArticulaton_list.size();j++){
            pointArticulaton[j]=pointArticulaton_list.get(j);
        }
        int[]   frameArticulation1=new int[i];
        for(int j=0;j<frameArticulation1_list.size();j++){
            frameArticulation1[j]=frameArticulation1_list.get(j);
        }
        int[]  frameArticulation2=new int[i];
        for(int j=0;j<frameArticulation2_list.size();j++){
            frameArticulation2[j]=frameArticulation2_list.get(j);
        }
        intent.putExtra("smothCon",smothCon);
        intent.putExtra("artic",artic);
        intent.putExtra("smothSup",smothSup);
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
        startActivity(intent);
    }
}