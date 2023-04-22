package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Articulation extends AppCompatActivity {
    int[] frameArticulation1;
    int[] frameArticulation2;
    String[] pointArticulaton;
    int i=0;
    Button button17;
    EditText editTextTextPersonName,editTextTextPersonName2,editTextTextPersonName3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulation);
        button17=findViewById(R.id.button17);
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3=findViewById(R.id.editTextTextPersonName3);
        frameArticulation1=new int[i];
        frameArticulation2=new int[i];
        pointArticulaton=new String[i];
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameArticulation1[i]=Integer.parseInt(editTextTextPersonName.getText().toString());
                frameArticulation2[i]=Integer.parseInt(editTextTextPersonName2.getText().toString());
                pointArticulaton[i]=editTextTextPersonName3.getText().toString();
                i++;
            }
        });
    }
    public void prevActivity(View v){
        Intent intent=new Intent(this,Connections_and_Supports.class);
        intent.putExtra("frameArticulation1",frameArticulation1);
        intent.putExtra("frameArticulation2",frameArticulation2);
        intent.putExtra("pointArticulaton",pointArticulaton);
        startActivity(intent);
    }
}