package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Smooth_support extends AppCompatActivity {
    int[] frameSmooth;
    int[] angleSmooth;
    String[] pointSmooth;
    int i=1;
    Button button23;
    EditText editTextTextPersonName,editTextTextPersonName2,editTextTextPersonName3;
    private int points;
    private String[] point;
    String[] pointUknow;
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

    int quan_frame;
    double []Xp;
    double[ ]Yp;
    String[]full_points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smooth_support);
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
        Xp= (double[]) bundle.get("Xp");
        Yp= (double[]) bundle.get("Yp");
        full_points= (String[]) bundle.get("full_points");
        button23=findViewById(R.id.button23);
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3=findViewById(R.id.editTextTextPersonName3);
        frameSmooth=new int[i];
        angleSmooth=new int[i];
        pointSmooth=new String[i];
        int j=i-1;
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameSmooth[j]=Integer.parseInt(editTextTextPersonName.getText().toString());
                angleSmooth[j]=Integer.parseInt(editTextTextPersonName3.getText().toString());
                pointSmooth[j]=editTextTextPersonName2.getText().toString();
                editTextTextPersonName3.setText("");
                editTextTextPersonName2.setText("");
                editTextTextPersonName.setText("");
                i++;
            }
        });
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,Connections_and_Supports.class);
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