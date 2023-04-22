package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pivot_support extends AppCompatActivity {
    int[] framePivot;

    String[] pointPivot;
    int i=0;
    Button button19;
    EditText editTextTextPersonName,editTextTextPersonName3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pivot_support);
        button19=findViewById(R.id.button19);
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName3=findViewById(R.id.editTextTextPersonName3);
        framePivot=new int[i];
        pointPivot=new String[i];
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                framePivot[i]=Integer.parseInt(editTextTextPersonName.getText().toString());
                pointPivot[i]=editTextTextPersonName3.getText().toString();
                i++;
            }
        });
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,Connections_and_Supports.class);
        intent.putExtra("pointPivot",pointPivot);
        intent.putExtra("framePivot",framePivot);
        startActivity(intent);
    }
}