package ru.stqa.pft.sandbox;

import static ru.stqa.pft.sandbox.Point.distance;

public class MyFirstProgram {

  public static void main(String[] args) {
    Point p1 = new Point(2,1);
    Point p2 = new Point(6,4);
    System.out.println("Расстояние между точками равно "+distance(p1,p2));
  }
}