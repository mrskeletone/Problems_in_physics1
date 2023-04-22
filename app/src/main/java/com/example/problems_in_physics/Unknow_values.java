package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Unknow_values extends AppCompatActivity {
    private Button button7;
    private EditText editTextTextPersonName,editTextTextPersonName2,editTextTextPersonName3;

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
        setContentView(R.layout.activity_unknow_values);
         editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
         editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
         editTextTextPersonName3=findViewById(R.id.editTextTextPersonName3);
        Bundle bundle=getIntent().getExtras();
        button7=findViewById(R.id.button7);
         points= bundle.getInt("points");
         point= (String[]) bundle.get("pointKnow");
         frames= (int[]) bundle.get("frmKnow");
         F= (double[]) bundle.get("fsKnow");
         angle = (double[]) bundle.get("angleKnow");
         pointUknow=new String[i];
         framesUknow=new int[i];
         angleUknow=new double[i];
         button7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 pointUknow[i]=editTextTextPersonName2.getText().toString();
                 framesUknow[i]=Integer.parseInt(editTextTextPersonName.getText().toString());
                 angleUknow[i]=Double.parseDouble(editTextTextPersonName3.getText().toString());
                 i++;
             }
         });
    }
    public void nextActivity(View v){
        Intent intent=new Intent(this,Connections_and_Supports.class);
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
        Intent intent=new Intent(this,input_famous_point.class);
        startActivity(intent);
    }
}
