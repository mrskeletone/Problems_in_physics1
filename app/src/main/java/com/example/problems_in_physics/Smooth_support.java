package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Smooth_support extends AppCompatActivity {
    int[] frameSmooth;
    int[] angleSmooth;
    String[] pointSmooth;
    int i=0;
    Button button23;
    EditText editTextTextPersonName,editTextTextPersonName2,editTextTextPersonName3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smooth_support);
        button23=findViewById(R.id.button23);
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3=findViewById(R.id.editTextTextPersonName3);
        frameSmooth=new int[i];
        angleSmooth=new int[i];
        pointSmooth=new String[i];
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameSmooth[i]=Integer.parseInt(editTextTextPersonName.getText().toString());
                angleSmooth[i]=Integer.parseInt(editTextTextPersonName3.getText().toString());
                pointSmooth[i]=editTextTextPersonName2.getText().toString();
                i++;
            }
        });
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,Connections_and_Supports.class);
        intent.putExtra("frameSmooth",frameSmooth);
        intent.putExtra("angleSmooth",angleSmooth);
        intent.putExtra("pointSmooth",pointSmooth);
        startActivity(intent);
    }
}