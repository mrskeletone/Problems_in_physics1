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
    int fq,i=0;
    String[] point;
    int[] frames;
    double[] F;
    double[] angle;
    int pointss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_famous_point_power);
         EditText textView8,frame,F_X_f,F_y;
         Bundle bundle=getIntent().getExtras();
         int points= bundle.getInt("points");
         point=new String[points];
         frames=new int[points];
         F=new double[points];
         angle=new double[points];
         pointss=points;
        button4=findViewById(R.id.button4);
        textView8=findViewById(R.id.textView8);
        frame=findViewById(R.id.frame);
        F_X_f=findViewById(R.id.F_X_f);
        F_y=findViewById(R.id.F_y);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                point[i]=textView8.getText().toString();
                 frames[i]=Integer.parseInt(frame.getText().toString());
                 F[i]=Double.parseDouble(F_X_f.getText().toString());
                 angle[i]=Double.parseDouble(F_y.getText().toString());
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
        startActivity(intent);
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}