package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.problems_in_physics.BackEnd.Point;
import com.example.problems_in_physics.BackEnd.Task;

public class input_famous_point extends AppCompatActivity {
    private Button button4;
    int fq;
    private Point np=new Point();
    private EditText textView8,frame,F_X_f,F_y;
    private Bundle bundle=getIntent().getExtras();
    private Task taskMain=(Task) bundle.getSerializable(Task.class.getSimpleName());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_famous_point_power);

        button4=findViewById(R.id.button4);
        textView8=findViewById(R.id.textView8);
        frame=findViewById(R.id.frame);
        F_X_f=findViewById(R.id.F_X_f);
        F_y=findViewById(R.id.F_y);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 np.setNamePoint(textView8.getText().toString());
                int fr=Integer.parseInt(frame.getText().toString());
                double F=Double.parseDouble(F_X_f.getText().toString());
                double angle=Double.parseDouble(F_y.getText().toString());
                taskMain.addKnownForce(fr,np,F,angle);
                textView8.setText("");
                frame.setText("");
                F_X_f.setText("");
                F_y.setText("");
            }
        });
    }
    public void nextActivity(View v){
        Intent intent=new Intent(this,Unknow_values.class);
     //   intent.putExtra(Task.class.getSimpleName(),taskMain);
        startActivity(intent);
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}