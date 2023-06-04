package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Unknow_values extends AppCompatActivity {
    private Button button7;
    private EditText editTextTextPersonName,editTextTextPersonName2,editTextTextPersonName3;

    private int points;
    private String[] point;
    int i=0;
    private int[] frames;
    private double[] F;
    private double[] angle;
    int quan_frame;
    double []Xp;
    double[ ]Yp;
    String[]full_points;
    private List<String> pointUknow_list=new ArrayList<>();
    private List<Integer> framesUknow_list=new ArrayList<>();

    private List<Double> angleUknow_list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unknow_values);
         editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
         editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
         editTextTextPersonName3=findViewById(R.id.editTextTextPersonName3);
        Bundle bundle=this.getIntent().getExtras();

        button7=findViewById(R.id.button7);
         points= bundle.getInt("points");
        quan_frame=  bundle.getInt("quan_frame");
         point=  bundle.getStringArray("pointKnow");
         frames=  bundle.getIntArray("frmKnow");
         F=  bundle.getDoubleArray("fsKnow");
         angle =  bundle.getDoubleArray("angleKnow");
         Xp=  bundle.getDoubleArray("Xp");
         Yp=  bundle.getDoubleArray("Yp");
        full_points= (String[]) bundle.get("full_points");

         button7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 pointUknow_list.add(editTextTextPersonName2.getText().toString());
                 framesUknow_list.add(Integer.parseInt(editTextTextPersonName.getText().toString()));
                 angleUknow_list.add(Double.parseDouble(editTextTextPersonName3.getText().toString()));
                 editTextTextPersonName3.setText("");
                 editTextTextPersonName2.setText("");
                 editTextTextPersonName.setText("");
                 i++;
             }
         });
    }
    public void nextActivity(View v){
        Intent intent=new Intent(this,Connections_and_Supports.class);
        String[] pointUknow=new String[i];
        for(int j=0;j<pointUknow_list.size();j++){
            pointUknow[j]=pointUknow_list.get(j);
        }
        int[] framesUknow=new int[i];
        for(int j=0;j<framesUknow_list.size();j++){
            framesUknow[j]=framesUknow_list.get(j);
        }
        double[] angleUknow=new double[i];
        for(int j=0;j<angleUknow_list.size();j++){
            angleUknow[j]=angleUknow_list.get(j);
        }
        intent.putExtra("pointKnow",point);
        intent.putExtra("frmKnow",frames);
        intent.putExtra("fsKnow",F);
        intent.putExtra("angleKnow",angle);
        intent.putExtra("points",points);
        intent.putExtra("pointUknow",pointUknow);
        intent.putExtra("framesUknow",framesUknow);
        intent.putExtra("angleUknow",angleUknow);
        intent.putExtra("quan_frame",quan_frame);
        intent.putExtra("Xp",Xp);
        intent.putExtra("Yp",Yp);
        intent.putExtra("full_points",full_points);

        startActivity(intent);
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,input_famous_point.class);
        startActivity(intent);
    }
}
