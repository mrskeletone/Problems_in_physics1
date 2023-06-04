package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.problems_in_physics.BackEnd.Point;

import java.util.ArrayList;
import java.util.List;

public class input_famous_point extends AppCompatActivity {
    private Button button4;
    int fq,i=0,w=0;
    private String[] full_points  ;

    private  List<String> point_list=new ArrayList<>();
    private List<Integer> frames_list=new ArrayList<>();

    private List<Double> F_list=new ArrayList<>();

    private List<Double>angle_list=new ArrayList<>();
    int pointss;
    double []Xp;
    double[ ]Yp;
    EditText textView8,frame,F_X_f,F_y;
    Bundle bundle=new Bundle();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_famous_point_power);
          bundle=getIntent().getExtras();

         int points= bundle.getInt("points");
          fq= (int) bundle.get("frames");
          full_points= (String[]) bundle.get("full_points");
          Xp= (double[]) bundle.get("Xp");
          Yp= (double[]) bundle.get("Yp");
         pointss=points;
        button4=findViewById(R.id.button4);
        textView8=findViewById(R.id.textView8);
        frame=findViewById(R.id.frame);
        F_X_f=findViewById(R.id.F_X_f);
        F_y=findViewById(R.id.F_y);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                point_list.add(textView8.getText().toString());
                 frames_list.add(Integer.parseInt(frame.getText().toString()));
                 F_list.add(Double.parseDouble(F_X_f.getText().toString()));
                 angle_list.add(Double.parseDouble(F_y.getText().toString()));

                textView8.setText("");
                frame.setText("");
                F_X_f.setText("");
                F_y.setText("");
                i++;
            }
        });
    }
    public void nextActivity(View v){
        Intent intent=new Intent(this,Unknow_values.class);
     //   intent.putExtra(Task.class.getSimpleName(),taskMain);
        double[]  F=new double[i];
        for(int j=0;j<F_list.size();j++){
            F[j]=F_list.get(j);
        }
        String[] point=new String[i];
        for(int j=0;j<point_list.size();j++){
            point[j]=point_list.get(j);
        }
        int[]   frames=new int[i];
        for(int j=0;j<frames_list.size();j++){
            frames[j]=frames_list.get(j);
        }
        double[]  angle=new double[i];
        for(int j=0;j<angle_list.size();j++){
            angle[j]=angle_list.get(j);
        }
        intent.putExtra("fsKnow",F);
        intent.putExtra("pointKnow",point);
        intent.putExtra("frmKnow",frames);
        intent.putExtra("angleKnow",angle);
        intent.putExtra("points",pointss);
        intent.putExtra("quan_frame",fq);
        intent.putExtra("full_points",full_points);
        intent.putExtra("Xp",Xp);
        intent.putExtra("Yp",Yp);

        startActivity(intent);
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,Points.class);
        startActivity(intent);
    }
}