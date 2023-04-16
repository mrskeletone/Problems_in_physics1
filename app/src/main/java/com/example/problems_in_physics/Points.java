package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Points extends AppCompatActivity {


    private Button button2;
    private String[] npq  ;
    private int i=0;
    private EditText namePoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle=getIntent().getExtras();
        int frames = (int) bundle.get("frames");
        int points = (int) bundle.get("points");
       // Test test= (Test) bundle.getSerializable(Test.class.getSimpleName());
        npq=new String[points-1];
        setContentView(R.layout.activity_points);
        namePoint=findViewById(R.id.name_points);
        button2=findViewById(R.id.button2);
        //namepoint2.setText(test.getOne()+" "+ test.getTwo()+" "+test.getThree());
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String np=namePoint.getText().toString();
            npq[i]=np;
            i++;
            namePoint.setText("");

            }
        });

    }
//    public void add(View view){
//        String np=namePoint.getText().toString();
//        npq[i]=np;
//        i++;
//    }
    public void nextActivity(View v){
        Intent intent=new Intent(this,input_famous_point.class);
        startActivity(intent);
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}