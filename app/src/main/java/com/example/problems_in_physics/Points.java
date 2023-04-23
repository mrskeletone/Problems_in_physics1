package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Points extends AppCompatActivity {


    private Button button2;
    private String[] full_points  ;
    private int i=0;
    double []Xp;
    double []Yp;
    int frames,points;
    private EditText namePoint;
       EditText X,Y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);
        Bundle bundle=getIntent().getExtras();
        frames = (int) bundle.get("frames");
        points = (int) bundle.get("points");
        namePoint=findViewById(R.id.name_points);
        Y=findViewById(R.id.Y);
        X=findViewById(R.id.X);
        button2=findViewById(R.id.button2);
        Xp=new double[points];
        Yp=new double[points];
        full_points=new String[points];

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Xp[i]=Double.parseDouble(X.getText().toString());
            Yp[i]=Double.parseDouble(Y.getText().toString());
            full_points[i]=namePoint.getText().toString();
            X.setText("");
            Y.setText("");
            namePoint.setText("");
            i++;
            }
        });

    }

    public void nextActivity(View v){
        Intent intent=new Intent(this,input_famous_point.class);
        intent.putExtra("Xp",Xp);
        intent.putExtra("Yp",Yp);
        intent.putExtra("full_points",full_points);
        intent.putExtra("points",points);
        intent.putExtra("frames",frames);
        startActivity(intent);
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }


}