package com.example.problems_in_physics.BackEnd;

public class Point {
  public String getNamePoint() {
    return namePoint;
  }

  public void setNamePoint(String namePoint) {
    this.namePoint = namePoint;
  }

  String namePoint;
  double x;
  double y;
  
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point() {
  }

  public Point(String namePoint) {
    this.namePoint = namePoint;
  }

  public double getX() {
    return x;
  }
  
  public double getY() { return y; }
}
