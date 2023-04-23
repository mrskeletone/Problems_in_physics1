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
    int i=1;
    private int[] frames;
    int[] framesUknow;
    private double[] F;
    double[] angleUknow;
    private double[] angle;
    int quan_frame;
    double []Xp;
    double[ ]Yp;
    String[]full_points;

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
        quan_frame= (int) bundle.get("quan_frame");
         point= (String[]) bundle.get("pointKnow");
         frames= (int[]) bundle.get("frmKnow");
         F= (double[]) bundle.get("fsKnow");
         angle = (double[]) bundle.get("angleKnow");
         Xp= (double[]) bundle.get("Xp");
         Yp= (double[]) bundle.get("Yp");
        full_points= (String[]) bundle.get("full_points");
         pointUknow=new String[i];
         framesUknow=new int[i];
         angleUknow=new double[i];
         int j=i-1;
         button7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 pointUknow[j]=editTextTextPersonName2.getText().toString();
                 framesUknow[j]=Integer.parseInt(editTextTextPersonName.getText().toString());
                 angleUknow[j]=Double.parseDouble(editTextTextPersonName3.getText().toString());
                 editTextTextPersonName3.setText("");
                 editTextTextPersonName2.setText("");
                 editTextTextPersonName.setText("");
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
