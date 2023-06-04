package com.example.problems_in_physics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.problems_in_physics.BackEnd.Answer;
import com.example.problems_in_physics.BackEnd.Point;
import com.example.problems_in_physics.BackEnd.Solver;
import com.example.problems_in_physics.BackEnd.Task;

import java.util.Objects;

public class Finish extends AppCompatActivity {
    private int quan_points;
    Task task;
    private  boolean smothSup,smothCon,artic;

    private String[] name_point;
    String[] name_point_Uknow;
    private int[] frames;
    int[] framesUknow;
    private double[] F;
    double[] angleUknow;
    private double[] angle;
    int[] framePivot;
    String[] pointPivot;
    int[] frameArticulation1;
    int[] frameArticulation2;
    String[] pointArticulaton;
    int[] frameSmooth;
    int[] angleSmooth;
    String[] pointSmooth;
    int quan_frame;
    double []Xp;
    double[ ]Yp;
    Point[]points;
    Point[]points_unknow;
    boolean qw;
    String[]full_points;
    TextView textView17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        Bundle bundle=getIntent().getExtras();
        smothCon=bundle.getBoolean("smothCon");
        smothSup=bundle.getBoolean("smothSup");
        artic=bundle.getBoolean("artic");
        quan_points= bundle.getInt("points");
        quan_frame=bundle.getInt("quan_frame");
        name_point= (String[]) bundle.get("pointKnow");
        frames= (int[]) bundle.get("frmKnow");
        F= (double[]) bundle.get("fsKnow");
        angle = (double[]) bundle.get("angleKnow");
        name_point_Uknow= (String[]) bundle.get("pointUknow");
        framesUknow= (int[]) bundle.get("framesUknow");
        angleUknow= (double[]) bundle.get("angleUknow");
        if(smothCon){
        pointPivot= (String[])  bundle.get("pointPivot");
        framePivot= (int[]) bundle.get("framePivot");}
        if(artic){
        frameArticulation1= (int[]) bundle.get("frameArticulation1");
        frameArticulation2= (int[]) bundle.get("frameArticulation2");
        pointArticulaton= (String[]) bundle.get("pointArticulaton");}
        if(smothSup){
        frameSmooth= (int[]) bundle.get("frameSmooth");
        angleSmooth= (int[]) bundle.get("angleSmooth");
        pointSmooth= (String[]) bundle.get("pointSmooth");}
        Xp= (double[]) bundle.get("Xp");
        Yp= (double[]) bundle.get("Yp");
        full_points= (String[]) bundle.get("full_points");
        textView17=findViewById(R.id.textView17);

//        setTask(task);
        task.setBodies(quan_frame);
        points=new Point[full_points.length];
        for(int i=0;i<full_points.length;i++){
            points[i].setX(Xp[i]);
            points[i].setY(Yp[i]);
            points[i].setName(full_points[i]);
        }
        for(int i=0;i<name_point.length;i++){
            for(int j=0;j<full_points.length;j++){
                if(Objects.equals(points[j].getName(), name_point[i])){
                    task.addKnownForce(frames[i],points[j],F[i],angle[i]);
                    break;
                }
            }
        }
        for(int i=0;i<name_point_Uknow.length;i++){
            for(int j=0;j<full_points.length;j++){
                if(Objects.equals(points[j].getName(), name_point_Uknow[i])){
                    if(angleUknow[i]!=0){
                        task.addUnknownForce(framesUknow[i],points[j]);
                    }else {
                        task.addUnknownForceWithKnownAngle(framesUknow[i],points[j],angleUknow[i]);
                    }
                    break;
                }
            }
        }
        if(artic){
            for(int i=0;i<pointArticulaton.length;i++){
                for(int j=0;j<full_points.length;j++){
                    if(Objects.equals(points[j].getName(), pointArticulaton[i])){
                       task.addHingedConnection(frameArticulation1[i],frameArticulation2[i],points[j]);
                        break;
                    }
                }
            }}
        if(smothCon){
            for(int i=0;i<pointPivot.length;i++){
                for(int j=0;j<full_points.length;j++){
                    if(Objects.equals(points[j].getName(), pointPivot[i])){
                        task.addHingedSupport(framePivot[i],points[j]);
                        break;
                    }
                }
            }}
        if(smothSup){
            for(int i=0;i<pointSmooth.length;i++){
                for(int j=0;j<full_points.length;j++){
                    if(Objects.equals(points[j].getName(), pointSmooth[i])){
                        task.addSmoothSupport(frameSmooth[i],points[j],angleSmooth[i]);
                        break;
                    }
                }
            }}
        Solver solver=new Solver(task);
       textView17.setText( solver.printAnswer());
    }
    public void nextStart(View view){
        Intent intent =new Intent(this,MainActivity.class);

        startActivity(intent);
    }
    public  void  setTask(Task task){
//        this.task.setBodies(quan_frame);
//        points=new Point[full_points.length];
//        for(int i=0;i<full_points.length;i++){
//            points[i].setX(Xp[i]);
//            points[i].setY(Yp[i]);
//            points[i].setName(full_points[i]);
//        }
//        for(int i=0;i<name_point.length;i++){
//            for(int j=0;j<full_points.length;j++){
//                if(Objects.equals(points[j].getName(), name_point[i])){
//                    this.task.addKnownForce(frames[i],points[j],F[i],angle[i]);
//                    break;
//                }
//            }
//        }
//        for(int i=0;i<name_point_Uknow.length;i++){
//            for(int j=0;j<full_points.length;j++){
//                if(Objects.equals(points[j].getName(), name_point_Uknow[i])){
//                    if(angleUknow[i]!=0){
//                        this.task.addUnknownForce(framesUknow[i],points[j]);
//                    }else {
//                        this.task.addUnknownForceWithKnownAngle(framesUknow[i],points[j],angleUknow[i]);
//                    }
//                    break;
//                }
//            }
//        }
//        if(artic){
//            for(int i=0;i<pointArticulaton.length;i++){
//            for(int j=0;j<full_points.length;j++){
//                if(Objects.equals(points[j].getName(), pointArticulaton[i])){
//                    this.task.addHingedConnection(frameArticulation1[i],frameArticulation2[i],points[j]);
//                    break;
//                }
//            }
//        }}
//        if(smothCon){
//            for(int i=0;i<pointPivot.length;i++){
//            for(int j=0;j<full_points.length;j++){
//                if(Objects.equals(points[j].getName(), pointPivot[i])){
//                    this.task.addHingedSupport(framePivot[i],points[j]);
//                    break;
//                }
//            }
//        }}
//        if(smothSup){
//            for(int i=0;i<pointSmooth.length;i++){
//            for(int j=0;j<full_points.length;j++){
//                if(Objects.equals(points[j].getName(), pointSmooth[i])){
//                    this.task.addSmoothSupport(frameSmooth[i],points[j],angleSmooth[i]);
//                    break;
//                }
//            }
//        }}
    }
}