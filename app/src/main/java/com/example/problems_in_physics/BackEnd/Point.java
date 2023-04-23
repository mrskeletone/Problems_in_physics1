package com.example.problems_in_physics.BackEnd;

public class Point {
  double x;
  double y;
  String name;
  
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point() {
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getX() {
    return x;
  }
  
  public double getY() { return y; }
}
