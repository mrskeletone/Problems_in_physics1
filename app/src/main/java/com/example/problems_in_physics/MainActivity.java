package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.problems_in_physics.BackEnd.Task;

public class MainActivity extends AppCompatActivity {
    private EditText quantity_frames,quantity_points;
    private  int frames,points;


    //    private Test test=new Test(1,2,"3");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantity_frames=findViewById(R.id.quantity_frames);
        quantity_points=findViewById(R.id.quantity_points);

    }
   public void add(View view){
        String fr= quantity_frames.getText().toString();
        String po=quantity_points.getText().toString();
        frames=Integer.parseInt(fr);
        points=Integer.parseInt(po);


//      in.putExtra(Test.class.getSimpleName(),  test);

    }
    public void nextActivity(View v){
        Intent in=new Intent(getApplicationContext(),Points.class);
        in.putExtra("points",points);
        in.putExtra("frames",frames);

        startActivity(in);
    }


}