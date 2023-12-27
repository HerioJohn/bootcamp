package box;

import java.util.ArrayList;

public class Shape {

  public double area() {
    return -1.0;
  }

  // Static Method: Sum Up all area from the class obbjects (circle / Square)
  public static <T extends Shape> double area(List<T> shapes) {

    shapes.add(new Circle(0));
    shapes.add(new Square(0));

  public static double area2(List<Shape> shapes) {

  }

  public static void main(String[] args) {
    List<Circle> circles = new ArrayList<>();
    circles.add(new Circle(3.0));
    circles.add(new Circle(4.0));
    System.out.println(area1(circles));
  }
    
  }

}
