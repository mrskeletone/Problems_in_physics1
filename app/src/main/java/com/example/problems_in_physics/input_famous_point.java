package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.problems_in_physics.BackEnd.Point;

public class input_famous_point extends AppCompatActivity {
    private Button button4;
    int fq,i=1;
    String[] point;
    int[] frames;
    private String[] full_points  ;

    double[] F;
    double[] angle;
    int pointss;
    double []Xp;
    double[ ]Yp;
    EditText textView8,frame,F_X_f,F_y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_famous_point_power);
         Bundle bundle=getIntent().getExtras();
         int points= bundle.getInt("points");
          fq= (int) bundle.get("frames");
          full_points= (String[]) bundle.get("full_points");
          Xp= (double[]) bundle.get("Xp");
          Yp= (double[]) bundle.get("Yp");
         point=new String[i];
         frames=new int[i];
         F=new double[i];
         angle=new double[i];
         Xp=new double[i];
         Yp=new double[i];
         pointss=points;
        button4=findViewById(R.id.button4);
        textView8=findViewById(R.id.textView8);
        frame=findViewById(R.id.frame);
        F_X_f=findViewById(R.id.F_X_f);
        F_y=findViewById(R.id.F_y);
        int j=i-1;

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                point[j]=textView8.getText().toString();
                 frames[j]=Integer.parseInt(frame.getText().toString());
                 F[j]=Double.parseDouble(F_X_f.getText().toString());
                 angle[j]=Double.parseDouble(F_y.getText().toString());

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
        intent.putExtra("pointKnow",point);
        intent.putExtra("frmKnow",frames);
        intent.putExtra("fsKnow",F);
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